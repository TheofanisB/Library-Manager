//Theo B
public class Book extends Issue { // class that inherits from issue and is serializable  
    // dilosi attributes tis klasis 
  
    private final String ISBN;
    private final String Writter;
    private final String Description;
    public Book(String Type,String Title, String ISBN, String Writter, String Year, String Description, String Location, String Page_num, String Theme) {
        super(Title, Year, Theme, Location, Page_num);
        this.ISBN = ISBN;
        this.Writter = Writter;
        this.Description = Description;
    }
    

   
    // getters 
    public String getTitle() {
        return Title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getWritter() {
        return Writter;
    }

    public String getYear() {
        return Year;
    }

    public String getDescription() {
        return Description;
    }

    public String getLocation() {
        return Location;
    }

    public String getPage_num() {
        return Page_num;
    }

    public String getTheme() {
        return Theme;
    }
    
    
    public String printInfo() {// Printing Function 
        return "Book{" + "Title=" + this.Title +"\n"  + ", ISBN=" + this.ISBN+"\n"  + ", Writter=" + this.Writter+"\n"  + ", Year=" + this.Year+"\n"  + ", Description=" + this.Description+"\n"  + ", Location=" + this.Location+"\n"  + ", Page_num=" + this.Page_num +"\n" + ", Theme=" + this.Theme +"\n" + '}';
    }
    
    
    
    
    
    
}
