<%-- 
    Document   : viewFruitImage
    Created on : Dec 21, 2023, 10:15:18 PM
    Author     : betcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page import="java.io.OutputStream"%>

<%
    Blob image=null;
    Connection con = null;
    byte[] imgData = null;
    Statement stmt = null;
    ResultSet rs = null;
    String id = request.getParameter("fruitid");
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket","root","");
        stmt = con.createStatement();
        rs = stmt.executeQuery("select file_photo from  fruits where fruitid='"+id+"' ");
        if(rs.next()){
            image = rs.getBlob(1);
            imgData = image.getBytes(1,(int) image.length());
        }
        else{
            out.println("Display Fruit Eample");
            return;
        }
        response.setContentType("image/gif");
        OutputStream o = response.getOutputStream();
        o.write(imgData);
        o.flush();
        o.close();
    }
    catch(Exception e){
        out.println("Unable to diplay image");
        out.println("Image Display Error="+e.getMessage());
        return;
    }
    finally{
        try{
            rs.close();
            stmt.close();
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
%>