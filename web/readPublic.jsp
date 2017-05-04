<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Endangered Animals</title>
    </head>
    
    <% String table1 = (String) request.getAttribute("table1"); %>
    
    <body>
        
        <div class="wrap"> <!--div to hold all other divs -->
            
        <%@ include file="includes/header.jsp" %>
        
        <hr>
        <%@ include file="includes/menuPublic.jsp" %>
        <hr>
        
        <div class="main"> <!--main div -->
            
        <h2>Customers List</h2>
        <%= table1 %>
        
        
        <br><br>
        
        </div> <!-- close main div -->
        
        <hr>
        <%@ include file="includes/footer.jsp" %>
    </body>
</html>
