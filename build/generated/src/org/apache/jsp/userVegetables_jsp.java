package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.servlet.annotation.MultipartConfig;
import java.io.InputStream;
import java.sql.*;

public final class userVegetables_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <title>Vegetables</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                font-family: 'Montserrat', sans-serif;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                padding:30px 40px;\n");
      out.write("            }\n");
      out.write("            .cartHeader{\n");
      out.write("                margin-top: -80px;\n");
      out.write("                float: right;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("                padding: 7px 10px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                width: 80px;\n");
      out.write("            }   \n");
      out.write("            .HeadingVege{\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                margin-left: 55px;\n");
      out.write("            }\n");
      out.write("            .item{width:150px;padding:10px;border:solid 5px ghostwhite;}\n");
      out.write("            .img { width:150px;border-bottom: solid 3px #c4cfce;height:150px;padding-bottom: 5px;cursor: pointer}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .grid-container{display:grid; grid-template-columns: auto auto auto auto auto; column-gap:50px; gap:15px;margin-left: 50px  ;}\n");
      out.write("\n");
      out.write("            .cart a{ text-decoration:none; color:black;}\n");
      out.write("            .cart{border:solid 3px #c4cfce;text-align: center; padding:5px;cursor: pointer;width:150px }\n");
      out.write("            .item:hover{border:solid 3px#81e096;}\n");
      out.write("            .price{color:#eda702; font-weight: 600;}\n");
      out.write("            .name{color:#156e21; font-weight:600; font-size:20px}\n");
      out.write("            .qty{font-weight:500;font-size:15px}\n");
      out.write("            .cart:hover{padding:5px;background-color:green;width:150px;text-align:center;color:aliceblue}\n");
      out.write("            .cart a:hover{color:aliceblue}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        <h1 class=\"HeadingVege\">Vegetables</h1>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            List<Map<String, String>> selectedVegetables = (List<Map<String, String>>) session.getAttribute("selectedVegetables");
        
      out.write("\n");
      out.write("        <div class=\"cartHeader\">\n");
      out.write("            <a href=\"SelectedVegetables.jsp\">\n");
      out.write("                <img src=\"images/Cart.png\" alt=\"Cart\" width=\"50\" height=\"50\">\n");
      out.write("            </a>\n");
      out.write("            <p>");
      out.print( (selectedVegetables != null) ? selectedVegetables.size() : 0 );
      out.write("</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"grid-container\">\n");
      out.write("        ");

            Connection con;
            PreparedStatement pst;
            ResultSet rs;
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/items","root","");
            
            String query = "select * from vegetables";
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
                String id = rs.getString("id");
                 
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"item\">\n");
      out.write("                <image src=\"view.jsp?id=");
      out.print(id);
      out.write("\" class=\"img\"/><br>\n");
      out.write("                <p class=\"name\">");
      out.print(rs.getString("vegetable_name"));
      out.write("</p>\n");
      out.write("                <p class=\"qty\">");
      out.print(rs.getString("vegetable_quantity"));
      out.write("</p>\n");
      out.write("                <p class=\"price\">Rs. ");
      out.print(rs.getInt("vegetable_price"));
      out.write("</p><br>\n");
      out.write("                <form action=\"addCart\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" name=\"vegetable_name\" value=\"");
      out.print(rs.getString("vegetable_name"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"vegetable_quantity\" value=\"");
      out.print(rs.getString("vegetable_quantity"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"vegetable_price\" value=\"");
      out.print(rs.getInt("vegetable_price"));
      out.write("\">\n");
      out.write("                    <a><input type=\"submit\" name=\"submit\" value=\"Add Cart\" class=\"cart\"></a>\n");
      out.write("                </form> \n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        </div>\n");
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
