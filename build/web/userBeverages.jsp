<%-- 
    Document   : userBeverages
    Created on : Dec 24, 2023, 9:06:58 PM
    Author     : betcom
--%>


<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.io.File"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>

<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*, javax.servlet.annotation.*" %>
<%@page import="javax.servlet.annotation.MultipartConfig" %>
<%@page import="java.io.InputStream" %>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Beverages</title>
        <style>


            *{
                margin: 0;
                padding: 0;
                font-family: 'Montserrat', sans-serif;
            }
            body{
                padding:30px 40px;
            }
            .cartHeader{
                margin-top: -80px;
                float: right;
                display: flex;
                justify-content: space-between;
                align-items: center;
                padding: 7px 10px;
                border-radius: 3px;
                width: 80px;
            }   
            .HeadingVege{
                margin-bottom: 30px;
                margin-left: 55px;
            }
            .item{width:150px;padding:10px;border:solid 5px ghostwhite;}
            .img { width:150px;border-bottom: solid 3px #c4cfce;height:150px;padding-bottom: 5px;cursor: pointer}




            .grid-container{display:grid; grid-template-columns: auto auto auto auto auto; column-gap:50px; gap:15px;margin-left: 50px  ;}

            .cart a{ text-decoration:none; color:black;}
            .cart{border:solid 3px #c4cfce;text-align: center; padding:5px;cursor: pointer;width:150px }
            .item:hover{border:solid 3px#81e096;}
            .price{color:#eda702; font-weight: 600;}
            .name{color:#156e21; font-weight:600; font-size:20px}
            .qty{font-weight:500;font-size:15px}
            .cart:hover{padding:5px;background-color:green;width:150px;text-align:center;color:aliceblue}
            .cart a:hover{color:aliceblue}
        </style>
    </head>
    
    <body>
        <jsp:include page="navbar.jsp" />
        <h1 class="HeadingVege">Beverages</h1>
        <%-- Retrieve selected vegetables from session and convert JSON string to a list --%>
        <%
            List<Map<String, String>> selectedVegetables = (List<Map<String, String>>) session.getAttribute("selectedVegetables");
        %>
        <div class="cartHeader">
            <a href="SelectedVegetables.jsp">
                <img src="images/Cart.png" alt="Cart" width="50" height="50">
            </a>
            <p><%= (selectedVegetables != null) ? selectedVegetables.size() : 0 %></p>
        </div>
        <div class="grid-container">
        <%
            Connection con;
            PreparedStatement pst;
            ResultSet rs;
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket","root","");
            
            String query = "select * from beverages";
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
                String id = rs.getString("beverageid");
                 
        %>
        
        <div class="item">
                <image src="viewBeverageImage.jsp?beverageid=<%=id%>" class="img"/><br>
                <p class="name"><%=rs.getString("beverage_name")%></p>
                <p class="qty"><%=rs.getString("beverage_quantity")%></p>
                <p class="price">Rs. <%=rs.getInt("beverage_price")%></p><br>
                <form action="addCart" method="post">
                    <input type="hidden" name="vegetable_name" value="<%=rs.getString("beverage_name")%>">
                    <input type="hidden" name="vegetable_quantity" value="<%=rs.getString("beverage_quantity")%>">
                    <input type="hidden" name="vegetable_price" value="<%=rs.getInt("beverage_price")%>">
                    <a><input type="submit" name="submit" value="Add Cart" class="cart"></a>
                </form> 
            </div>
         
        
        <%
            }
        %>
        </div>
    </body>
</html>

