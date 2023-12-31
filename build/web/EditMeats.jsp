<%-- 
    Document   : EditMeats
    Created on : Dec 22, 2023, 12:30:51 PM
    Author     : betcom
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Meat</title>
</head>

<body>
    <h1>Edit Meat</h1>

    <%
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket", "root", "");

        String meatId = request.getParameter("meatId");
        String query = "select * from  meats where meatid = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, meatId);
        rs = pst.executeQuery();

        if (rs.next()) {
    %>

    <form action="updateMeats" method="post">
        <input type="hidden" name="meatId" value="<%= rs.getString("meatid") %>">
        <label for="meatName">Meat Name:</label>
        <input type="text" id="vegetableName" name="meatName" value="<%= rs.getString("meat_name") %>" required><br>

        <label for="meatQuantity">Meat Quantity:</label>
        <input type="text" id="vegetableQuantity" name="meatQuantity" value="<%= rs.getString("meat_quantity") %>" required><br>

        <label for="meatPrice">Meat Price:</label>
        <input type="text" id="vegetablePrice" name="meatPrice" value="<%= rs.getString("meat_price") %>" required><br>

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

