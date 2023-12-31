package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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

public final class adminAllVegetables_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin All Vegetables</title>\n");
      out.write("        <style>\n");
      out.write("            .vegetablecontent{\n");
      out.write("                display: grid;\n");
      out.write("                grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr;\n");
      out.write("                gap:20px;\n");
      out.write("            }\n");
      out.write("            .adminvege{\n");
      out.write("                border: 1px solid black;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            .editadelete{\n");
      out.write("                display:flex;\n");
      out.write("                margin-left: 40px;\n");
      out.write("            }\n");
      out.write("            .editadelete #delete{\n");
      out.write("                margin-left: 20px;\n");
      out.write("            }\n");
      out.write("            .addvegetable{\n");
      out.write("                padding: 8px 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1>All vegetables!</h1>\n");
      out.write("        <button class=\"addvegetable\"><a href=\"AddVegetable.jsp\">Add a Vegetable</a></button>\n");
      out.write("        <div class=\"vegetablecontent\">\n");
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
      out.write("        <div class=\"adminvege\">\n");
      out.write("                <image src=\"view.jsp?id=");
      out.print(id);
      out.write("\" width=\"100\" height=\"100\"/>\n");
      out.write("                <p>");
      out.print(rs.getString("vegetable_name"));
      out.write("</p>\n");
      out.write("                <p>");
      out.print(rs.getString("vegetable_quantity"));
      out.write("</p>\n");
      out.write("                <p>");
      out.print(rs.getInt("vegetable_price"));
      out.write("</p>\n");
      out.write("                <div class=\"editadelete\">\n");
      out.write("                    <form action=\"EditVegetables.jsp\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"vegetableId\" value=\"");
      out.print( id );
      out.write("\">\n");
      out.write("                        <input type=\"submit\" name=\"edit\" value=\"Edit\">\n");
      out.write("                    </form>\n");
      out.write("                    <form action=\"adminVegetableDelete\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"vegetableId\" value=\"");
      out.print( id );
      out.write("\">\n");
      out.write("                        <input type=\"submit\" name=\"delete\" value=\"Delete\" id=\"delete\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        \n");
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
