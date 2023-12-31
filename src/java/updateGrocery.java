/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author betcom
 */
public class updateGrocery extends HttpServlet {

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
            out.println("<title>Servlet updateGrocery</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateGrocery at " + request.getContextPath() + "</h1>");
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
        Connection con = null;
        PreparedStatement pst = null;

        try {
            // Retrieve parameters from the request
            String groceryId = request.getParameter("groceryId");
            String groceryName = request.getParameter("groceryName");
            String groceryQuantity = request.getParameter("groceryQuantity");
            String groceryPrice = request.getParameter("groceryPrice");

            // Establish a database connection
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

            // Prepare the SQL update statement
            String query = "UPDATE grocery SET grocery_name=?, grocery_quantity=?, grocery_price=? WHERE groceryid=?";
            pst = con.prepareStatement(query);
            pst.setString(1, groceryName);
            pst.setString(2, groceryQuantity);
            pst.setString(3, groceryPrice);
            pst.setString(4, groceryId);

            // Execute the update statement
            int rowsUpdated = pst.executeUpdate();

            if (rowsUpdated > 0) {
                // Update successful
                System.out.println("Grocery updated successfully!");
            } else {
                // No rows were updated, handle accordingly
                System.out.println("No grocery updated. Check the grocery ID.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(); // Handle the exception appropriately
        } finally {
            // Close resources in the finally block
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }
        }

        // Redirect back to the page displaying all vegetables
        response.sendRedirect("adminAllGrocery.jsp");

    }


}
