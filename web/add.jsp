<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add An Endangered Animal</title>
    </head>
    <body>
         <div class="wrap"> <!--div to hold all other divs -->
            
        <%@ include file="includes/header.jsp" %>
        
        <hr>
        <%@ include file="includes/menu.jsp" %>
        <hr>
        
        <div class="main"> <!--main div -->
            
        <h2>Add An Endangered Animal</h2>
        <div align="center">
        <form name="addForm" action="addAnimal" method="get">
            
            <table class="update">
                
                
            
                <tr>
                <td class="right">Animal Name:</td>
                <td><input type="text" name="animalname" value="" /></td>
                </tr>
            
                <tr>
                <td class="right">Scientific Name:</td>
                <td><input type="text" name="scientificname" value=""/></td>
                </tr>
                
                <tr>
                <td class="right">Status:</td>
                <td><input type="text" name="status" value=""/></td>
                </tr>
            
                <tr>
                <td class="right">Location:</td>
                <td><input type="text" name="location" value=""/></td>
                </tr>
                
                <tr>
                <td class="right">Habitat:</td>
                <td><input type="text" name="habitat" value=""/></td>
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
