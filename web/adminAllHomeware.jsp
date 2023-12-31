<%-- 
    Document   : adminAllHomeware
    Created on : Dec 29, 2023, 8:47:52 AM
    Author     : betcom
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.io.File"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>

<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*, javax.servlet.annotation.*" %>
<%@page import="javax.servlet.annotation.MultipartConfig" %>
<%@page import="java.io.InputStream" %>
<%@page import="java.sql.*" %>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin All Homewares</title>
        <style>
            .vegetablecontent{
                display: grid;
                grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr;
                gap:20px;
            }
            .adminvege{
                border: 1px solid black;
                text-align: center;
                padding: 10px;
            }
            .editadelete{
                display:flex;
                margin-left: 40px;
            }
            .editadelete #delete{
                margin-left: 20px;
            }
            .addvegetable{
                padding: 8px 20px;
                cursor: pointer;
                text-decoration: none;
                color:black;
                margin-bottom: 20px;
            }
            .addvegetable a{
                text-decoration: none;
                color:black;
            }
        </style>
    </head>
    
    <body>
        <h1>All Homeware!</h1>
        <button class="addvegetable"><a href="AddHomeware.jsp">Add a Homeware</a></button>
        <button class="addvegetable"><a href="adminHomePage.jsp">Admin Home Page</a></button>
        <div class="vegetablecontent">
        <%
            Connection con;
            PreparedStatement pst;
            ResultSet rs;
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket","root","");
            
            String query = "select * from homeware";
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
                String id = rs.getString("homewareid");
            
         
                
        %>
        
        <div class="adminvege">
                <image src="viewHomewareImage.jsp?homewareid=<%=id%>" width="100" height="100"/>
                <p><%=rs.getString("homeware_name")%></p>
                <p><%=rs.getString("homeware_quantity")%></p>
                <p><%=rs.getInt("homeware_price")%></p>
                <div class="editadelete">
                    <form action="EditHomeware.jsp" method="post">
                        <input type="hidden" name="homewareId" value="<%= id %>">
                        <input type="submit" name="edit" value="Edit">
                    </form>
                    <form action="adminHomewareDelete" method="post">
                        <input type="hidden" name="homewareId" value="<%= id %>">
                        <input type="submit" name="delete" value="Delete" id="delete">
                    </form>
                </div>
                
            </div>
        
        
        <%
            }
        %>
        </div>
    </body>
</html>
