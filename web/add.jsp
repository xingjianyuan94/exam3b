<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a Customer</title>
    </head>
    <body>
         <div class="wrap"> <!--div to hold all other divs -->
            
        <%@ include file="includes/headerAdmin.jsp" %>
        
        <hr>
        <%@ include file="includes/menu.jsp" %>
        <hr>
        
        <div class="main"> <!--main div -->
            
        <h2>Add a Customer</h2>
        <div align="center">
        <form name="addForm" action="addCustomer" method="get">
            
            <table class="update">
                
                
            
                <tr>
                <td class="right">First Name:</td>
                <td><input type="text" name="firstName" value="" /></td>
                </tr>
            
                <tr>
                <td class="right">Last Name:</td>
                <td><input type="text" name="lastName" value=""/></td>
                </tr>
                
                <tr>
                <td class="right">Address 1:</td>
                <td><input type="text" name="addr1" value=""/></td>
                </tr>
            
                <tr>
                <td class="right">Address 2:</td>
                <td><input type="text" name="addr2" value=""/></td>
                </tr>
                
                <tr>
                <td class="right">City:</td>
                <td><input type="text" name="city" value=""/></td>
                </tr>
                
                <tr>
                <td class="right">State(Please Enter 2 Letters):</td>
                <td><input type="text" name="state" value=""/></td>
                </tr>
                
                <tr>
                <td class="right">Zip:</td>
                <td><input type="text" name="zip" value=""/></td>
                </tr>
                
                <tr>
                <td class="right">Email:</td>
                <td><input type="text" name="emailAddr" value=""/></td>
                </tr>
                
            </table>
            <br>
            <br>
            <input type="reset" name="reset" value="Clear"/>
            <input type="submit" name="submit" value="Submit"/>
            
        </form>
        </div>
         
         </div> <!-- close main div -->
        
        <hr>
        <%@ include file="includes/footer.jsp" %>
        
    </body>
</html>
