<%-- 
    Document   : EditFrozen
    Created on : Dec 28, 2023, 3:54:34 PM
    Author     : betcom
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Frozen</title>
</head>

<body>
    <h1>Edit Frozen</h1>

    <%
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

        String frozenId = request.getParameter("frozenId");
        String query = "select * from frozenfood where frozenid = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, frozenId);
        rs = pst.executeQuery();

        if (rs.next()) {
    %>

    <form action="updateFrozen" method="post">
        <input type="hidden" name="frozenId" value="<%= rs.getString("frozenid") %>">
        <label for="frozenName">Vegetable Name:</label>
        <input type="text" id="vegetableName" name="frozenName" value="<%= rs.getString("frozen_name") %>" required><br>

        <label for="frozenQuantity">Vegetable Quantity:</label>
        <input type="text" id="vegetableQuantity" name="frozenQuantity" value="<%= rs.getString("frozen_quantity") %>" required><br>

        <label for="frozenPrice">Vegetable Price:</label>
        <input type="text" id="vegetablePrice" name="frozenPrice" value="<%= rs.getString("frozen_price") %>" required><br>

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

