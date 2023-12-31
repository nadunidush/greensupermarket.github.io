<%-- 
    Document   : userHomePage
    Created on : Dec 24, 2023, 7:58:39 PM
    Author     : betcom
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home page</title>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/9cede9b0d7.js" crossorigin="anonymous"></script>
    <!--<script src="https://static.elfsight.com/platform/platform.js" data-use-service-core defer></script>-->
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
 
            .grid-container{display:grid; grid-template-columns: auto auto auto auto auto; column-gap:50px; gap:15px;margin-left: 50px  ;}
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
            .elfsight-app-d5211377-acf2-418e-9c40-acbcec6743f1{position: absolute;bottom:1280px;margin-right: 570px;}


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
            
            
            /*Contact Us style*/
            .container{
            max-width: 350px;
            width: 100%;
            padding: 25px 30px;
            border-radius: 5px;
            box-shadow: 0 10px 10px rgba(0, 0, 0, 0.15);
            margin-left: 450px;
            margin-top: 50px;
            }
            .container form .title{
                font-size: 25px;
                font-weight:600 ;
                margin: 20px 0 10px 0;
                position: relative;
            }
            .container form .title::before{
                content: "";
                position: absolute;
                height: 3px;
                width: 33px;
                bottom: 0px;
                left: 0;
                border-radius: 5px;
                background: linear-gradient(to right,#99004D 0%, #ff0080 100%);
            }
            .container form .input-box{
                width: 100%;
                height: 45px;
                margin-top: 25px;
                position: relative;
            }
            .container form .input-box input,textarea{
                height: 100%;
                width: 100%;
                outline: none;
                font-size: 16px;
                border: none;
            }
            .container form .underline::before{
                position: absolute;
                content: '';
                height: 2px;
                width: 100%;
                background: #ccc;
                left: 0;
                bottom: 0;
            }
            .container form .underline::after{
                position: absolute;
                content: '';
                height: 2px;
                width: 100%;
                left: 0;
                bottom: 0;
                background: linear-gradient(to right,#99004D 0%, #ff0080 100%);
                transform: scaleX(0);
                transform-origin: left;
                transition: all 0.3s ease;
            }
            .container form .input-box textarea:focus ~ .underline::after,
            .container form .input-box textarea:valid ~ .underline::after{
                transform: scaleX(1);
                transform-origin: left;
            }
            .container form .input-box input:focus ~ .underline::after,
            .container form .input-box input:valid ~ .underline::after{
                transform: scaleX(1);
                transform-origin: left;
            }
            .container form .input-box input[type="submit"]{
                font-size: 17px;
                color: #fff;
                border-radius: 5px;
                cursor: pointer;
                background: linear-gradient(to right,#99004D 0%, #ff0080 100%);
                transition: all 0.3s ease;
            }
            .container form .input-box input[type="submit"]:hover{
                letter-spacing: 1px;
                background: linear-gradient(to left,#99004D 0%, #ff0080 100%);
            }
            
            /*Feedback style*/
            
            .containerfeedback{
            color: #fff;
            outline: none;
            max-width: 360px;
            background: #000;
            box-shadow: 0 0 8px rgba(250, 250, 250, 0.6);
            opacity: 0.6;
            margin-left: 450px;
            margin-top: 50px;
            padding: 30px 30px;
            }
            .containerfeedback form{
                width: 100%;
                text-align: center;

            }
            .containerfeedback form h1{
                padding: 10px 0;
            }
            .containerfeedback form .feedid{
                position: relative;
            }
            .feedid i{
                position: absolute;
                font-size: 20px;
                top: 50%;
                right: 20px;
                transform: translate(-50%);
            }
            .containerfeedback form input{
                width: 100%;
                height: 50px;
                margin: 4px 0;
                border: 1px solid #5c5c5c;
                border-radius: 3px;
                background: #181717;
                padding: 0px 8px;
                padding-right: 0px;
                font-size: 18px;
            }
            .containerfeedback form textarea{
                padding: 0px 5px;
                border: 1px solid #5c5c5c;
                border-radius: 3px;
                background: #181717;
                font-size: 18px;
                width: 100%;
                margin: 4px 0;

            }
            .containerfeedback form input[type="submit"]{
                margin-top: 5px;
                border: none;
                background: #00fff0;
                color:#222 ;
                padding: 10px 0;
                width: 100%;
                font-size: 20px;
                font-weight: 800;
                cursor: pointer;
                border-radius: 3px;
            }
            .containerfeedback form input:focus,
            .containerfeedback form textarea:focus{
                border: 1px solid #00fff0;
                color: #00fff0;
                transition: all 0.3s ease;
            }
            .containerfeedback form input:focus::placeholder,
            .containerfeedback form textarea:focus::placeholder{
                padding-left: 4px;
                color: #00fff0;
                transition: all 0.3s ease;
            }
            .containerfeedback form input:focus + i{
                color: #00fff0;
                transition: all 0.3s ease;
            }
            
            /*Footer style*/
            .footer{background-color: #022902;padding:60px;display:grid;grid-template-columns: 1fr 1fr 1fr 1fr;margin-top:20px;border-radius: 10px;}
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
    <jsp:include page="navbar.jsp" />
    <div class="img-1">
        <img src="images/i1.jpg" >
        <p class="img-head">Easily Stock up on Daily Essential</p>
        <p class="img-head2">100% Healthy and Affordable</p>
        <p class="shop-button"><a href="userVegetables.jsp">Shop Now</a></p>
    </div>
   
    <div class="catogories">
        <h2>Shop by catogories</h2>
        <ul>
            <li><img src="images/c1.jpg" alt="" class="img-2"><a href="userVegetables.jsp">Vegitables</a></li>
            <li><img src="images/c2.jpg" alt="" class="img-2"><a href="userFruits.jsp">Fruits</a></li>
            <li><img src="images/c3.jpg" alt="" class="img-2"><a href="userMeats.jsp">Eggs</a></li>
            <li><img src="images/c4.jpg" alt="" class="img-2"><a href="userGrocery.jsp">Dry Fruits</a></li>
            <li><img src="images/c5" alt="" class="img-2"><a href="userFishes.jsp">Seafood</a></li>
            <li><img src="images/c6.jpg" alt="" class="img-2"><a href="userGrocery.jsp">Cofee</a></li>
            <li><img src="images/c7.jpg" alt="" class="img-2"><a href="userGrocery.jsp">Cookies</a></li>
            <li><img src="images/c8" alt="" class="img-2"><a href="userChilled.jsp">Pizza</a></li>
            <li><img src="images/c9.jpg" alt="" class="img-2"><a href="userFrozen.jsp" >Dairy Cheese</a></li>
        </ul>


    </div>


      
    <h2>New Products</h2><br>
   <div class="grid-container">    
    <div class="item">
        <a href="#"><img src="images/1" class="img"></a><br>
        <p  class="qty">1Kg</p>
        <p class="name">Organic Energy Food</p>
        <p class="price">Rs. 11,000</p><br>
        <a> <p class="cart"  >add to cart</p></a>
        
        </div>

        <div class="item">
            <a href="#"><img src="images/n2" class="img"></a><br>
            <p class="qty" >350g</p>
            <p class="name">Oreo Blackout Cake</p>
            <p class="price">Rs. 700</p><br>
            <a> <p class="cart"  >add to cart</p></a>
            
       </div>

            
       <div class="item">

            <a href="#"><img src="images/n3.png" class="img"></a><br>
            <p class="qty">200g</p>
            <p class="name">Bains Chickpea Chips</p>
            <p class="price">Rs. 400</p><br>
            <a> <p class="cart"  >add to cart</p></a>
                
        </div>

                
        <div class="item">

            <a href="#"><img src="images/n4.jpg" class="img"></a><br>
            <p class="qty">700g</p>
            <p class="name">Crunchy Peanut Butter</p>
            <p class="price">Rs. 1200</p><br>
            <a> <p class="cart" >add to cart</p></a>
                    
        </div>

                    
        <div class="item">

            <a href="#"><img src="images/n5" class="img"></a><br>
            <p class="qty">500ml</p>
            <p class="name">Aeroplane juice</p>
            <p class="price">Rs. 350</p><br>
            <a> <p class="cart"  >add to cart</p></a>
                        
        </div>

                        
         <div class="item">
            <a href="#"><img src="images/n6.jpeg" class="img"></a><br>
            <p class="qty">500g</p>
            <p class="name">HellMann's Vegan mayo</p>
            <p class="price">Rs. 1000</p><br>
            <a> <p class="cart"  >add to cart</p></a>
                            
        </div>

                            
        <div class="item">
            <a href="#"><img src="images/n7" class="img"></a><br>
            <p class="qty">200g</p>
            <p class="name">White chocolate</p>
            <p class="price">Rs. 550</p><br>
            <a> <p class="cart"  >add to cart</p></a>
                                
        </div>

        <div class="item">
            <a href="#"><img src="images/n8.jpg" class="img"></a><br>
            <p class="qty">500g</p>
            <p class="name">Mighty Muffin</p>
            <p class="price">Rs. 700</p><br>
            <a> <p class="cart"  >add to cart</p></a>
                                    
        </div>
            
                                    
        <div class="item">
            <a href="#"><img src="images/n9.png" class="img"></a><br>
            <p class="qty">200g</p>
            <p class="name">Chicken Nuggets</p>
            <p class="price">Rs. 600</p><br>
            <a> <p class="cart"  >add to cart</p></a>
                                        
        </div>
            
                                        
        <div class="item">
            <a href="#"><img src="images/n10" class="img"></a><br>
            <p class="qty">700ml</p>
            <p class="name">Olive Oil</p>
            <p class="price">Rs. 1300</p><br>
            <a> <p class="cart"  >add to cart</p></a>
                                            
       </div>


    </div>
    
    <!--Customer Contact Us-->
    <div class="container">
        <form action="contactUs" method="POST">
            <div class="title">Contact Us</div>
            <div class="input-box">
                <input type="text" placeholder="Enter Your name" name="name" required>
                <div class="underline"></div>
            </div>
            <div class="input-box">
                <input type="email" placeholder="Enter Your Email" name="email" required>
                <div class="underline"></div>
            </div>
            <div class="input-box">
                <input type="text" placeholder="Enter the Subject" name="subject" required>
                <div class="underline"></div>
            </div>
            <div class="input-box">
                 <textarea name="message" id="" cols="30" rows="10" placeholder="Enter the Message" required></textarea>
                <div class="underline"></div>
            </div>
            <div class="input-box">
                 <input type="submit" value="Send">
           </div>
        </form>
    </div>
    
    <!--Customer create Feedback-->
    <div class="containerfeedback">
        <form action="feedback" method="POST">
            <h1>Give Your FeedBack</h1>
            <div class="feedid">
                <input type="text" name="username" id="username" placeholder="Full Name">
                <i class="fa-solid fa-user"></i>
            </div>
            <div class="feedid">
                <input type="email" name="useremail" id="useremail" placeholder="Email Address">
                <i class="fa-solid fa-envelope"></i>
            </div>
            <textarea name="usermessage" id="" cols="15" rows="5" placeholder="Enter Your Opinions Here..."></textarea>
            <input type="submit" value="Send">
        </form>
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
    function sendEmail(){
        alert("Your message sent!:)");
    }
</script>
</body>
</html>

