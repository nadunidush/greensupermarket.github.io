package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class SelectedVegetables_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Poppins:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400&family=Quicksand:wght@300;400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <title>Selected Vegetables</title>\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: 'Montserrat', sans-serif;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            background-color: #F5F5DC;\n");
      out.write("        }\n");
      out.write("        .cartheadingh{\n");
      out.write("            margin-top: 30px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .cartheadingp{\n");
      out.write("            margin-top: 20px;\n");
      out.write("            margin-left: 250px;\n");
      out.write("        }\n");
      out.write("        .Buyatotal{\n");
      out.write("            display:flex;\n");
      out.write("            align-items: center;\n");
      out.write("            gap:50px;\n");
      out.write("            margin-left: 760px;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("        .Buyatotal input{\n");
      out.write("            padding:9px 30px;\n");
      out.write("            background-color: #4CBB17;\n");
      out.write("            outline: none;\n");
      out.write("            border:none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-weight: 600;\n");
      out.write("        }\n");
      out.write("        .selecteditems{\n");
      out.write("            margin-left: 250px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            border-spacing: 0;\n");
      out.write("            border-radius: 12px 12px 0px 0px;\n");
      out.write("            overflow: hidden;\n");
      out.write("            box-shadow: 0px 2px 5px rgba(32,32,32,.3);\n");
      out.write("        }\n");
      out.write("        .selecteditems th,td{\n");
      out.write("            padding: 12px 15px;\n");
      out.write("        }\n");
      out.write("        .selecteditems th{\n");
      out.write("            background-color: lightblue;\n");
      out.write("        }\n");
      out.write("        .selecteditems tr:nth-child(odd){\n");
      out.write("            background-color: #eeeeee;\n");
      out.write("        }\n");
      out.write("        .selecteditems button{\n");
      out.write("            padding:2px 15px;\n");
      out.write("            font-weight: 900;\n");
      out.write("        }\n");
      out.write("        .delete{\n");
      out.write("            padding: 4px 20px;\n");
      out.write("            background-color: red;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            outline: none;\n");
      out.write("            border:none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-weight: 500;\n");
      out.write("        }\n");
      out.write("        .vegempty{\n");
      out.write("            margin-left: 250px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1 class=\"cartheadingh\">Cart Items</h1>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        List<Map<String, String>> selectedVegetables = (List<Map<String, String>>) session.getAttribute("selectedVegetables");
    
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <p class=\"cartheadingp\">Total Items: ");
      out.print( (selectedVegetables != null) ? selectedVegetables.size() : 0 );
      out.write("</p>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <table class=\"selecteditems\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Vegetable Name</th>\n");
      out.write("            <th>Vegetable Quantity</th>\n");
      out.write("            <th>Decrease</th>\n");
      out.write("            <th>Vegetable Price</th>\n");
      out.write("            <th>Increase</th>\n");
      out.write("            <th>Delete</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
 if (selectedVegetables == null || selectedVegetables.isEmpty()) { 
      out.write("\n");
      out.write("        <p class=\"vegempty\">Selected Items are Empty</p>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("        ");

            double totalAmount = 0.0;
            for (int i = 0; i < selectedVegetables.size(); i++) {
                double price = Double.parseDouble(selectedVegetables.get(i).get("price"));
                totalAmount += price;
        
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( selectedVegetables.get(i).get("name") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( selectedVegetables.get(i).get("quantity") );
      out.write("</td>\n");
      out.write("                <td><button onclick=\"updatePrice('");
      out.print( i );
      out.write("', 'decrease')\">-</button></td>\n");
      out.write("                <td>Rs.<span id=\"price_");
      out.print( i );
      out.write('"');
      out.write('>');
      out.print( selectedVegetables.get(i).get("price") );
      out.write("</span></td>\n");
      out.write("                <td><button onclick=\"updatePrice('");
      out.print( i );
      out.write("', 'increase')\">+</button></td>\n");
      out.write("                <td>\n");
      out.write("                    <form action=\"deleteVegetable\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"vegetableIndex\" value=\"");
      out.print( i );
      out.write("\">\n");
      out.write("                        <input type=\"submit\" name=\"delete\" value=\"Delete\" class=\"delete\">\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </table>\n");
      out.write("    <div class=\"Buyatotal\">\n");
      out.write("        <p>Total Amount: Rs.<span id=\"totalAmount\">");
      out.print( totalAmount );
      out.write("</span></p>\n");
      out.write("        <form action=\"buyItems\" method=\"post\">\n");
      out.write("            <input type=\"submit\" name=\"buy\" value=\"Buy\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("        <script>\n");
      out.write("            function updatePrice(index, operation) {\n");
      out.write("                \n");
      out.write("                var priceElement = document.getElementById(\"price_\" + index);\n");
      out.write("                var totalAmountElement = document.getElementById(\"totalAmount\");\n");
      out.write("\n");
      out.write("                // Get the current price value\n");
      out.write("                var currentPrice = parseFloat(priceElement.innerText);\n");
      out.write("\n");
      out.write("                // Set the minimum allowed price\n");
      out.write("                var minPrice = parseFloat('");
      out.print( selectedVegetables.get(0).get("price") );
      out.write("');\n");
      out.write("\n");
      out.write("                // Update the price based on the operation, with a check for the minimum price\n");
      out.write("                if (operation === 'increase') {\n");
      out.write("                    currentPrice *= 2; // Double the price\n");
      out.write("                } else if (operation === 'decrease' && currentPrice > minPrice) {\n");
      out.write("                    currentPrice /= 2; // Reduce the price by half\n");
      out.write("                    \n");
      out.write("                     currentPrice = Math.max(currentPrice, minPrice);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Update the displayed price\n");
      out.write("                priceElement.innerText = currentPrice.toFixed(2);\n");
      out.write("\n");
      out.write("                // Update the total amount\n");
      out.write("                var totalAmount = 0.0;\n");
      out.write("                ");
 for (int i = 0; i < selectedVegetables.size(); i++) { 
      out.write("\n");
      out.write("                    totalAmount += parseFloat(document.getElementById(\"price_");
      out.print( i );
      out.write("\").innerText);\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                totalAmountElement.innerText = totalAmount.toFixed(2);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
