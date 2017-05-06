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

public class ReadQuery {
    
        private Connection conn;
        private ResultSet results;
              
   public ReadQuery(){
       
   Properties props = new Properties();
   InputStream instr = getClass().getResourceAsStream("dbConn.properties");
            try {
                props.load(instr);
            } catch (IOException ex) {
                Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                instr.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
   
   String driver = props.getProperty("driver.name");
   String url = props.getProperty("server.name");
   String username = props.getProperty("user.name");
   String passwd = props.getProperty("user.password");
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn = DriverManager.getConnection(url,username, passwd);
            } catch (SQLException ex) {
                Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
   
   public void doRead(){
        
        
            try {
                String query = "SELECT * FROM Customers ORDER BY customerID ASC";
                
                PreparedStatement ps = conn.prepareStatement(query);
                this.results = ps.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
   
   
   public String getHTMLTable(){
   
                
   String table = "";
   
   
  table += "<table class= 'tableformat'>";
   
   
 
  
   table += "<tr class='tablehead'>";
   table += "<th>CustomerID</th>";
   table += "<th>First Name</th>";
   table += "<th>Last Name</th>";
   table += "<th>Address 1</th>";
   table += "<th>Address 2</th>";
   table += "<th>City</th>";
   table += "<th>State</th>";
   table += "<th>Zip</th>";
   table += "<th>Email</th>";
   table += "<th>Update/Delete</th>";
   table += "</tr>";

   
   
   
            try {
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

                    
                    table += "<tr>";
                    table += "<td>";
                    table += customer.getCustomerID();
                    table += "</td>";
                    
                    table += "<td>";
                    table +=  customer.getFirstName();
                    table += "</td>";
                    
                    table += "<td>";
                    table += customer.getLastName();
                    table += "</td>";
                    
                    table += "<td>";
                    table += customer.getAddr1();
                    table += "</td>";
                    
                    table += "<td>";
                    table +=customer.getAddr2();
                    table += "</td>";
                    
                    table += "<td>";
                    table += customer.getCity();
                    table += "</td>";
                    
                    table += "<td>";
                    table += customer.getState();
                    table += "</td>";
                    
                    table += "<td>";
                    table += customer.getZip();
                    table += "</td>";
                    
                    table += "<td>";
                    table += customer.getEmailAddr();
                    table += "</td>";
                    
                    table += "<td>";
                    table += "<a href=update?customerID=" + customer.getCustomerID() + ">Update /  </a>"+"<a href=delete?customerID=" + customer.getCustomerID() + ">Delete </a>";
                    table += "</td>";
                    
                    table += "</tr>";
                    
                }        } catch (SQLException ex) {
                Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
   
   
   table += "</table>";
  
        return table;
   
   
   
   }
   
   
}
