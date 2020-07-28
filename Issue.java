//Issue Class
import java.io.Serializable;
import java.util.List;


public abstract class Issue implements Serializable { // Class Issue ( Master Class for Books and Mags ) that is serializable
    // attributes
    //private static final long serialVersionUID = 1L; (serialization id)
   
    protected final String Title;
    protected final String Year;
    protected final String Theme;
    protected final String Location;
    protected final String Page_num;
    abstract String printInfo();

    public Issue(String Title, String Year, String Theme, String Location, String Page_num) {// constructor 
        
        this.Title = Title;
        this.Year = Year;
        this.Theme = Theme;
        this.Location = Location;
        this.Page_num = Page_num;
    }
    
    


   
//getters 
   
    

    protected String getTitle() {
        return Title;
    }

    protected String getYear() {
        return Year;
    }

    protected String getTheme() {
        return Theme;
    }

    protected String getLocation() {
        return Location;
    }

    protected String getPage_num() {
        return Page_num;
    }
 
 
 
 
 
 
 
}
