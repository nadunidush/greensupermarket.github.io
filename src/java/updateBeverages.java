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
public class updateBeverages extends HttpServlet {

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
            out.println("<title>Servlet updateBeverages</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateBeverages at " + request.getContextPath() + "</h1>");
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
            String beverageId = request.getParameter(" beverageId");
            String beverageName = request.getParameter("beverageName");
            String beverageQuantity = request.getParameter("beverageQuantity");
            String beveragePrice = request.getParameter("beveragePrice");

            // Establish a database connection
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

            // Prepare the SQL update statement
            String query = "UPDATE beverages SET beverage_name=?, beverage_quantity=?, beverage_price=? WHERE beverageid=?";
            pst = con.prepareStatement(query);
            pst.setString(1, beverageName);
            pst.setString(2, beverageQuantity);
            pst.setString(3, beveragePrice);
            pst.setString(4, beverageId);

            // Execute the update statement
            int rowsUpdated = pst.executeUpdate();

            if (rowsUpdated > 0) {
                // Update successful
                System.out.println("Beverage updated successfully!");
            } else {
                // No rows were updated, handle accordingly
                System.out.println("No beverage updated. Check the beverage ID.");
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
        response.sendRedirect("adminAllBeverages.jsp");
    }

    

}
