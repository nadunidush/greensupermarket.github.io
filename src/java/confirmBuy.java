/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author betcom
 */
public class confirmBuy extends HttpServlet {
    private Object session;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet confirmBuy</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet confirmBuy at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Retrieve logged-in customer's details (you need to implement user authentication)
        //HttpSession session = request.getSession();
        //String customerEmail = (String) session.getAttribute("customerEmail");
        
        String customerEmail = request.getParameter("confirm_email");

        // Retrieve purchased items and total amount from session
        HttpSession session = request.getSession();
        List<Map<String, String>> selectedVegetables = (List<Map<String, String>>) session.getAttribute("selectedVegetables");
        
        if (selectedVegetables == null || selectedVegetables.isEmpty()) {
            // Handle the case where there are no selected vegetables
            out.println("Error: No selected vegetables.");
            return;
        }
        
        double totalAmount = 0.0;
        for (int i = 0; i < selectedVegetables.size(); i++) {
            double price = Double.parseDouble(selectedVegetables.get(i).get("price"));
            totalAmount += price;
        }

        // Configure email server details
        String host = "smtp.gmail.com";
        String port = "587";
        String username = "nadunidushera8@gmail.com";
        String password = "balp hvuz qrai iraj";

        // Set the sender's and recipient's email addresses
        String from = "nadunidushera8@gmail.com";
        String to = customerEmail;

        // Set the properties for the SMTP server
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Create a session with an authenticator
        Session emailSession = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        
        try {
            // Create a default MimeMessage object
            Message message = new MimeMessage(emailSession);

            // Set the sender's and recipient's email addresses
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            // Set the email subject and body
            message.setSubject("Purchase Confirmation");

            // Build the email body with item names and total amount
            StringBuilder emailBody = new StringBuilder();
            emailBody.append("Thank you for your purchase!\n\nPurchased Items:\n");

            for (int i = 0; i < selectedVegetables.size(); i++) {
                String itemName = selectedVegetables.get(i).get("name");
                double itemPrice = Double.parseDouble(selectedVegetables.get(i).get("price"));

                emailBody.append(itemName).append(": Rs.").append(itemPrice).append("\n");
            }

            emailBody.append("\nTotal Amount: Rs.").append(totalAmount);

            message.setText(emailBody.toString());

            // Send the email
            Transport.send(message);
            
            request.getSession().removeAttribute("selectedVegetables");
            // Redirect to a confirmation page
            response.sendRedirect("userHomePage.jsp");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }


}
