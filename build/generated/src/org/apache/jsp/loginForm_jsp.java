package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <style>\n");
      out.write("            @font-face {\n");
      out.write("                    font-family: \"Poppins-Regular\";\n");
      out.write("                    src: url('../fonts/poppins/Poppins-Regular.ttf');\n");
      out.write("            }\n");
      out.write("            @font-face {\n");
      out.write("                    font-family: \"Poppins-SemiBold\";\n");
      out.write("                    src: url('../fonts/poppins/Poppins-SemiBold.ttf');\n");
      out.write("            }\n");
      out.write("            * {\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .loginIn{\n");
      out.write("                margin-left: 70px;\n");
      out.write("            }\n");
      out.write("            .register{\n");
      out.write("                margin-top: 50px;\n");
      out.write("                margin-left: -100px;\n");
      out.write("            }\n");
      out.write("            .register a{color:green;text-decoration:none;margin-left:190px;position:relative;bottom:18px;font-size:16px}\n");
      out.write("            .register2{border: none;\n");
      out.write("                    width: 164px;\n");
      out.write("                    height: 51px;\n");
      out.write("                    margin-right: 100px;\n");
      out.write("                    margin-top: 40px;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                    display: flex;\n");
      out.write("                    align-items: center;\n");
      out.write("                    justify-content: center;\n");
      out.write("                    padding: 0;\n");
      out.write("                    background: #333;\n");
      out.write("                    font-size: 15px;\n");
      out.write("                    color: #fff;\n");
      out.write("                    vertical-align: middle;\n");
      out.write("                    -webkit-transform: perspective(1px) translateZ(0);\n");
      out.write("                    transform: perspective(1px) translateZ(0);\n");
      out.write("                    -webkit-transition-duration: 0.3s;\n");
      out.write("                    transition-duration: 0.3s;\n");
      out.write("                     position:absolute;bottom:155px;\n");
      out.write("                     margin-left:180px}\n");
      out.write("\n");
      out.write("            .register2 a{text-decoration: none;color:white;}\n");
      out.write("            body {\n");
      out.write("                    font-family: \"Poppins-Regular\";\n");
      out.write("                    color: #333;\n");
      out.write("                    font-size: 13px;\n");
      out.write("                    margin: 0;\n");
      out.write("            }\n");
      out.write("            input, textarea, select, button {\n");
      out.write("                    font-family: \"Poppins-Regular\";\n");
      out.write("                    color: #333;\n");
      out.write("                    font-size: 13px;\n");
      out.write("            }\n");
      out.write("            p, h1, h2, h3, h4, h5, h6, ul {\n");
      out.write("                    margin: 0;\n");
      out.write("            }\n");
      out.write("            img {\n");
      out.write("                    max-width: 100%;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                    padding-left: 0;\n");
      out.write("                    margin-bottom: 0;\n");
      out.write("            }\n");
      out.write("            a:hover {\n");
      out.write("                    text-decoration: none;\n");
      out.write("            }\n");
      out.write("            :focus {\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("            .wrapper {\n");
      out.write("                    min-height: 100vh;\n");
      out.write("                    background-size: cover;\n");
      out.write("                    background-repeat: no-repeat;\n");
      out.write("                    display: flex;\n");
      out.write("                    align-items: center;\n");
      out.write("            }\n");
      out.write("            .inner {\n");
      out.write("                    padding: 20px;\n");
      out.write("                    background: #fff;\n");
      out.write("                    max-width: 850px;\n");
      out.write("                    margin: auto;\n");
      out.write("                    display: flex;\n");
      out.write("                    .image-holder {\n");
      out.write("                            width: 50%;\n");
      out.write("                    }\n");
      out.write("                    form {\n");
      out.write("                            width: 50%;\n");
      out.write("                            padding-top: 36px;\n");
      out.write("                            padding-left: 45px;\n");
      out.write("                            padding-right: 45px;\n");
      out.write("                    }\n");
      out.write("                    h3 {\n");
      out.write("                            text-transform: uppercase;\n");
      out.write("                            font-size: 25px;\n");
      out.write("                            font-family: \"Poppins-SemiBold\";\n");
      out.write("                            text-align: center;\n");
      out.write("                            margin-bottom: 28px;\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("            .form-group {\n");
      out.write("                    display: flex;\n");
      out.write("                    input {\n");
      out.write("                            width: 50%;\n");
      out.write("                            &:first-child {\n");
      out.write("                                    margin-right: 25px;\n");
      out.write("                            }\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("            .form-wrapper {\n");
      out.write("                    position: relative;\n");
      out.write("                    i {\n");
      out.write("                            position: absolute;\n");
      out.write("                            bottom: 9px;\n");
      out.write("                            right: 0;\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("            .form-control {\n");
      out.write("                    border: 1px solid #333;\n");
      out.write("                    border-top: none;\n");
      out.write("                    border-right: none;\n");
      out.write("                    border-left: none;\n");
      out.write("                    display: block;\n");
      out.write("                    width: 100%;\n");
      out.write("                    height: 30px;\n");
      out.write("                    padding: 0;\n");
      out.write("                    margin-bottom: 25px;\n");
      out.write("                    &::-webkit-input-placeholder { \n");
      out.write("                            font-size: 13px;\n");
      out.write("                            color: #333;\n");
      out.write("                            font-family: \"Poppins-Regular\";\n");
      out.write("                    }\n");
      out.write("                    &::-moz-placeholder { \n");
      out.write("                            font-size: 13px;\n");
      out.write("                            color: #333;\n");
      out.write("                            font-family: \"Poppins-Regular\";\n");
      out.write("                    }\n");
      out.write("                    &:-ms-input-placeholder { \n");
      out.write("                            font-size: 13px;\n");
      out.write("                            color: #333;\n");
      out.write("                            font-family: \"Poppins-Regular\";\n");
      out.write("                    }\n");
      out.write("                    &:-moz-placeholder { \n");
      out.write("                            font-size: 13px;\n");
      out.write("                            color: #333;\n");
      out.write("                            font-family: \"Poppins-Regular\";\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("            select {\n");
      out.write("                    -moz-appearance: none;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                padding-left: 20px;\n");
      out.write("                    option[value=\"\"][disabled] {\n");
      out.write("                            display: none;\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("            button {\n");
      out.write("                    border: none;\n");
      out.write("                    width: 164px;\n");
      out.write("                    height: 51px;\n");
      out.write("                    margin-right: 100px;\n");
      out.write("                    margin-top: 40px;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                    display: flex;\n");
      out.write("                    align-items: center;\n");
      out.write("                    justify-content: center;\n");
      out.write("                    padding: 0;\n");
      out.write("                    background: #333;\n");
      out.write("                    font-size: 15px;\n");
      out.write("                    color: #fff;\n");
      out.write("                    vertical-align: middle;\n");
      out.write("                    -webkit-transform: perspective(1px) translateZ(0);\n");
      out.write("                    transform: perspective(1px) translateZ(0);\n");
      out.write("                    -webkit-transition-duration: 0.3s;\n");
      out.write("                    transition-duration: 0.3s;\n");
      out.write("                    i {\n");
      out.write("                            margin-left: 10px;\n");
      out.write("                            -webkit-transform: translateZ(0);\n");
      out.write("                            transform: translateZ(0);\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    &:hover, &:focus, &:active {\n");
      out.write("                            i {\n");
      out.write("                                    -webkit-animation-name: hvr-icon-wobble-horizontal;\n");
      out.write("                                    animation-name: hvr-icon-wobble-horizontal;\n");
      out.write("                                    -webkit-animation-duration: 1s;\n");
      out.write("                                    animation-duration: 1s;\n");
      out.write("                                    -webkit-animation-timing-function: ease-in-out;\n");
      out.write("                                    animation-timing-function: ease-in-out;\n");
      out.write("                                    -webkit-animation-iteration-count: 1;\n");
      out.write("                                    animation-iteration-count: 1;\n");
      out.write("                            }\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("            @-webkit-keyframes hvr-icon-wobble-horizontal {\n");
      out.write("              16.65% {\n");
      out.write("                -webkit-transform: translateX(6px);\n");
      out.write("                transform: translateX(6px);\n");
      out.write("              }\n");
      out.write("              33.3% {\n");
      out.write("                -webkit-transform: translateX(-5px);\n");
      out.write("                transform: translateX(-5px);\n");
      out.write("              }\n");
      out.write("              49.95% {\n");
      out.write("                -webkit-transform: translateX(4px);\n");
      out.write("                transform: translateX(4px);\n");
      out.write("              }\n");
      out.write("              66.6% {\n");
      out.write("                -webkit-transform: translateX(-2px);\n");
      out.write("                transform: translateX(-2px);\n");
      out.write("              }\n");
      out.write("              83.25% {\n");
      out.write("                -webkit-transform: translateX(1px);\n");
      out.write("                transform: translateX(1px);\n");
      out.write("              }\n");
      out.write("              100% {\n");
      out.write("                -webkit-transform: translateX(0);\n");
      out.write("                transform: translateX(0);\n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("            @keyframes hvr-icon-wobble-horizontal {\n");
      out.write("              16.65% {\n");
      out.write("                -webkit-transform: translateX(6px);\n");
      out.write("                transform: translateX(6px);\n");
      out.write("              }\n");
      out.write("              33.3% {\n");
      out.write("                -webkit-transform: translateX(-5px);\n");
      out.write("                transform: translateX(-5px);\n");
      out.write("              }\n");
      out.write("              49.95% {\n");
      out.write("                -webkit-transform: translateX(4px);\n");
      out.write("                transform: translateX(4px);\n");
      out.write("              }\n");
      out.write("              66.6% {\n");
      out.write("                -webkit-transform: translateX(-2px);\n");
      out.write("                transform: translateX(-2px);\n");
      out.write("              }\n");
      out.write("              83.25% {\n");
      out.write("                -webkit-transform: translateX(1px);\n");
      out.write("                transform: translateX(1px);\n");
      out.write("              }\n");
      out.write("              100% {\n");
      out.write("                -webkit-transform: translateX(0);\n");
      out.write("                transform: translateX(0);\n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("            @media (max-width: 1199px) { \n");
      out.write("                    .wrapper {\n");
      out.write("                            background-position: right center;\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("            @media (max-width: 991px) {\n");
      out.write("                    .inner form {\n");
      out.write("                            padding-top: 10px;\n");
      out.write("                            padding-left: 30px;\n");
      out.write("                            padding-right: 30px;\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("            @media (max-width: 767px) {\n");
      out.write("                    .inner {\n");
      out.write("                            display: block;\n");
      out.write("                            .image-holder {\n");
      out.write("                                    width: 100%;\n");
      out.write("                            }\n");
      out.write("                            form {\n");
      out.write("                                    width: 100%;\n");
      out.write("                                    padding: 40px 0 30px;\n");
      out.write("                            }\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <input type=\"hidden\" id=\"status\" value=\"");
      out.print(request.getAttribute("status"));
      out.write("\">\n");
      out.write("        <div class=\"wrapper\" style=\"background-image: url('images/loginAregisterBack.jpg');\">\n");
      out.write("\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t<div class=\"image-holder\">\n");
      out.write("\t\t\t\t\t<img src=\"images/loginAregisterback2.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                            <form action=\"login\" method=\"post\">\n");
      out.write("\t\t\t\t\t<h3>LogIn</h3>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"form-wrapper\">\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" name=\"email\" placeholder=\"Email Address\" class=\"form-control\" required >\n");
      out.write("\t\t\t\t\t\t<i class=\"zmdi zmdi-email\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-wrapper\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<i class=\"zmdi zmdi-caret-down\" style=\"font-size: 17px\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-wrapper\">\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"password\" placeholder=\"Password\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t\t<i class=\"zmdi zmdi-lock\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<button type=\"submit\" class='loginIn'>Log In</button>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"register\"> <a href=\"registrationForm.jsp\" >Create An Account</a></div>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var status= document.getElementById(\"status\").value;\n");
      out.write("            if(status !== null && status == \"failed\"){\n");
      out.write("                swal(\"Sorry Wrong User Name Or Password \",\"failed\");\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
