/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.Part;

/**
 *
 * @author betcom
 */
public class addCart extends HttpServlet {

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
            out.println("<title>Servlet addCart</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addCart at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // Retrieve parameters from the form
        String vegetableName = request.getParameter("vegetable_name");
        String vegetableQuantity = request.getParameter("vegetable_quantity");
        String vegetablePrice = request.getParameter("vegetable_price");

        // Add the selected vegetable to the session or database as needed
        // For demonstration purposes, let's assume you add it to the session
        // You might want to add it to the database instead

        // Retrieve the existing list of selected vegetables from the session
        List<Map<String, String>> selectedVegetables = (List<Map<String, String>>) request.getSession().getAttribute("selectedVegetables");

        // If no list exists, create a new one
        if (selectedVegetables == null) {
            selectedVegetables = new ArrayList<>();
        }

        // Add the current vegetable to the list
        Map<String, String> vegetable = new HashMap<>();
        vegetable.put("name", vegetableName);
        vegetable.put("quantity", vegetableQuantity);
        vegetable.put("price", vegetablePrice);
        selectedVegetables.add(vegetable);

        // Save the updated list back to the session
        request.getSession().setAttribute("selectedVegetables", selectedVegetables);

        // Redirect to a new page to display the selected vegetables
        response.sendRedirect("SelectedVegetables.jsp");
    }

}
