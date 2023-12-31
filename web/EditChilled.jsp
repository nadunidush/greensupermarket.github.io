<%-- 
    Document   : EditChilled
    Created on : Dec 25, 2023, 1:07:26 PM
    Author     : betcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Chilled</title>
</head>

<body>
    <h1>Edit Chilled</h1>

    <%
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

        String chilledId = request.getParameter("chilledId");
        String query = "select * from chilled where chilledid = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, chilledId);
        rs = pst.executeQuery();

        if (rs.next()) {
    %>

    <form action="updateChilled" method="post">
        <input type="hidden" name="chilledId" value="<%= rs.getString("chilledid") %>">
        <label for="chilledName">Chilled Name:</label>
        <input type="text" id="chilledName" name="chilledName" value="<%= rs.getString("chilled_name") %>" required><br>

        <label for="chilledQuantity">Vegetable Quantity:</label>
        <input type="text" id="chilledQuantity" name="chilledQuantity" value="<%= rs.getString("chilled_quantity") %>" required><br>

        <label for="chilledPrice">Vegetable Price:</label>
        <input type="text" id="chilledPrice" name="chilledPrice" value="<%= rs.getString("chilled_price") %>" required><br>

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
