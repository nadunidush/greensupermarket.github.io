package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.servlet.annotation.MultipartConfig;
import java.io.InputStream;
import java.sql.*;

public final class AddFruit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <title>Admin Vegetables</title>\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: 'Montserrat', sans-serif;\n");
      out.write("        }\n");
      out.write("        .addVegetablesDiv{\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            height: 100vh;\n");
      out.write("        }\n");
      out.write("        .addVegetablesDiv table{\n");
      out.write("            background: linear-gradient(to bottom, #ffffff, #e0e0ff);\n");
      out.write("            border: 1px solid black;\n");
      out.write("            padding: 50px;\n");
      out.write("        }\n");
      out.write("        .addVegetablesDiv table caption{\n");
      out.write("            font-size: 29px;\n");
      out.write("            font-weight: 400;\n");
      out.write("        }\n");
      out.write("        .addVegetablesDiv table td{\n");
      out.write("             padding-top: 20px;\n");
      out.write("             padding-right: 20px;\n");
      out.write("        }\n");
      out.write("        .addVegetablesDiv label{\n");
      out.write("            font-weight: 600;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("        .addVegetablesDiv input{\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 5px;\n");
      out.write("        }\n");
      out.write("        #submit,#Clear{\n");
      out.write("            font-weight: 600;\n");
      out.write("            padding: 10px;\n");
      out.write("            width: 50%;\n");
      out.write("            background-color: lightblue;\n");
      out.write("            outline: none;\n");
      out.write("            border: 1px solid gray;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"addVegetablesDiv\">\n");
      out.write("        <table>\n");
      out.write("            <caption>Add A Fruit Product</caption>\n");
      out.write("            <form action=\"addVegetable\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"name\">Fruit Name: </label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"vegetable_name\" id=\"vegetable_name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"name\">Fruit Quantity(KG,G): </label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"vegetable_quantity\" id=\"vegetable_quantity\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"name\">Price: </label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"vegetable_price\" id=\"vegetable_price\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"file\">Fruit Photo: </label></td>\n");
      out.write("                    <td><input type=\"file\" name=\"fileContent\" id=\"fileContent\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"name\">Submit: </label></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"submit\" id=\"submit\" name=\"submit\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"name\">Clear: </label></td>\n");
      out.write("                    <td><input type=\"reset\" value=\"Clear\" id=\"Clear\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
