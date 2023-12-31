<%-- 
    Document   : EditHomeware
    Created on : Dec 29, 2023, 9:09:08 AM
    Author     : betcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Homeware</title>
</head>

<body>
    <h1>Edit Homeware</h1>

    <%
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

        String homewareId = request.getParameter("homewareId");
        String query = "select * from homeware where homewareid = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, homewareId);
        rs = pst.executeQuery();

        if (rs.next()) {
    %>

    <form action="updateHomeware" method="post">
        <input type="hidden" name="homewareId" value="<%= rs.getString("homewareid") %>">
        <label for="homewareName">Homeware Name:</label>
        <input type="text" id="vegetableName" name="homewareName" value="<%= rs.getString("homeware_name") %>" required><br>

        <label for="homewareQuantity">Homeware Quantity:</label>
        <input type="text" id="vegetableQuantity" name="homewareQuantity" value="<%= rs.getString("homeware_quantity") %>" required><br>

        <label for="homewarePrice">Homeware Price:</label>
        <input type="text" id="vegetablePrice" name="homewarePrice" value="<%= rs.getString("homeware_price") %>" required><br>

        <input type="submit" value="Update">
    </form>

    <%
        }

        rs.close();
        pst.close();
        con.close();
    %>

</body>
</html>

