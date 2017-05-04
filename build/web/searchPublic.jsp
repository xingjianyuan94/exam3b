
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Animals</title>
    </head>
    <body>
        <div class="wrap"> <!--div to hold all other divs -->
            
        <%@ include file="includes/header.jsp" %>
        
        <hr>
        <%@ include file="includes/menuPublic.jsp" %>
        <hr>
        
        <div class="main"> <!--main div -->
            
        <h2>Search Animals</h2>
        <div align="center">
        <form name="searchFormPublic" action="searchPublic" method="get">
            
            <input type="text" name="searchValPublic" value=""/>
            
            <br>
            
            <input type="submit" name="submit" value="SearchPublic"/>
        </form>
        </div>
        
         </div> <!-- close main div -->
        
        <hr>
        <%@ include file="includes/footer.jsp" %>
    </body>
</html>
