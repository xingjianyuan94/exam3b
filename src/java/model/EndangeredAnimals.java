    package model; 
    
public class EndangeredAnimals{
    
    private int ANIMALID;
    private String ANIMALNAME;
    private String SCIENTIFICNAME;
    private String STATUS;
    private String LOCATION;
    private String HABITAT;

     public EndangeredAnimals() {
        this.ANIMALID = 0;
        this.ANIMALNAME = "";
        this.SCIENTIFICNAME = "";
        this.STATUS = "";
        this.LOCATION = "";
        this.HABITAT = "";
    }


    
    public EndangeredAnimals(int ANIMALID, String ANIMALNAME, String SCIENTIFICNAME, String STATUS, String LOCATION, String HABITAT) {
        this.ANIMALID = ANIMALID;
        this.ANIMALNAME = ANIMALNAME;
        this.SCIENTIFICNAME = SCIENTIFICNAME;
        this.STATUS = STATUS;
        this.LOCATION = LOCATION;
        this.HABITAT = HABITAT;
    }
    
        public int getANIMALID() {
        return ANIMALID;
    }

    public void setANIMALID(int ANIMALID) {
        this.ANIMALID = ANIMALID;
    }

    public String getANIMALNAME() {
        return ANIMALNAME;
    }

    public void setANIMALNAME(String ANIMALNAME) {
        this.ANIMALNAME = ANIMALNAME;
    }

    public String getSCIENTIFICNAME() {
        return SCIENTIFICNAME;
    }

    public void setSCIENTIFICNAME(String SCIENTIFICNAME) {
        this.SCIENTIFICNAME = SCIENTIFICNAME;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }
    
     public String getHABITAT() {
        return HABITAT;
    }

    public void setHABITAT(String HABITAT) {
        this.HABITAT = HABITAT;
    }

    @Override
    public String toString() {
        return "EndangeredAnimals{" + "ANIMALID=" + ANIMALID + ", ANIMALNAME=" + ANIMALNAME + ", SCIENTIFICNAME=" + SCIENTIFICNAME + ", STATUS=" + STATUS + ", LOCATION=" + LOCATION + ", HABITAT=" + HABITAT + '}';
    }

    

  
    
    
    
           
}
