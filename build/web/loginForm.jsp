<%-- 
    Document   : loginForm
    Created on : Dec 22, 2023, 9:34:45 PM
    Author     : betcom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <style>
            @font-face {
                    font-family: "Poppins-Regular";
                    src: url('../fonts/poppins/Poppins-Regular.ttf');
            }
            @font-face {
                    font-family: "Poppins-SemiBold";
                    src: url('../fonts/poppins/Poppins-SemiBold.ttf');
            }
            * {
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                box-sizing: border-box;
            }
            .loginIn{
                margin-left: 70px;
            }
            .register{
                margin-top: 50px;
                margin-left: -100px;
            }
            .register a{color:green;text-decoration:none;margin-left:190px;position:relative;bottom:18px;font-size:16px}
            .register2{border: none;
                    width: 164px;
                    height: 51px;
                    margin-right: 100px;
                    margin-top: 40px;
                    cursor: pointer;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    padding: 0;
                    background: #333;
                    font-size: 15px;
                    color: #fff;
                    vertical-align: middle;
                    -webkit-transform: perspective(1px) translateZ(0);
                    transform: perspective(1px) translateZ(0);
                    -webkit-transition-duration: 0.3s;
                    transition-duration: 0.3s;
                     position:absolute;bottom:155px;
                     margin-left:180px}

            .register2 a{text-decoration: none;color:white;}
            body {
                    font-family: "Poppins-Regular";
                    color: #333;
                    font-size: 13px;
                    margin: 0;
            }
            input, textarea, select, button {
                    font-family: "Poppins-Regular";
                    color: #333;
                    font-size: 13px;
            }
            p, h1, h2, h3, h4, h5, h6, ul {
                    margin: 0;
            }
            img {
                    max-width: 100%;
            }
            ul {
                    padding-left: 0;
                    margin-bottom: 0;
            }
            a:hover {
                    text-decoration: none;
            }
            :focus {
                outline: none;
            }
            .wrapper {
                    min-height: 100vh;
                    background-size: cover;
                    background-repeat: no-repeat;
                    display: flex;
                    align-items: center;
            }
            .inner {
                    padding: 20px;
                    background: #fff;
                    max-width: 850px;
                    margin: auto;
                    display: flex;
                    .image-holder {
                            width: 50%;
                    }
                    form {
                            width: 50%;
                            padding-top: 36px;
                            padding-left: 45px;
                            padding-right: 45px;
                    }
                    h3 {
                            text-transform: uppercase;
                            font-size: 25px;
                            font-family: "Poppins-SemiBold";
                            text-align: center;
                            margin-bottom: 28px;
                    }
            }
            .form-group {
                    display: flex;
                    input {
                            width: 50%;
                            &:first-child {
                                    margin-right: 25px;
                            }
                    }
            }
            .form-wrapper {
                    position: relative;
                    i {
                            position: absolute;
                            bottom: 9px;
                            right: 0;
                    }
            }
            .form-control {
                    border: 1px solid #333;
                    border-top: none;
                    border-right: none;
                    border-left: none;
                    display: block;
                    width: 100%;
                    height: 30px;
                    padding: 0;
                    margin-bottom: 25px;
                    &::-webkit-input-placeholder { 
                            font-size: 13px;
                            color: #333;
                            font-family: "Poppins-Regular";
                    }
                    &::-moz-placeholder { 
                            font-size: 13px;
                            color: #333;
                            font-family: "Poppins-Regular";
                    }
                    &:-ms-input-placeholder { 
                            font-size: 13px;
                            color: #333;
                            font-family: "Poppins-Regular";
                    }
                    &:-moz-placeholder { 
                            font-size: 13px;
                            color: #333;
                            font-family: "Poppins-Regular";
                    }
            }
            select {
                    -moz-appearance: none;
                -webkit-appearance: none;
                cursor: pointer;
                padding-left: 20px;
                    option[value=""][disabled] {
                            display: none;
                    }
            }
            button {
                    border: none;
                    width: 164px;
                    height: 51px;
                    margin-right: 100px;
                    margin-top: 40px;
                    cursor: pointer;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    padding: 0;
                    background: #333;
                    font-size: 15px;
                    color: #fff;
                    vertical-align: middle;
                    -webkit-transform: perspective(1px) translateZ(0);
                    transform: perspective(1px) translateZ(0);
                    -webkit-transition-duration: 0.3s;
                    transition-duration: 0.3s;
                    i {
                            margin-left: 10px;
                            -webkit-transform: translateZ(0);
                            transform: translateZ(0);
                    }

                    &:hover, &:focus, &:active {
                            i {
                                    -webkit-animation-name: hvr-icon-wobble-horizontal;
                                    animation-name: hvr-icon-wobble-horizontal;
                                    -webkit-animation-duration: 1s;
                                    animation-duration: 1s;
                                    -webkit-animation-timing-function: ease-in-out;
                                    animation-timing-function: ease-in-out;
                                    -webkit-animation-iteration-count: 1;
                                    animation-iteration-count: 1;
                            }
                    }
            }
            @-webkit-keyframes hvr-icon-wobble-horizontal {
              16.65% {
                -webkit-transform: translateX(6px);
                transform: translateX(6px);
              }
              33.3% {
                -webkit-transform: translateX(-5px);
                transform: translateX(-5px);
              }
              49.95% {
                -webkit-transform: translateX(4px);
                transform: translateX(4px);
              }
              66.6% {
                -webkit-transform: translateX(-2px);
                transform: translateX(-2px);
              }
              83.25% {
                -webkit-transform: translateX(1px);
                transform: translateX(1px);
              }
              100% {
                -webkit-transform: translateX(0);
                transform: translateX(0);
              }
            }
            @keyframes hvr-icon-wobble-horizontal {
              16.65% {
                -webkit-transform: translateX(6px);
                transform: translateX(6px);
              }
              33.3% {
                -webkit-transform: translateX(-5px);
                transform: translateX(-5px);
              }
              49.95% {
                -webkit-transform: translateX(4px);
                transform: translateX(4px);
              }
              66.6% {
                -webkit-transform: translateX(-2px);
                transform: translateX(-2px);
              }
              83.25% {
                -webkit-transform: translateX(1px);
                transform: translateX(1px);
              }
              100% {
                -webkit-transform: translateX(0);
                transform: translateX(0);
              }
            }
            @media (max-width: 1199px) { 
                    .wrapper {
                            background-position: right center;
                    }
            }
            @media (max-width: 991px) {
                    .inner form {
                            padding-top: 10px;
                            padding-left: 30px;
                            padding-right: 30px;
                    }
            }
            @media (max-width: 767px) {
                    .inner {
                            display: block;
                            .image-holder {
                                    width: 100%;
                            }
                            form {
                                    width: 100%;
                                    padding: 40px 0 30px;
                            }
                    }


            }

        </style>
    </head>
    <body>
        <input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
        <div class="wrapper" style="background-image: url('images/loginAregisterBack.jpg');">
			<div class="inner">
				<div class="image-holder">
					<img src="images/loginAregisterback2.jpg" alt="">
				</div>
                            <form action="login" method="post">
					<h3>LogIn</h3>
					
					
					<div class="form-wrapper">
						<input type="email" name="email" placeholder="Email Address" class="form-control" required >
						<i class="zmdi zmdi-email"></i>
					</div>
					<div class="form-wrapper">
						
						<i class="zmdi zmdi-caret-down" style="font-size: 17px"></i>
					</div>
					<div class="form-wrapper">
						<input type="password" name="password" placeholder="Password" class="form-control" required>
						<i class="zmdi zmdi-lock"></i>
					</div>
					
                                        
					<button type="submit" class='loginIn'>Log In</button>
                                        
                                        <div class="register"> <a href="registrationForm.jsp" >Create An Account</a></div>
                                        
                                        
                                        
                                        
                                        
                                        
				</form>
			</div>
		</div>
        <script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
        <script type="text/javascript">
            var status= document.getElementById("status").value;
            if(status !== null && status == "failed"){
                swal("Sorry Wrong User Name Or Password ","failed");
            }
            
            
        </script>
    </body>
</html>
