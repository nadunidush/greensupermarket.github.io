<%-- 
    Document   : confirmBuyItems
    Created on : Dec 26, 2023, 9:52:51 PM
    Author     : betcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap" rel="stylesheet">
        <title>Confirm Buy Items Page</title>
        <style>
            *{
                font-family: 'Montserrat', sans-serif;
            }
            /*Contact Us style*/
            .container{
            max-width: 350px;
            width: 100%;
            padding: 25px 30px;
            border-radius: 5px;
            box-shadow: 0 10px 10px rgba(0, 0, 0, 0.15);
            margin-left: 450px;
            margin-top: 100px;
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
        </style>
    </head>
    <body>
        <div class="container">
        <form action="confirmBuy" method="POST">
            <div class="title">Confirmation</div>
            <div class="input-box">
                <input type="email" placeholder="Enter your email" name="confirm_email" required>
                <div class="underline"></div>
            </div>
            <div class="input-box">
                <input type="password" placeholder="Enter your password" name="confirm_password" required>
                <div class="underline"></div>
            </div>
            <div class="input-box">
                 <input type="submit" value="Confirm">
           </div>
        </form>
    </div>
    </body>
</html>
