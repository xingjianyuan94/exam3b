<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.EndangeredAnimals"%>
<% EndangeredAnimals animal = (EndangeredAnimals) request.getAttribute("animal"); %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update An Endangered Animal</title>
    </head>
    <body>
        <div class="wrap"> <!--div to hold all other divs -->
            
        <%@ include file="includes/headerAdmin.jsp" %>
        
        <hr>
        <%@ include file="includes/menu.jsp" %>
        <hr>
        
        <div class="main"> <!--main div -->
            
        <h2>Update An Endangered Animal</h2>
        <div align="center">
        <form name="updateForm" action="updateAnimal" method="get">
            
           <table class="update">
                
                <tr>
                    <td class="right">Animal ID:</td>
                    <td><input type="text" name="animalid" value="<%= animal.getANIMALID() %>"  readonly /></td>
                </tr>
            
                <tr>
                <td class="right">Animal Name:</td>
                <td><input type="text" name="animalname" value="<%= animal.getANIMALNAME() %>" /></td>
                </tr>
            
                <tr>
                <td class="right">Scientific Name:</td>
                <td><input type="text" name="scientificname" value="<%= animal.getSCIENTIFICNAME() %>"/></td>
                </tr>
                
                <tr>
                <td class="right">Status:</td>
                <td><input type="text" name="status" value="<%= animal.getSTATUS() %>"/></td>
                </tr>
            
                <tr>
                <td class="right">Location:</td>
                <td><input type="text" name="location" value="<%= animal.getLOCATION() %>"/></td>
                </tr>
                
                <tr>
                <td class="right">Habitat:</td>
                <td><input type="text" name="habitat" value="<%= animal.getHABITAT() %>"/></td>
                </tr>
                
            </table>
                
            <br>
            <br>
            <input type="reset" name="reset" value="Clear"/>
            <input type="submit" name="submit" value="Update"/>
            
        </form>
        </div>
                </div> <!-- close main div -->
        
        <hr>
        <%@ include file="includes/footer.jsp" %>
    </body>
</html>
