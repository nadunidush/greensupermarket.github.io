<%-- 
    Document   : EditHousehold
    Created on : Dec 29, 2023, 2:33:25 PM
    Author     : betcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Household</title>
</head>

<body>
    <h1>Edit Household</h1>

    <%
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

        String householdId = request.getParameter("householdId");
        String query = "select * from household where householdid = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, householdId);
        rs = pst.executeQuery();

        if (rs.next()) {
    %>

    <form action="updateHousehold" method="post">
        <input type="hidden" name="householdId" value="<%= rs.getString("householdid") %>">
        <label for="householdName">Household Name:</label>
        <input type="text" id="householdName" name="householdName" value="<%= rs.getString("household_name") %>" required><br>

        <label for="householdQuantity">Household Quantity:</label>
        <input type="text" id="householdQuantity" name="householdQuantity" value="<%= rs.getString("household_quantity") %>" required><br>

        <label for="householdPrice">Household Price:</label>
        <input type="text" id="householdPrice" name="householdPrice" value="<%= rs.getString("household_price") %>" required><br>

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
