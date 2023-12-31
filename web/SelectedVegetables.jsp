<%-- 
    Document   : cart
    Created on : Dec 18, 2023, 5:31:41 PM
    Author     : betcom
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.fasterxml.jackson.databind.ObjectMapper" %>

<html>
<head>
    <meta charset="UTF-8">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Selected Vegetables</title>
    <style>
        *{
            margin: 0;
            padding: 0;
            font-family: 'Montserrat', sans-serif;
        }
        body{
            background-color: #F5F5DC;
        }
        .cartheadingh{
            margin-top: 30px;
            text-align: center;
        }
        .cartheadingp{
            margin-top: 20px;
            margin-left: 250px;
        }
        .Buyatotal{
            display:flex;
            align-items: center;
            gap:50px;
            margin-left: 760px;
            margin-top: 30px;
        }
        .Buyatotal input{
            padding:9px 30px;
            background-color: #4CBB17;
            outline: none;
            border:none;
            border-radius: 5px;
            cursor: pointer;
            font-weight: 600;
        }
        .selecteditems{
            margin-left: 250px;
            margin-top: 20px;
            text-align: center;
            border-collapse: collapse;
            border-spacing: 0;
            border-radius: 12px 12px 0px 0px;
            overflow: hidden;
            box-shadow: 0px 2px 5px rgba(32,32,32,.3);
        }
        .selecteditems th,td{
            padding: 12px 15px;
        }
        .selecteditems th{
            background-color: lightblue;
        }
        .selecteditems tr:nth-child(odd){
            background-color: #eeeeee;
        }
        .selecteditems button{
            padding:2px 15px;
            font-weight: 900;
        }
        .delete{
            padding: 4px 20px;
            background-color: red;
            border-radius: 3px;
            outline: none;
            border:none;
            cursor: pointer;
            font-weight: 500;
        }
        .vegempty{
            margin-left: 250px;
        }
    </style>
</head>
<body>
    <h1 class="cartheadingh">Cart Items</h1>

    <%-- Retrieve selected vegetables from session and convert JSON string to a list --%>
    <%
        List<Map<String, String>> selectedVegetables = (List<Map<String, String>>) session.getAttribute("selectedVegetables");
    %>
    <%-- Display total count of selected vegetables --%>
    <p class="cartheadingp">Total Items: <%= (selectedVegetables != null) ? selectedVegetables.size() : 0 %></p>
    <%-- Display selected vegetables with delete buttons --%>
    <table class="selecteditems">
        <tr>
            <th>Vegetable Name</th>
            <th>Vegetable Quantity</th>
            <th>Decrease</th>
            <th>Vegetable Price</th>
            <th>Increase</th>
            <th>Delete</th>
        </tr>
        <%-- Check if the list is empty and display a message --%>
        <% if (selectedVegetables == null || selectedVegetables.isEmpty()) { %>
        <p class="vegempty">Selected Items are Empty</p>
        <% } else { %>
        <%
            double totalAmount = 0.0;
            for (int i = 0; i < selectedVegetables.size(); i++) {
                double price = Double.parseDouble(selectedVegetables.get(i).get("price"));
                totalAmount += price;
        %>
            <tr>
                <td><%= selectedVegetables.get(i).get("name") %></td>
                <td><%= selectedVegetables.get(i).get("quantity") %></td>
                <td><button onclick="updatePrice('<%= i %>', 'decrease')">-</button></td>
                <td>Rs.<span id="price_<%= i %>"><%= selectedVegetables.get(i).get("price") %></span></td>
                <td><button onclick="updatePrice('<%= i %>', 'increase')">+</button></td>
                <td>
                    <form action="deleteVegetable" method="post">
                        <input type="hidden" name="vegetableIndex" value="<%= i %>">
                        <input type="submit" name="delete" value="Delete" class="delete">
                    </form>
                </td>
            </tr>
        <% } %>
    </table>
    <div class="Buyatotal">
        <p>Total Amount: Rs.<span id="totalAmount"><%= totalAmount %></span></p>
        <form action="buyItems" method="post">
            <input type="submit" name="buy" value="Buy">
        </form>
    </div>
        <script>
            function updatePrice(index, operation) {
                
                var priceElement = document.getElementById("price_" + index);
                var totalAmountElement = document.getElementById("totalAmount");

                // Get the current price value
                var currentPrice = parseFloat(priceElement.innerText);

                // Set the minimum allowed price
                var minPrice = parseFloat('<%= selectedVegetables.get(0).get("price") %>');

                // Update the price based on the operation, with a check for the minimum price
                if (operation === 'increase') {
                    currentPrice *= 2; // Double the price
                } else if (operation === 'decrease' && currentPrice > minPrice) {
                    currentPrice /= 2; // Reduce the price by half
                    
                     currentPrice = Math.max(currentPrice, minPrice);
                }

                // Update the displayed price
                priceElement.innerText = currentPrice.toFixed(2);

                // Update the total amount
                var totalAmount = 0.0;
                <% for (int i = 0; i < selectedVegetables.size(); i++) { %>
                    totalAmount += parseFloat(document.getElementById("price_<%= i %>").innerText);
                <% } %>
                totalAmountElement.innerText = totalAmount.toFixed(2);
            }
        </script>




    <% } %>
</body>
</html>



