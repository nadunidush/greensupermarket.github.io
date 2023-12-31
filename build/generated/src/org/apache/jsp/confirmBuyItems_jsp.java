package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class confirmBuyItems_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <title>Confirm Buy Items Page</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                font-family: 'Montserrat', sans-serif;\n");
      out.write("            }\n");
      out.write("            /*Contact Us style*/\n");
      out.write("            .container{\n");
      out.write("            max-width: 350px;\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 25px 30px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0 10px 10px rgba(0, 0, 0, 0.15);\n");
      out.write("            margin-left: 450px;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            }\n");
      out.write("            .container form .title{\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight:600 ;\n");
      out.write("                margin: 20px 0 10px 0;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .container form .title::before{\n");
      out.write("                content: \"\";\n");
      out.write("                position: absolute;\n");
      out.write("                height: 3px;\n");
      out.write("                width: 33px;\n");
      out.write("                bottom: 0px;\n");
      out.write("                left: 0;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                background: linear-gradient(to right,#99004D 0%, #ff0080 100%);\n");
      out.write("            }\n");
      out.write("            .container form .input-box{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 45px;\n");
      out.write("                margin-top: 25px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .container form .input-box input,textarea{\n");
      out.write("                height: 100%;\n");
      out.write("                width: 100%;\n");
      out.write("                outline: none;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            .container form .underline::before{\n");
      out.write("                position: absolute;\n");
      out.write("                content: '';\n");
      out.write("                height: 2px;\n");
      out.write("                width: 100%;\n");
      out.write("                background: #ccc;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("            }\n");
      out.write("            .container form .underline::after{\n");
      out.write("                position: absolute;\n");
      out.write("                content: '';\n");
      out.write("                height: 2px;\n");
      out.write("                width: 100%;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                background: linear-gradient(to right,#99004D 0%, #ff0080 100%);\n");
      out.write("                transform: scaleX(0);\n");
      out.write("                transform-origin: left;\n");
      out.write("                transition: all 0.3s ease;\n");
      out.write("            }\n");
      out.write("            .container form .input-box textarea:focus ~ .underline::after,\n");
      out.write("            .container form .input-box textarea:valid ~ .underline::after{\n");
      out.write("                transform: scaleX(1);\n");
      out.write("                transform-origin: left;\n");
      out.write("            }\n");
      out.write("            .container form .input-box input:focus ~ .underline::after,\n");
      out.write("            .container form .input-box input:valid ~ .underline::after{\n");
      out.write("                transform: scaleX(1);\n");
      out.write("                transform-origin: left;\n");
      out.write("            }\n");
      out.write("            .container form .input-box input[type=\"submit\"]{\n");
      out.write("                font-size: 17px;\n");
      out.write("                color: #fff;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                background: linear-gradient(to right,#99004D 0%, #ff0080 100%);\n");
      out.write("                transition: all 0.3s ease;\n");
      out.write("            }\n");
      out.write("            .container form .input-box input[type=\"submit\"]:hover{\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("                background: linear-gradient(to left,#99004D 0%, #ff0080 100%);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <form action=\"contactUs\" method=\"POST\">\n");
      out.write("            <div class=\"title\">Contact Us</div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Your name\" name=\"name\" required>\n");
      out.write("                <div class=\"underline\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <input type=\"email\" placeholder=\"Enter Your Email\" name=\"email\" required>\n");
      out.write("                <div class=\"underline\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <input type=\"text\" placeholder=\"Enter the Subject\" name=\"subject\" required>\n");
      out.write("                <div class=\"underline\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                 <textarea name=\"message\" id=\"\" cols=\"30\" rows=\"10\" placeholder=\"Enter the Message\" required></textarea>\n");
      out.write("                <div class=\"underline\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                 <input type=\"submit\" value=\"Send\">\n");
      out.write("           </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
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
