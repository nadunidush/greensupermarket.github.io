<%-- 
    Document   : adminHomePag
    Created on : Dec 17, 2023, 9:23:39 PM
    Author     : betcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <title>Admin Home Page</title>
        <style>
            *{
            margin: 0;
            padding: 0;
            font-family: 'Montserrat', sans-serif;
            }
            .maniCatagories{
                margin: 0;
                display: grid;
                grid-template-columns: 1fr 1fr 1fr 1fr;
                place-items: center;
                height: 100vh;
            }
            .items{
                width: auto;
                height: auto;
                border: 1px solid gray;
                padding: 20px;
                background: linear-gradient(to bottom, #ffffff, #e0e0ff);
                font-size: 25px;
                font-weight: 600;
                cursor: pointer;
            }
        </style>
</head>
<body>
    <div class="maniCatagories">
        <div class="Vegetables items" onclick="navigateToVegetables('adminAllVegetables.jsp')">
            <p>Vegetables</p>
        </div>
        <div class="Fruits items" onclick="navigateToVegetables('adminAllFruits.jsp')">
            <p>Fruits</p>
        </div>
        <div class="Meat items" onclick="navigateToVegetables('adminAllMeats.jsp')">
            <p>Meat</p>
        </div>
        <div class="Fish items" onclick="navigateToVegetables('adminAllFishes.jsp')">
            <p>Fish</p>
        </div>
        <div class="Beverages items" onclick="navigateToVegetables('adminAllBeverages.jsp')">
            <p>Beverages</p>
        </div>
        <div class="Chilled items" onclick="navigateToVegetables('adminAllChilled.jsp')">
            <p>Chilled</p>
        </div>
        <div class="FrozenFood items" onclick="navigateToVegetables('adminAllFrozens.jsp')">
            <p>FrozenFood</p>
        </div>
        <div class="Grocery items" onclick="navigateToVegetables('adminAllGrocery.jsp')">
            <p>Grocery</p>
        </div>
        <div class="Homeware items" onclick="navigateToVegetables('adminAllHomeware.jsp')">
            <p>Homeware</p>
        </div>
        <div class="Household items" onclick="navigateToVegetables('adminAllHousehold.jsp')">
            <p>Household</p>
        </div>
    </div>

    <script>
        function navigateToVegetables(page) {
          window.location.href = page;
        }
      </script>
</body>
</html>
