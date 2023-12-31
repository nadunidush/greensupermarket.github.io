package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <title>Admin Home Page</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: 'Montserrat', sans-serif;\n");
      out.write("            }\n");
      out.write("            .maniCatagories{\n");
      out.write("                margin: 0;\n");
      out.write("                display: grid;\n");
      out.write("                grid-template-columns: 1fr 1fr 1fr 1fr;\n");
      out.write("                place-items: center;\n");
      out.write("                height: 100vh;\n");
      out.write("            }\n");
      out.write("            .items{\n");
      out.write("                width: auto;\n");
      out.write("                height: auto;\n");
      out.write("                border: 1px solid gray;\n");
      out.write("                padding: 20px;\n");
      out.write("                background: linear-gradient(to bottom, #ffffff, #e0e0ff);\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"maniCatagories\">\n");
      out.write("        <div class=\"Vegetables items\" onclick=\"navigateToVegetables('adminAllVegetables.jsp')\">\n");
      out.write("            <p>Vegetables</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"Fruits items\" onclick=\"navigateToVegetables('adminAllFruits.jsp')\">\n");
      out.write("            <p>Fruits</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"Meat items\" onclick=\"navigateToVegetables('adminAllMeats.jsp')\">\n");
      out.write("            <p>Meat</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"Fish items\" onclick=\"navigateToVegetables('adminAllFishes.jsp')\">\n");
      out.write("            <p>Fish</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"Beverages items\" onclick=\"navigateToVegetables('adminAllBeverages.jsp')\">\n");
      out.write("            <p>Beverages</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"Chilled items\" onclick=\"navigateToVegetables('adminAllChilled.jsp')\">\n");
      out.write("            <p>Chilled</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"FrozenFood items\" onclick=\"navigateToVegetables('adminAllFrozens.jsp')\">\n");
      out.write("            <p>FrozenFood</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"Grocery items\" onclick=\"navigateToVegetables('adminAllGrocery.jsp')\">\n");
      out.write("            <p>Grocery</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"Homeware items\" onclick=\"navigateToVegetables('adminAllHomeware.jsp')\">\n");
      out.write("            <p>Homeware</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"Household items\">\n");
      out.write("            <p>Household</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function navigateToVegetables(page) {\n");
      out.write("          window.location.href = page;\n");
      out.write("        }\n");
      out.write("      </script>\n");
      out.write("</body>\n");
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
