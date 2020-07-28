//Magazine Class
import java.io.Serializable;

public class Mag extends Issue { // Mag Class
    //Attributes 
   private final String Num_Teuxos;
   private final String Num_Tomou;

    public Mag(String Type,String Title, String Num_Teuxos, String Year, String Num_Tomou, String Theme, String Location, String Page_num) {//Constructor
        super(Title, Year, Theme, Location, Page_num);
       this.Num_Teuxos = Num_Teuxos;
       this.Num_Tomou = Num_Tomou; 
    }
        
    //accessors / getters
    public String getNum_Teuxos() {
        return Num_Teuxos;
    }

    public String getNum_Tomou() {
        return Num_Tomou;
    }

    public String printInfo() { // Printing the mag's details 
        return   "MAGAZINE :\n{" + "\nTitle=" + this.Title + "\n Year=" + this.Year + "\n Theme=" + this.Theme + "\n Location=" + this.Location + "\n Page_num=" + Page_num  + "\n Num_Teuxos=" + Num_Teuxos+"\n"  + ", Num_Tomou=" + Num_Tomou+"\n" ;
    }

    
    
    
    
}
