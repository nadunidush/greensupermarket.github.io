<%-- 
    Document   : EditVegetables
    Created on : Dec 20, 2023, 9:01:15 PM
    Author     : betcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Vegetable</title>
</head>

<body>
    <h1>Edit Vegetable</h1>

    <%
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

        String vegetableId = request.getParameter("vegetableId");
        String query = "select * from vegetables where id = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, vegetableId);
        rs = pst.executeQuery();

        if (rs.next()) {
    %>

    <form action="updateVegetbales" method="post">
        <input type="hidden" name="vegetableId" value="<%= rs.getString("id") %>">
        <label for="vegetableName">Vegetable Name:</label>
        <input type="text" id="vegetableName" name="vegetableName" value="<%= rs.getString("vegetable_name") %>" required><br>

        <label for="vegetableQuantity">Vegetable Quantity:</label>
        <input type="text" id="vegetableQuantity" name="vegetableQuantity" value="<%= rs.getString("vegetable_quantity") %>" required><br>

        <label for="vegetablePrice">Vegetable Price:</label>
        <input type="text" id="vegetablePrice" name="vegetablePrice" value="<%= rs.getString("vegetable_price") %>" required><br>

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
