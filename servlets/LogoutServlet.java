package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        // End the session
        HttpSession session = request.getSession(false); // false = don't create if it doesn't exist
        if (session != null) {
            session.invalidate();
        }

        // Redirect to login page
        response.sendRedirect("login.jsp");
    }
}
