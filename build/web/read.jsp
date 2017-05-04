<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Endangered Animals</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        
        <div class="wrap"> <!--div to hold all other divs -->
            
        <%@ include file="includes/header.jsp" %>
        
        <hr>
        <%@ include file="includes/menu.jsp" %>
        <hr>
        
        <div class="main"> <!--main div -->
            
        <h2>Endangered Animals</h2>
        <%= table %>
        
        
        <br><br>
        
        </div> <!-- close main div -->
        
        <hr>
        <%@ include file="includes/footer.jsp" %>
    </body>
</html>
