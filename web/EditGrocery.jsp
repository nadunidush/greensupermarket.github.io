<%-- 
    Document   : EditGrocery
    Created on : Dec 28, 2023, 11:15:45 PM
    Author     : betcom
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Grocery</title>
</head>

<body>
    <h1>Edit Grocery</h1>

    <%
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

        String groceryId = request.getParameter("groceryId");
        String query = "select * from grocery where groceryid = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, groceryId);
        rs = pst.executeQuery();

        if (rs.next()) {
    %>

    <form action="updateGrocery" method="post">
        <input type="hidden" name="groceryId" value="<%= rs.getString("groceryid") %>">
        <label for="groceryName">Vegetable Name:</label>
        <input type="text" id="vegetableName" name="groceryName" value="<%= rs.getString("grocery_name") %>" required><br>

        <label for="groceryQuantity">Vegetable Quantity:</label>
        <input type="text" id="vegetableQuantity" name="groceryQuantity" value="<%= rs.getString("grocery_quantity") %>" required><br>

        <label for="groceryPrice">Vegetable Price:</label>
        <input type="text" id="vegetablePrice" name="groceryPrice" value="<%= rs.getString("grocery_price") %>" required><br>

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
