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

public class SearchQueryPublic {
    
     private Connection conn;
     private ResultSet results;
     
     public SearchQueryPublic(){
     Properties props = new Properties();
   InputStream instr = getClass().getResourceAsStream("dbConn.properties");
            try {
                props.load(instr);
            } catch (IOException ex) {
                Logger.getLogger(SearchQueryPublic.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                instr.close();
            } catch (IOException ex) {
                Logger.getLogger(SearchQueryPublic.class.getName()).log(Level.SEVERE, null, ex);
            }
   
   String driver = props.getProperty("driver.name");
   String url = props.getProperty("server.name");
   String username = props.getProperty("user.name");
   String passwd = props.getProperty("user.password");
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchQueryPublic.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn = DriverManager.getConnection(url,username, passwd);
            } catch (SQLException ex) {
                Logger.getLogger(SearchQueryPublic.class.getName()).log(Level.SEVERE, null, ex);
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
             Logger.getLogger(SearchQueryPublic.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     
     
     }
    
      public String getHTMLTable1(){
   
                
   String table1 = "";
   
   
  table1 += "<table>";
   
   
 
  
   table1 += "<tr>";
   table1 += "<th>AnimalID</th>";
   table1 += "<th>AnimalName</th>";
   table1 += "<th>ScientificName</th>";
   table1 += "<th>Status</th>";
   table1 += "<th>Location</th>";
   table1 += "<th>Habitat</th>";
   table1 += "</tr>";

   
   
   
            try {
                if(!this.results.isBeforeFirst()){
                table1 += "<tr>";
                table1 += "<ta colspan'6'>Sorry, this game does not exist in the database</td>";
                table1 += "</tr>";
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

                    
                    table1 += "<tr>";
                    table1 += "<td>";
                    table1 += animal.getANIMALID();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += animal.getANIMALNAME();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += animal.getSCIENTIFICNAME();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += animal.getSTATUS();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += animal.getLOCATION();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += animal.getHABITAT();
                    table1 += "</td>";
                    
                    
                    
                    table1 += "</tr>";
                    
                }        } catch (SQLException ex) {
                Logger.getLogger(SearchQueryPublic.class.getName()).log(Level.SEVERE, null, ex);
            }
   
   
   table1 += "</table>";
  
        return table1;
            
   
   
   }
      
      
}
