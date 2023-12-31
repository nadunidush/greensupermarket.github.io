<%-- 
    Document   : home
    Created on : Dec 24, 2023, 3:39:14 PM
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
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home page</title>
    <link rel="stylesheet" href="index2.css">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/9cede9b0d7.js" crossorigin="anonymous"></script>
    <script src="https://static.elfsight.com/platform/platform.js" data-use-service-core defer></script>
    <style>
        *{
            font-family: 'Montserrat', sans-serif;}
            .nav-bar{display: grid; grid-template-columns:repeat(13, 1fr);list-style-type: none;align-items: center; justify-content: center;}
            .navfruit{margin-left: 15px}
            .navbaverage{margin-right: 40px}
            .navfrozen{margin-right: 20px}
            .navhomware{margin-right: 20px}
            .navhousehold{margin-right: 20px}
            .nav ul li a{text-decoration: none;color:green;font-weight: 600;margin-bottom: 30px;}
            .nav ul li{gap-column:40px;}
            .sign{margin-left:0px;}
            .img-1 img{width:100% ; height:500px;margin-top: 30px; }
            .img-head{font-size:50px;position:absolute;top:120px;margin-left: 700px;color:aliceblue}
            .shop-button a{font-weight:600;color:aliceblue;position:absolute;top:430px;margin-left:705px;font-size: 30px;background-color: #2c6934;padding:10px;border-radius: 5px;text-decoration: none;}
            .img-head2{color:aliceblue;position:absolute;top:360px;margin-left:710px;font-size: 30px;font-weight: 400;}
            
            
            .catogories ul{display:grid;grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr 1fr 1fr 1fr;list-style-type: none;margin-top: 50px;margin-bottom: 50px;}
            .catogories ul li{text-align: center;font-weight: 400;}
            .catogories ul li a{text-decoration: none;font-weight: 500;}
            .img-2{width:120px;height:120px}
            h2{margin-top: 30px;margin-left: 60px;}
 
            .grid-container{display:grid; grid-template-columns: auto auto auto auto auto; column-gap:50px; gap:15px;margin-left: 50px;}
            .item{width:200px;padding:10px;border:solid 5px ghostwhite;height:430px}
            .img { width:200px;border-bottom: solid 3px #c4cfce;height:200px;padding-bottom: 5px;}

            .cart a{ text-decoration:none; color:black}
            .cart{border:solid 3px #c4cfce;text-align: center; padding:5px;position:relative;bottom:20px; }
            .item:hover{border:solid 3px#81e096;}
            .price{color:#eda702; font-weight: 600;}
            .name{color:#156e21; font-weight:600; font-size:20px}
            .qty{font-weight:500;font-size:15px}
            .cart:hover{padding:5px;background-color:green;width:185px;text-align:center;color:aliceblue;cursor:pointer;}
            .cart a:hover{color:aliceblue}

            .img2-head{position:absolute;top:2000px;margin-left: 570px;font-size:30px;font-weight:400;color:#156e21}
            .img2-topic{position:absolute;top:2100px;margin-left: 570px;font-size:50px;font-weight:600}
            .elfsight-app-d5211377-acf2-418e-9c40-acbcec6743f1{position: absolute;bottom:1580px;margin-right: 570px;}


            .grid-item1-topic{color:#bf862a;font-weight:600;font-size:30px}
            .grid-item1-topic2{font-weight: 500;font-size: 30px;}
            .image {width:300px}
            .grid-item1{padding:5px;background-color: #e8d5b7;width:400px;text-align: center;height:650px;border-radius: 5px;margin-top: 50px;}
            .grid-container2{display:grid; grid-template-columns: 2fr 2fr 2fr;margin-top: 50px;}

            .item2-img{width:150px;border-radius: 10px;}
            .grid-item2 p{position:relative;bottom:190px;margin-left: 250px;}

            .grid-item2 li {list-style-type: none;border:solid 2px grey;height: 180px;margin-bottom: 10px;border-radius: 10px;padding:5px}
            .grid-item2 ul {margin-top: 50px;}
            .grid-item2 li:hover{border:solid 3px green}
            .fa-star{color:#eda702;}
            .fa-star-half-o{color:#eda702}


            .grid-container4{display:grid;grid-template-columns:2fr 2fr 2fr 2fr;margin-top: 60px;margin-left:80px;column-gap:150px;}
            .grid-container4 ul li {margin-bottom: 8px;margin-left:20px}

             .feedbackcon{height:200px;}
             
             .feedbackmessage{font-size: 23px;}
             .feedbakuser,.feedbackemail{font-size: 15px;line-height: 10px;position: relative;top: 40px;}
             
            /*Footer style*/ 
            .footer{background-color: #022902;padding:50px;display:grid;grid-template-columns: 1fr 1fr 1fr 1fr;margin-top:20px;border-radius: 10px;}
            .footer ul li a{text-decoration:none;color:aliceblue;list-style-type: none;font-size: 15px;font-weight:600}
            .footer ul li{list-style-type:none;color:aliceblue;margin-bottom:10px;font-size:15px;font-weight:600}
            .footer .head{font-size: 25px;color:#ebda2a;margin-bottom:20px}
            .footer ul li a:hover{color:#149c2e}
            .fa-square-facebook{color:white}
            .fa-square-twitter{color:white}
            .fa-square-whatsapp{color:white}
            .fa-youtube{color:white}
            .social-logoes  {margin-left:20px;display:flex}
            .social-logoes p{margin-left:20px}
    </style>
</head>
<body>
    <div class="nav">

        <ul class="nav-bar">
            <li><a href="">All Catogary</a></li>
            <li><a href="">Vegetables</a></li>
            <li><a href="" class="navfruit">Fruits</a></li>
            <li><a href="">Meats</a></li>
            <li><a href="">Fish</a></li>
            <li><a href="" class="navbaverage">Beverages</a></li>
            <li><a href="">Chilled</a></li>
            <li><a href="" class="navfrozen">FrozenFood</a></li>
            <li><a href="">Grocery</a></li>
            <li><a href="" class="navhomware">Homeware</a></li>
            <li><a href="" class="navhousehold">Household</a></li>
            <li><a href="registrationForm.jsp"><i class="fa fa-user-circle-o" aria-hidden="true"></i><span class="sign">Sign in</span></a></li>
            <li><a href=""><i class="fa fa-shopping-cart"></i><span class="sign" onclick="loginOrSignIn()">My Cart</span></a></li>
        </ul>
        
    </div>

    <div class="img-1">
        <img src="images/i1.jpg" >
        <p class="img-head">Easily Stock up on Daily Essential</p>
        <p class="img-head2">100% Healthy and Affordable</p>
        <p class="shop-button"><a href="" onclick="loginOrSignIn()">Shop Now</a></p>
    </div>
   
    <div class="catogories">
        <h2>Shop by catogories</h2>
        <ul>
            <li><img src="images/c1.jpg" alt="" class="img-2"><a href="" onclick="loginOrSignIn()">Vegitables</a></li>
            <li><img src="images/c2.jpg" alt="" class="img-2"><a href="" onclick="loginOrSignIn()">Fruits</a></li>
            <li><img src="images/c3.jpg" alt="" class="img-2"><a href="" onclick="loginOrSignIn()">Eggs</a></li>
            <li><img src="images/c4.jpg" alt="" class="img-2"><a href="" onclick="loginOrSignIn()">Dry Fruits</a></li>
            <li><img src="images/c5" alt="" class="img-2"><a href="" onclick="loginOrSignIn()">Seafood</a></li>
            <li><img src="images/c6.jpg" alt="" class="img-2"><a href="" onclick="loginOrSignIn()">Cofee</a></li>
            <li><img src="images/c7.jpg" alt="" class="img-2"><a href="" onclick="loginOrSignIn()">Cookies</a></li>
            <li><img src="images/c8" alt="" class="img-2"><a href="" onclick="loginOrSignIn()">Pizza</a></li>
            <li><img src="images/c9.jpg" alt="" class="img-2"><a href="" onclick="loginOrSignIn()">Dairy Cheese</a></li>
        </ul>


    </div>


      
    <h2>New Products</h2><br>
   <div class="grid-container">    
    <div class="item">
        <a href="#"><img src="images/1" class="img"></a><br>
        <p  class="qty">1Kg</p>
        <p class="name">Organic Energy Food</p>
        <p class="price">Rs. 11,000</p><br>
        <a> <p class="cart" onclick="loginOrSignIn()">add to cart</p></a>
        
        </div>

        <div class="item">
            <a href="#"><img src="images/n2" class="img"></a><br>
            <p class="qty" >350g</p>
            <p class="name">Oreo Blackout Cake</p>
            <p class="price">Rs. 700</p><br>
            <a> <p class="cart" onclick="loginOrSignIn()">add to cart</p></a>
            
       </div>

            
       <div class="item">

            <a href="#"><img src="images/n3.png" class="img"></a><br>
            <p class="qty">200g</p>
            <p class="name">Bains Chickpea Chips</p>
            <p class="price">Rs. 400</p><br>
            <a> <p class="cart" onclick="loginOrSignIn()">add to cart</p></a>
                
        </div>

                
        <div class="item">

            <a href="#"><img src="images/n4.jpg" class="img"></a><br>
            <p class="qty">700g</p>
            <p class="name">Crunchy Peanut Butter</p>
            <p class="price">Rs. 1200</p><br>
            <a> <p class="cart" onclick="loginOrSignIn()">add to cart</p></a>
                    
        </div>

                    
        <div class="item">

            <a href="#"><img src="images/n5" class="img"></a><br>
            <p class="qty">500ml</p>
            <p class="name">Aeroplane juice</p>
            <p class="price">Rs. 350</p><br>
            <a> <p class="cart" onclick="loginOrSignIn()">add to cart</p></a>
                        
        </div>

                        
         <div class="item">
            <a href="#"><img src="images/n6.jpeg" class="img"></a><br>
            <p class="qty">500g</p>
            <p class="name">HellMann's Vegan mayo</p>
            <p class="price">Rs. 1000</p><br>
            <a> <p class="cart" onclick="loginOrSignIn()">add to cart</p></a>
                            
        </div>

                            
        <div class="item">
            <a href="#"><img src="images/n7" class="img"></a><br>
            <p class="qty">200g</p>
            <p class="name">White chocolate</p>
            <p class="price">Rs. 550</p><br>
            <a> <p class="cart" onclick="loginOrSignIn()">add to cart</p></a>
                                
        </div>

        <div class="item">
            <a href="#"><img src="images/n8.jpg" class="img"></a><br>
            <p class="qty">500g</p>
            <p class="name">Mighty Muffin</p>
            <p class="price">Rs. 700</p><br>
            <a> <p class="cart" onclick="loginOrSignIn()">add to cart</p></a>
                                    
        </div>
            
                                    
        <div class="item">
            <a href="#"><img src="images/n9.png" class="img"></a><br>
            <p class="qty">200g</p>
            <p class="name">Chicken Nuggets</p>
            <p class="price">Rs. 600</p><br>
            <a> <p class="cart" onclick="loginOrSignIn()">add to cart</p></a>
                                        
        </div>
            
                                        
        <div class="item">
            <a href="#"><img src="images/n10" class="img"></a><br>
            <p class="qty">700ml</p>
            <p class="name">Olive Oil</p>
            <p class="price">Rs. 1300</p><br>
            <a> <p class="cart" onclick="loginOrSignIn()">add to cart</p></a>
                                            
       </div>


    </div>



      <div class="img-1">
        <img src="images/i6.jpg" >
        <p class="img2-head">Best deals of this week!</p>
        <p class="img2-topic">Grab the best offer of<br> this week</p>
        
        
        
      </div>

      

     <diV class="grid-container2">
     <div class="grid-item1">
        <p class="grid-item1-topic">Weekend Sales</p>
        <p class="grid-item1-topic2">Get up to 26% off <br> Vegetables</p>
        <p class="shop-button2" onclick="loginOrSignIn()">Shop Now</p>
        <img src="images/side-1.png" class="image">
     </div>




     <div class="grid-item2">

        <h2>Top Selling Products</h2>

      <Ul>
             <li><img src="images/item1.jpg" class="item2-img">
                  <p>Baby Food</p> 
                  <p>Ergonomic Linon Pants</p>
                  <p> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i><i class="fa fa-star-half-o" aria-hidden="true"></i></p>
                  <p>$25</p>
             </li>

             <li><img src="images/item2.jpg" class="item2-img">
                  <p>Baby Food</p> 
                  <p>Ergonomic Linon Pants</p>
                  <p> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i><i class="fa fa-star-half-o" aria-hidden="true"></i></p>
                  <p>$25</p>
             </li>

              <li><img src="images/item3.jpg" class="item2-img">
                  <p>Baby Food</p> 
                  <p>Ergonomic Linon Pants</p>
                  <p><i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i><i class="fa fa-star-half-o" aria-hidden="true"></i></p>
                  <p>$25</p>
             </li>
      </Ul>

     </div>


        
     <div  class="grid-item2">

        <h2>Top Rated Products</h2>

        <ul>
               <li><img src="images/item4.jpg" class="item2-img">
                    <p>Baby Food</p> 
                    <p>Ergonomic Linon Pants</p>
                    <p><i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i><i class="fa fa-star-half-o" aria-hidden="true"></i></p>
                    <p>$25</p>
               </li>

               <li><img src="images/item5.jpg" class="item2-img">
                    <p>Baby Food</p> 
                    <p>Ergonomic Linon Pants</p>
                    <p> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i><i class="fa fa-star-half-o" aria-hidden="true"></i></p>
                    <p>$25</p>
              </li>

               <li><img src="images/item6.jpg" class="item2-img">
                    <p>Baby Food</p> 
                    <p>Ergonomic Linon Pants</p>
                    <p><i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i><i class="fa fa-star-half-o" aria-hidden="true"></i></p>
                    <p>$25</p>
              </li>

        </ul>

     </div>


      </diV>
    
    <!--User FeedBacks-->
    <h1 style='text-align:center;'>Customer's FeedBacks</h1>
    <div class="grid-container feedbackmain">
        
        <%
            Connection con;
            PreparedStatement pst;
            ResultSet rs;
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/greensupermarket","root","");
            
            String query = "select * from feedbacks";
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
                String id = rs.getString("feedbackid");
                 
        %>
        
        <div class="item feedbackcon">
                <p class="price feedbackmessage"><%=rs.getString("usermessage")%></p>
                <p class="name feedbakuser"><%=rs.getString("username")%></p>
                <p class="qty feedbackemail"><%=rs.getString("useremail")%></p>
        </div>
         
        
        <%
            }
        %>
        </div>
      <!--Footer-->
      <div class="footer">
        <div>
           <ul>
               <li class="head">Shofi</li>
   
               <li>We are a team of designers <br> and  devolopers that create <br> high <br> quality WordPress</li>
   
           </ul>
           
        </div>
   
        <div>
           
           
   
           <ul>
            <li class="head">My Account</h2>
            <li><a href="">Track Orders</a></li>
            <li><a href="">Shipping</a></li>
            <li><a href="">Wishlist</a></li>
            <li><a href="">My Account</a></li>
            <li><a href="">Order History</a></li>
            <li><a href="">Returns</a></li>
           </ul>
        </div>
   
        <div>
           <ul>
               <li class="head">Information</li>
               <li><a href="">Our Story</a></li>
               <li><a href="">Carrers</a></li>
               <li><a href="">Privacy Policy</a></li>
               <li><a href="">Terms and Conditions</a></li>
               <li><a href="">Latest News</a></li>
               <li><a href="">Contact Us</a></li>
           </ul>
        </div>
   
        <div>
           <ul>
               <li class="head">Talk To Us</li>
           <li><a href="">got question? Call Us</a></li>
           <li><a href="">+670 139 09 762</a></li>
           </ul>
           <div class="social-logoes">
          <p><i class="fa-brands fa-square-facebook fa-xl"></i></p>
           <p><i class="fa-brands fa-square-twitter fa-xl"></i></p>
           <p><i class="fa-brands fa-square-whatsapp fa-xl"></i></p>
           </div>
        </div>
   
       </div>
<div><div class="elfsight-app-d5211377-acf2-418e-9c40-acbcec6743f1" data-elfsight-app-lazy></div></div>

<script>
    function loginOrSignIn() {
      alert('Please sign in or log in to the website!');
    }
</script>

</body>
</html>
