package servlets;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

import petdata.PetAdoptionStatus;
import petdata.PetDescription;

public class UpdatePetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get form params
        boolean adopted = request.getParameter("adopted") != null;
        boolean adoptable = request.getParameter("adoptable") != null;
        String notes = request.getParameter("notes");

        // Here you would update your backend model or DB accordingly
        // For demo, just print values to console
        System.out.println("Updated Adopted: " + adopted);
        System.out.println("Updated Adoptable: " + adoptable);
        System.out.println("Updated Notes: " + notes);

        // Redirect back to pet.jsp or another page after update
        response.sendRedirect("pet.jsp");
    }
}
