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
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author betcom
 */
public class login extends HttpServlet {

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
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher dispatcher = null;

        
         

         try{
           String email = request.getParameter("email");
           String password = request.getParameter("password");
           HttpSession session= request.getSession();
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/greensupermarket","root","");
           PreparedStatement ps = con.prepareStatement("SELECT * FROM  registrationform WHERE email=? AND password=?");
           PreparedStatement ps2 = con.prepareStatement("select * from loginform");
           PreparedStatement ps3 = con.prepareStatement("insert into loginform(email,password)values(?,?)");
           Statement stmt  = con.createStatement();
           
           ps.setString(1,email );
           ps.setString(2, password);
           ps3.setString(1, email);
           ps3.setString(2, password);
           ps3.executeUpdate();
           //email=rs.getString("email");
            //    password=rs.getString("password");
            //String usemail="email";
           // String uspassword="";
            
           
           
           ResultSet rs = ps.executeQuery();
           
           if(email.equals("admin@123") && password.equals("1234"))
           {
               //dispatcher= request.getRequestDispatcher("index.jsp");
               response.sendRedirect("adminHomePage.jsp");
           }
           if(rs.next()){
               //session.setAttribute("name",rs.getString("email"));
               
               //session.setAttribute("email", email);
               dispatcher= request.getRequestDispatcher("userHomePage.jsp");
                
                
               // email=rs.getString("email");
               // password=rs.getString("password");
                
              // usemail=request.getParameter("email")  ;
                
           }
           
           
           else{
               request.setAttribute("status","failed");
               
           dispatcher= request.getRequestDispatcher("loginForm.jsp");
                 
           
           }
            dispatcher.forward(request, response);
           
          
           
    }
                   

       
       catch  (Exception e){ 
           System.out.println(e);
           
       }
    }


}
