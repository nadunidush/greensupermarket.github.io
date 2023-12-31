/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author betcom
 */
public class deleteVegetable extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet deleteVegetable</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet deleteVegetable at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the vegetable index to be deleted
        int vegetableIndexToDelete = Integer.parseInt(request.getParameter("vegetableIndex"));

        // Retrieve the existing list of selected vegetables from the session
        List<Map<String, String>> selectedVegetables = (List<Map<String, String>>) request.getSession().getAttribute("selectedVegetables");

        // Remove the vegetable with the specified index
        if (selectedVegetables != null && vegetableIndexToDelete >= 0 && vegetableIndexToDelete < selectedVegetables.size()) {
            selectedVegetables.remove(vegetableIndexToDelete);

            // Save the updated list back to the session
            request.getSession().setAttribute("selectedVegetables", selectedVegetables);
        }

        // Redirect back to the SelectedVegetables.jsp
        response.sendRedirect("SelectedVegetables.jsp");
    }

}
