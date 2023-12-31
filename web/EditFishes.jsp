<%-- 
    Document   : EditFishes
    Created on : Dec 24, 2023, 1:54:57 PM
    Author     : betcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Fish</title>
</head>

<body>
    <h1>Edit Fish</h1>

    <%
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

        String fishId = request.getParameter("fishId");
        String query = "select * from fish where fishid = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, fishId);
        rs = pst.executeQuery();

        if (rs.next()) {
    %>

    <form action="updateFishes" method="post">
        <input type="hidden" name="fishId" value="<%= rs.getString("fishid") %>">
        <label for="fishName">Fish Name:</label>
        <input type="text" id="vegetableName" name="fishName" value="<%= rs.getString("fish_name") %>" required><br>

        <label for="fishQuantity">Fish Quantity:</label>
        <input type="text" id="vegetableQuantity" name="fishQuantity" value="<%= rs.getString("fish_quantity") %>" required><br>

        <label for="fishPrice">Fish Price:</label>
        <input type="text" id="vegetablePrice" name="fishPrice" value="<%= rs.getString("fish_price") %>" required><br>

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
