package servlets;

import authentication.LoginManager;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private LoginManager loginManager;

    @Override
    public void init() throws ServletException {
        super.init();
        loginManager = new LoginManager();  // instantiate your LoginManager
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        User user = loginManager.login(email, password);
        
        if (user != null) {
            // Login success - save user info in session
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            
            // Redirect to a dashboard or welcome page (you can create this later)
            response.sendRedirect("dashboard.jsp");
        } else {
            // Login failed - send back to login page with error
            request.setAttribute("errorMessage", "Invalid email or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
