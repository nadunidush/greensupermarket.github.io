<%-- 
    Document   : EditFruits
    Created on : Dec 21, 2023, 9:48:00 PM
    Author     : betcom
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Fruit</title>
</head>

<body>
    <h1>Edit Fruit</h1>

    <%
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

        String fruitId = request.getParameter("fruitId");
        String query = "select * from fruits where fruitid = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, fruitId);
        rs = pst.executeQuery();

        if (rs.next()) {
    %>

    <form action="updateFruits" method="post">
        <input type="hidden" name="fruitId" value="<%= rs.getString("fruitid") %>">
        <label for="fruitName">Fruit Name:</label>
        <input type="text" id="fruitName" name="fruitName" value="<%= rs.getString("fruit_name") %>" required><br>

        <label for="fruitQuantity">Fruit Quantity:</label>
        <input type="text" id="fruitQuantity" name="fruitQuantity" value="<%= rs.getString("fruit_quantity") %>" required><br>

        <label for="fruitPrice">Fruit Price:</label>
        <input type="text" id="fruitPrice" name="fruitPrice" value="<%= rs.getString("fruit_price") %>" required><br>

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
