    package model; 
    
public class Customers{
    
    private int customerID;
    private String firstName;
    private String lastName;
    private String addr1;
    private String addr2;
    private String city;
    private String state;
    private String zip;
    private String emailAddr;
   

     public Customers() {
        this.customerID = 0;
        this.firstName = "";
        this.lastName = "";
        this.addr1 = "";
        this.addr2 = "";
        this.city = "";
        this.state = "";
        this.zip = "";
        this.emailAddr = "";
    }


    
    public Customers(int customerID, String firstName, String lastName, String addr1, String addr2, String city, String state, String zip, String emailAddr) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.emailAddr = emailAddr;
    }
    
        public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }
    
     public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
     public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
 public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
     public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }




    @Override
    public String toString() {
        return "Customers{" + "customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName + ", addr1=" + addr1 + ", addr2=" + addr2 + ", city=" + city + ", state=" + state +", zip=" + zip +", emailAddr=" + emailAddr+ '}';
    }

    

  
    
    
    
           
}
