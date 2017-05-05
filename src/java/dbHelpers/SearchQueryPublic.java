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
import model.Customers;

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
    
     
     public void doSearch(String firstName){
         
         try {
             String query = "SELECT * FROM Customers WHERE (UPPER(firstName) LIKE ? OR UPPER(lastName) LIKE ?) ORDER BY customerID ASC";
             
             PreparedStatement ps = conn.prepareStatement(query);
             
             //fill the ?
             ps.setString(1, "%" + firstName.toUpperCase() + "%");
             ps.setString(2, "%" + firstName.toUpperCase() + "%");
             this.results = ps.executeQuery();
         } catch (SQLException ex) {
             Logger.getLogger(SearchQueryPublic.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     
     
     }
    
    
      
       public String getHTMLTable1(){
   
                
   String table1 = "";
   
   
  table1 += "<table>";
   
   
 
  
   table1 += "<tr>";
   table1 += "<th>CustomerID</th>";
   table1 += "<th>First Name</th>";
   table1 += "<th>Last Name</th>";
   table1 += "<th>Address 1</th>";
   table1 += "<th>Address 2</th>";
   table1 += "<th>City</th>";
   table1 += "<th>State</th>";
   table1 += "<th>Zip</th>";
   table1 += "<th>Email</th>";
   table1 += "</tr>";

   
   
   
            try {
                if(!this.results.isBeforeFirst()){
                table1 += "<tr>";
                table1 += "<ta colspan'6'>Sorry, this game does not exist in the database</td>";
                table1 += "</tr>";
                }
                else
                while(this.results.next()){
                    
                   Customers customer = new Customers();
                    customer.setCustomerID(this.results.getInt("customerID"));
                    customer.setFirstName(this.results.getString("firstName"));
                    customer.setLastName(this.results.getString("lastName"));
                    customer.setAddr1(this.results.getString("addr1"));
                    customer.setAddr2(this.results.getString("addr2"));
                    customer.setCity(this.results.getString("city"));
                    customer.setState(this.results.getString("state"));
                    customer.setZip(this.results.getString("zip"));
                    customer.setEmailAddr(this.results.getString("emailAddr"));

                    
                    table1 += "<tr>";
                    table1 += "<td>";
                    table1 += customer.getCustomerID();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 +=  customer.getFirstName();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += customer.getLastName();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += customer.getAddr1();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += customer.getAddr2();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += customer.getCity();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += customer.getState();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += customer.getZip();
                    table1 += "</td>";
                    
                    table1 += "<td>";
                    table1 += customer.getEmailAddr();
                    table1 += "</td>";
                    
                    
                    
                    table1 += "</tr>";
                   
                  
                }        } catch (SQLException ex) {
                Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
   
   
   table1 += "</table>";
  
        return table1;
            
   
   
   }
}
