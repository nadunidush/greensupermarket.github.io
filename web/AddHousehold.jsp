<%-- 
    Document   : AddHousehold
    Created on : Dec 29, 2023, 2:04:05 PM
    Author     : betcom
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,javax.servlet.*, javax.servlet.http.*, javax.servlet.annotation.*" %>
<%@page import="javax.servlet.annotation.MultipartConfig" %>
<%@page import="java.io.InputStream" %>
<%@page import="java.sql.*" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <title>Admin HouseHold</title>
    <style>
        *{
            margin: 0;
            padding: 0;
            font-family: 'Montserrat', sans-serif;
        }
        .addVegetablesDiv{
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }
        .addVegetablesDiv table{
            background: linear-gradient(to bottom, #ffffff, #e0e0ff);
            border: 1px solid black;
            padding: 50px;
        }
        .addVegetablesDiv table caption{
            font-size: 29px;
            font-weight: 400;
        }
        .addVegetablesDiv table td{
             padding-top: 20px;
             padding-right: 20px;
        }
        .addVegetablesDiv label{
            font-weight: 600;
            font-size: 18px;
        }
        .addVegetablesDiv input{
            width: 100%;
            padding: 5px;
        }
        #submit,#Clear{
            font-weight: 600;
            padding: 10px;
            width: 50%;
            background-color: lightblue;
            outline: none;
            border: 1px solid gray;
            cursor: pointer;
        }
        .adminpagelink{
            width: 180px;
            margin-left: 600px;
            margin-top: -70px;
            border: 1px solid black;
            background-color: lightblue;
            border-radius: 3px;
            padding: 10px;
        }
        .adminpagelink a{
            color: black;
            text-decoration: none;
       
        }
    </style>
</head>
<body>
    <div class="addVegetablesDiv">
        <table>
            <caption>Add A Household Product</caption>
            <form action="addHousehold" method="post" enctype="multipart/form-data">
                <tr>
                    <td><label for="name">Household Name: </label></td>
                    <td><input type="text" name="household_name" id="household_name"></td>
                </tr>
                <tr>
                    <td><label for="name">Household Quantity(KG,G): </label></td>
                    <td><input type="text" name="household_quantity" id="household_quantity"></td>
                </tr>
                <tr>
                    <td><label for="name">Price: </label></td>
                    <td><input type="text" name="household_price" id="household_price"></td>
                </tr>
                <tr>
                    <td><label for="file">Household Photo: </label></td>
                    <td><input type="file" name="fileContent" id="fileContent"></td>
                </tr>
                <tr>
                    <td><label for="name">Submit: </label></td>
                    <td><input type="submit" value="submit" id="submit" name="submit"></td>
                </tr>
                <tr>
                    <td><label for="name">Clear: </label></td>
                    <td><input type="reset" value="Clear" id="Clear"></td>
                </tr>
                
            </form>
        </table>
        
    </div>
    <div class="adminpagelink">
        <a href="adminHomePage.jsp">Admin Home Page</a>
    </div>
</body>
</html>
