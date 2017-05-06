<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customers"%>
<% Customers customer = (Customers) request.getAttribute("customer"); %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update a Customer</title>
    </head>
    <body>
        <div class="wrap"> <!--div to hold all other divs -->
            
        <%@ include file="includes/headerAdmin.jsp" %>
        
        <hr>
        <%@ include file="includes/menu.jsp" %>
        <hr>
        
        <div class="main"> <!--main div -->
            
        <h2>Update a Customer</h2>
        <div align="center">
        <form name="updateForm" action="updateCustomer" method="get">
            
           <table class="tableformat">
                
                <tr>
                    <td class="tablerow">Customer ID:</td>
                    <td><input type="text" name="customerID" value="<%= customer.getCustomerID() %>"  readonly /></td>
                </tr>
            
                <tr>
                <td class="tablerow">First Name:</td>
                <td><input type="text" name="firstName" value="<%= customer.getFirstName() %>" /></td>
                </tr>
            
                <tr>
                <td class="tablerow">Last Name:</td>
                <td><input type="text" name="lastName" value="<%= customer.getLastName() %>"/></td>
                </tr>
                
                <tr>
                <td class="tablerow">Address 1:</td>
                <td><input type="text" name="addr1" value="<%= customer.getAddr1() %>"/></td>
                </tr>
            
                <tr>
                <td class="tablerow">Address 2:</td>
                <td><input type="text" name="addr2" value="<%= customer.getAddr2() %>"/></td>
                </tr>
                
                <tr>
                <td class="tablerow">City:</td>
                <td><input type="text" name="city" value="<%= customer.getCity() %>"/></td>
                </tr>
                
                <tr>
                <td class="tablerow">State:</td>
                <td><input type="text" name="state" value="<%= customer.getState() %>"/></td>
                </tr>
                
                <tr>
                <td class="tablerow">Zip:</td>
                <td><input type="text" name="zip" value="<%= customer.getZip() %>"/></td>
                </tr>
                
                <tr>
                <td class="tablerow">Email:</td>
                <td><input type="text" name="emailAddr" value="<%= customer.getEmailAddr() %>"/></td>
                </tr>
                
            </table>
                
            <br>
            <br>
               <input type="submit" name="submit" value="Submit"/>
            
            
        </form>
        </div>
                </div> <!-- close main div -->
        
        <hr>
        <%@ include file="includes/footer.jsp" %>
    </body>
    
    
</html>

