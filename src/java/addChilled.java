/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;
import javax.servlet.*;
import java.io.InputStream;
import java.sql.*;


/**
 *
 * @author betcom
 */
@MultipartConfig(maxFileSize =16*1024*1024)
public class addChilled extends HttpServlet {

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
            out.println("<title>Servlet addChilled</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addChilled at " + request.getContextPath() + "</h1>");
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
        
        String chilled_name = request.getParameter("chilled_name");
        String chilled_quantity = request.getParameter("chilled_quantity");
        int chilled_price =Integer.parseInt(request.getParameter("chilled_price"));
        Part filePart = request.getPart("fileContent");
        InputStream filecontentInput = filePart.getInputStream();
        
        
        
        try{
            Connection con;
            PreparedStatement pst;
            ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket","root","");
            pst = con.prepareStatement("insert into chilled(chilled_name,chilled_quantity,chilled_price,file_photo)values(?,?,?,?)");
            pst.setString(1,chilled_name);
            pst.setString(2,chilled_quantity);
            pst.setInt(3,chilled_price);
            pst.setBlob(4,filecontentInput);
            pst.executeUpdate();
            
            String query = "select * from chilled";
            rs = pst.executeQuery(query);
            while(rs.next())
            {
                response.sendRedirect("adminAllChilled.jsp");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
