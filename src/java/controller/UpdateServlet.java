package controller;

import dbHelpers.UpdateQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customers;


@WebServlet(name = "UpdateServlet", urlPatterns = {"/updateCustomer"})
public class UpdateServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //pass execution on to doPost
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //get the form data and set up an Customer object
        int customerID = Integer.parseInt(request.getParameter("customerID"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String addr1 = request.getParameter("addr2");
        String addr2 = request.getParameter("addr1");
        String city= request.getParameter("city");
        String state= request.getParameter("state");
        String zip= request.getParameter("zip");
        String emailAddr= request.getParameter("emailAddr");
        
        Customers customer = new Customers();
        customer.setCustomerID(customerID);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setAddr1(addr1);
        customer.setAddr2(addr2);
        customer.setCity(city);
        customer.setState(state);
        customer.setZip(zip);
        customer.setEmailAddr(emailAddr);
        
        //create an UpdateQuery and use it to update the friend
        UpdateQuery uq = new UpdateQuery();
        uq.doUpdate(customer);
        
        //pass control to the ReadServlet
        String url ="/read";
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
        
        

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
