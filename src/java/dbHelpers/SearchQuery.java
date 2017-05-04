package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.EndangeredAnimals;

public class SearchQuery {
    
     private Connection conn;
     private ResultSet results;
     
     public SearchQuery(){
     Properties props = new Properties();
   InputStream instr = getClass().getResourceAsStream("dbConn.properties");
            try {
                props.load(instr);
            } catch (IOException ex) {
                Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                instr.close();
            } catch (IOException ex) {
                Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
   
   String driver = props.getProperty("driver.name");
   String url = props.getProperty("server.name");
   String username = props.getProperty("user.name");
   String passwd = props.getProperty("user.password");
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn = DriverManager.getConnection(url,username, passwd);
            } catch (SQLException ex) {
                Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
     
     }
    
     
     public void doSearch(String ANIMALNAME){
         
         try {
             String query = "SELECT * FROM ENDANGEREDANIMALS WHERE UPPER(ANIMALNAME) LIKE ? ORDER BY ANIMALID ASC";
             
             PreparedStatement ps = conn.prepareStatement(query);
             
             //fill the ?
             ps.setString(1, "%" + ANIMALNAME.toUpperCase() + "%");
             this.results = ps.executeQuery();
         } catch (SQLException ex) {
             Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     
     
     }
    
      public String getHTMLTable(){
   
                
   String table = "";
   
   
  table += "<table>";
   
   
 
  
   table += "<tr>";
   table += "<th>AnimalID</th>";
   table += "<th>AnimalName</th>";
   table += "<th>ScientificName</th>";
   table += "<th>Status</th>";
   table += "<th>Location</th>";
   table += "<th>Habitat</th>";
   table += "<th>Update/ Delete</th>";
   table += "</tr>";

   
   
   
            try {
                if(!this.results.isBeforeFirst()){
                table += "<tr>";
                table += "<ta colspan'6'>Sorry, this game does not exist in the database</td>";
                table += "</tr>";
                }
                else
                while(this.results.next()){
                    
                    EndangeredAnimals animal = new EndangeredAnimals();
                    animal.setANIMALID(this.results.getInt("ANIMALID"));
                    animal.setANIMALNAME(this.results.getString("ANIMALNAME"));
                    animal.setSCIENTIFICNAME(this.results.getString("SCIENTIFICNAME"));
                    animal.setSTATUS(this.results.getString("STATUS"));
                    animal.setLOCATION(this.results.getString("LOCATION"));
                    animal.setHABITAT(this.results.getString("HABITAT"));

                    
                    table += "<tr>";
                    table += "<td>";
                    table += animal.getANIMALID();
                    table += "</td>";
                    
                    table += "<td>";
                    table += animal.getANIMALNAME();
                    table += "</td>";
                    
                    table += "<td>";
                    table += animal.getSCIENTIFICNAME();
                    table += "</td>";
                    
                    table += "<td>";
                    table += animal.getSTATUS();
                    table += "</td>";
                    
                    table += "<td>";
                    table += animal.getLOCATION();
                    table += "</td>";
                    
                    table += "<td>";
                    table += animal.getHABITAT();
                    table += "</td>";
                    
                    table += "<td>";
                    table += "<a href=update?ANIMALID=" + animal.getANIMALID() + ">Update </a>"+"<a href=delete?ANIMALID=" + animal.getANIMALID() + ">Delete </a>";
                    table += "</td>";
                    
                    table += "</tr>";
                    
                }        } catch (SQLException ex) {
                Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
   
   
   table += "</table>";
  
        return table;
            
   
   
   }
      
      
}
