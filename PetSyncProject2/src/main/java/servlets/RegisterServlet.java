package servlets;

import doa.ApplicationDAO;
import model.User;
import roles.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.UUID;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private ApplicationDAO dao;

    @Override
    public void init() throws ServletException {
        dao = new ApplicationDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String roleName = request.getParameter("role");

        // Create the new user object
        User newUser = new User();
        newUser.setUserID(UUID.randomUUID());
        newUser.setFullName(fullName);
        newUser.setEmail(email);
        newUser.setPassword(password);

        // Assign role based on roleName
        if (roleName != null) {
            switch (roleName.toLowerCase()) {
                case "admin":
                    newUser.setRole(new Admin(fullName));
                    break;
                case "vet":
                    newUser.setRole(new Vet(fullName));
                    break;
                case "vettech":
                    newUser.setRole(new VetTech(fullName));
                    break;
                case "volunteer":
                    newUser.setRole(new Volunteer(fullName));
                    break;
                case "applicant":
                    newUser.setRole(new Applicant(fullName));
                    break;
                default:
                    newUser.setRole(new Volunteer(fullName)); // default role fallback
                    break;
            }
        } else {
            newUser.setRole(new Volunteer(fullName)); // default if role is null
        }

        newUser.setRoleName(newUser.getRole().getRoleName());

        // Save the new user
        dao.createUser(newUser);

        // Forward to login page with success message
        request.setAttribute("message", "Registration successful! You can now log in.");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
