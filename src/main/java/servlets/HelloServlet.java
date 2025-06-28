package servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * used to test that the server is running and responding.
 */
@WebServlet("/hello") // Maps servlet to the URL path "/hello"
public class HelloServlet extends HttpServlet {

    /**
     * Handles HTTP GET requests.
     * Sends a simple HTML welcome message as the response.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set the response type to HTML
        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Welcome to Loggy App!</h1>");
    }
}

//References:
//Oracle. (n.d.). Introduction to Java Servlets. Retrieved June 5, 2025, from https://docs.oracle.com/javaee/7/tutorial/servlets.htm
//GeeksforGeeks. (n.d.). Introduction to Java Servlets. Retrieved June 5, 2025, from https://www.geeksforgeeks.org/java/introduction-java-servlets/
//W3Schools. (n.d.). HTML Forms. Retrieved June 5, 2025, from https://www.w3schools.com/html/html_forms.asp
//Federico, J. (2025). Course notes for CST8288: Object-Oriented Programming with Design Patterns. Algonquin College.