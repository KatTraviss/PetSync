package servlets;

import dao.ApplicationDAO;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private ApplicationDAO dao;

    @Override
    public void init() throws ServletException {
        dao = new ApplicationDAO(); // create DAO instance to access DB
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Get all users from DB 
        Map<UUID, User> users = dao.readUsers();

        User loggedInUser = null;

        // Check email & password against each user
        for (User user : users.values()) {
            if (user.getEmail().equalsIgnoreCase(email) && user.checkPassword(password)) {
                loggedInUser = user;
                break;
            }
        }

        if (loggedInUser != null) {
            // Save user in session
            HttpSession session = request.getSession();
            session.setAttribute("user", loggedInUser);

            // Redirect to dashboard or role-specific page
            response.sendRedirect("dashboard.jsp");
        } else {
            // Invalid login, send back to login page with error
            request.setAttribute("errorMessage", "Invalid email or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
