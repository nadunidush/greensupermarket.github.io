<%-- 
    Document   : navbar
    Created on : Dec 24, 2023, 5:08:37 PM
    Author     : betcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>navbar</title>
        <style>
            *{
            font-family: 'Montserrat', sans-serif;}
            .nav{margin-bottom: 25px}
            .nav-bar{display: grid; grid-template-columns:repeat(12, 1fr);list-style-type: none;align-items: center; justify-content: center;}
            .navfruit{margin-left: 15px}
            .navbaverage{margin-right: 40px}
            .navfrozen{margin-right: 20px}
            .navhomware{margin-right: 20px}
            .navhousehold{margin-right: 20px}
            .nav ul li a{text-decoration: none;color:green;font-weight: 600;margin-bottom: 30px; font-size: 16px}
            .nav ul li{gap-column:40px; border: 1px solid black; border-radius: 10px;text-align: center;padding: 15px 8px;margin-left: 8px}
            .sign{margin-left:0px;}
        </style>
    <body>
        <div class="nav">

        <ul class="nav-bar">
            <li><a href="userHomePage.jsp">Home</a></li>
            <li><a href="userVegetables.jsp">Vegetables</a></li>
            <li><a href="userFruits.jsp" class="navfruit">Fruits</a></li>
            <li><a href="userMeats.jsp">Meats</a></li>
            <li><a href="userFishes.jsp">Fish</a></li>
            <li><a href="userBeverages.jsp" class="navbaverage">Beverages</a></li>
            <li><a href="userChilled.jsp">Chilled</a></li>
            <li><a href="userFrozen.jsp" class="navfrozen">FrozenFood</a></li>
            <li><a href="userGrocery.jsp">Grocery</a></li>
            <li><a href="userHomeware.jsp" class="navhomware">Homeware</a></li>
            <li><a href="userHousehold.jsp" class="navhousehold">Household</a></li>
            <li><a href="index.jsp"><i class="fa fa-user-circle-o" aria-hidden="true"></i><span class="sign">Sign Out</span></a></li>
        </ul>
        
    </div>
    </body>
</html>
