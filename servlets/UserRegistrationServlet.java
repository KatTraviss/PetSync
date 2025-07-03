package servlets;

import dao.ApplicationDAO;
import model.User;
import roles.Volunteer; //  default role

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.UUID;

@WebServlet("/register")
public class UserRegistrationServlet extends HttpServlet {

    private ApplicationDAO dao;

    @Override
    public void init() throws ServletException {
        dao = new ApplicationDAO(); //  handle DB operations
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get form params
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String roleName = request.getParameter("role"); //  allow user to choose role

        // Basic validation
        if (fullName == null || email == null || password == null ||
            fullName.isEmpty() || email.isEmpty() || password.isEmpty()) {
            request.setAttribute("errorMessage", "All fields are required.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
            return;
        }

        // Create user ID and User object
        UUID userID = UUID.randomUUID();

        User newUser = new User();
        newUser.setUserID(userID);
        newUser.setFullName(fullName);
        newUser.setEmail(email);
        newUser.setPassword(password);
        newUser.setRoleName(roleName != null ? roleName : "Volunteer");

        // Save user to DB
        dao.createUser(newUser);

        // Redirect to login page after registration
        response.sendRedirect("login.jsp");
    }
}
