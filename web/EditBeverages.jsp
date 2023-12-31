<%-- 
    Document   : EditBeverages
    Created on : Dec 24, 2023, 8:42:20 PM
    Author     : betcom
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Beverages</title>
</head>

<body>
    <h1>Edit Beverages</h1>

    <%
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

        String beverageId = request.getParameter("beverageId");
        String query = "select * from  beverages where beverageid = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, beverageId);
        rs = pst.executeQuery();

        if (rs.next()) {
    %>

    <form action="updateBeverages" method="post">
        <input type="hidden" name="beverageId" value="<%= rs.getString("beverageid") %>">
        <label for="beverageName">Beverage Name:</label>
        <input type="text" id="beverageName" name="beverageName" value="<%= rs.getString("beverage_name") %>" required><br>

        <label for="beverageQuantity">Beverage Quantity:</label>
        <input type="text" id="beverageQuantity" name="beverageQuantity" value="<%= rs.getString("beverage_quantity") %>" required><br>

        <label for="beveragePrice">Beverage Price:</label>
        <input type="text" id="beveragePrice" name="beveragePrice" value="<%= rs.getString("beverage_price") %>" required><br>

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

