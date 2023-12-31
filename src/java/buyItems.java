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
import java.sql.*;

/**
 *
 * @author betcom
 */
public class buyItems extends HttpServlet {

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
            out.println("<title>Servlet buyItems</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet buyItems at " + request.getContextPath() + "</h1>");
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
        // Retrieve the selected vegetables from the session
        List<Map<String, String>> selectedVegetables = (List<Map<String, String>>) request.getSession().getAttribute("selectedVegetables");

        if (selectedVegetables != null) {
            // Insert the selected vegetables into the new table in the database
            insertVegetablesIntoDatabase(selectedVegetables);

            // Clear the session after the purchase
            
            
        }

        // Redirect back to the SelectedVegetables.jsp or any other page
        response.sendRedirect("confirmBuyItems.jsp");
    }
    
    private void insertVegetablesIntoDatabase(List<Map<String, String>> vegetables) {
        Connection con = null;
        PreparedStatement pst = null;

        try {
            // Establish database connection
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket","root","");

            // Insert each selected vegetable into the new table
            for (Map<String, String> vegetable : vegetables) {
                String name = vegetable.get("name");
                String quantity = vegetable.get("quantity");
                int price = Integer.parseInt(vegetable.get("price"));

                // Update the SQL query based on your new table structure
                String query = "INSERT INTO buyitems(name, quantity, price) VALUES (?, ?, ?)";
                pst = con.prepareStatement(query);
                pst.setString(1, name);
                pst.setString(2, quantity);
                pst.setInt(3, price);
                pst.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
