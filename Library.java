//Bakitas Theofanis 321/2015133
//1_i ergasia katanemimena 
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Library extends JFrame {

    //------------TABS 
    private JLabel tab_name1;
    private JLabel tab_name2;
    private JLabel tab_name3;
    private JLabel tab_name4;
    private JTabbedPane karteles;
    //-----------------------Kartela_1 // Tab 1 ( Add a Book )
    private JPanel kartela1;
    // Labels of Tab 1
    private JLabel title_label;
    private JLabel isbn_label;
    private JLabel writter_label;
    private JLabel year_label;
    private JLabel description_label;
    private JLabel location_label;
    private JLabel page_num_label;
    private JLabel theme_label;
    //TextFields of Tab 1
    private JTextField title;
    private JTextField isbn;
    private JTextField writter;
    private JTextField year;
    private JTextField description;
    private JTextField location;
    private JTextField pagenum;
    private JTextField theme;

    //---------------------Kartela_2 Tab 2 ( Search a Book )
    private JPanel kartela2;
    //-----------connecting button groups 
    private ButtonGroup button_group;
    private JPanel bg1;
    private JPanel bg2;
    private ButtonGroup button_group2;
    private JPanel bg3;
    private JPanel bg4;
     // selection criteria
     //Radio Buttons for look up criteria 
    private JRadioButton proti;//titlos se vivlio- Book Title
    private JRadioButton deuteri;//isbn vivliou -  Book ISBN
    private JRadioButton triti;// titlos se periodiko- Magazine Title
    private JRadioButton tetarti;// year se periodiko- Magagine Year of release 

  
    

    //---arxeia ( koutakia pou simpliroxnei o xristis)
    private JTextField input_box; // JTextField where the user types their lookup criteria ( On the "Search a Book" Tab )
    private JTextField input_box2;// JTextField where the user types their lookup criteria ( On the "Search a Mag" Tab )
    //--- Koumpia 
    private JButton add_book_button;
    private JButton search_book;
    private JButton add_mag_button;
    private JButton search_mag;

    //--Kartela 3 - Tab 3 ( Add a Mag ) 
    private JPanel kartela3;

    private JLabel num_teuxos_label;
    private JLabel num_tomou_label;
     private JLabel theme_label2; 
        
    private JTextField title2;
    private JTextField year2;
    private JTextField location2;
    private JTextField pagenum2;
    private JTextField theme2;
    private JTextField Num_Teuxos;
    private JTextField Num_Tomou;
    
    //--Kartela 4 -Tab 4( Search a Mag )
     private JPanel kartela4;

    public Library() {
        //constructor of library 
        super("----Library Manager----");
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
     
       
        //-- formation of library menu 
        karteles = new JTabbedPane();
        getContentPane().add(karteles);
        kartela1 = new JPanel();
        kartela1.setLayout(new GridLayout(20, 1));
        kartela2 = new JPanel();
        kartela2.setLayout(new GridLayout(3,1));
        kartela3 = new JPanel();
        kartela3.setLayout(new GridLayout(20, 1));
        kartela4 = new JPanel();
        kartela4.setLayout(new GridLayout(3,1));

        //---Setting up the book addition tab  ( TAB 1)
        tab_name1 = new JLabel("Add a Book in Library:", JLabel.CENTER);
        //Tab 1 
        kartela1.add(tab_name1);
       isbn = new JTextField();
        writter = new JTextField();
        description = new JTextField();
        title = new JTextField();//
        year = new JTextField();//
        theme = new JTextField();//
        location = new JTextField();//
        pagenum = new JTextField();//

        title_label = new JLabel("Title:");
        isbn_label = new JLabel("ISBN:");
        writter_label = new JLabel("Author:");
        description_label = new JLabel("Description:");
        year_label = new JLabel("Year of Release:");
        theme_label = new JLabel("Theme:"); 
        location_label = new JLabel("Location:");
        page_num_label = new JLabel("Number of Pages:"); 
        kartela1.add(title_label);
        kartela1.add(title);
        kartela1.add(isbn_label);
        kartela1.add(isbn);
        kartela1.add(writter_label);
        kartela1.add(writter);
        kartela1.add(description_label);
        kartela1.add(description);
        kartela1.add(year_label);
        kartela1.add(year);
        kartela1.add(theme_label);
        kartela1.add(theme);
        kartela1.add(location_label);
        kartela1.add(location);
        kartela1.add(page_num_label);
        kartela1.add(pagenum);

        add_book_button = new JButton("Submit");
        kartela1.add(add_book_button);//------------End of Tab  ------------------------------------------

        //-- Search a Book Tab 
        tab_name2 = new JLabel("Search for a Book in Library:");

        kartela2.add(tab_name2);
        proti = new JRadioButton("Title");
        deuteri = new JRadioButton("ISBN");
        button_group = new ButtonGroup();
        button_group.add(proti);
        button_group.add(deuteri);
        // button group 1 & button group 2
        bg1 = new JPanel();
        bg1.setLayout(new FlowLayout());
        bg2 = new JPanel();
        bg2.setLayout(new GridLayout(2, 1));
        bg1.add(proti);
        bg1.add(deuteri);
        input_box = new JTextField();
        bg2.add(input_box);

        search_book = new JButton("Search");
        bg2.add(search_book);

        kartela2.add(bg1);
        kartela2.add(bg2);

        
         //-------------- (Tab 3 )// Add a Magazine Tab 
        tab_name3 = new JLabel("Add a Magazine in Library:", JLabel.CENTER);
        kartela3.add(tab_name3);
        title2 = new JTextField();
        Num_Teuxos = new JTextField();
        year2 = new JTextField();
        Num_Tomou = new JTextField();
        theme2 = new JTextField();
        location2 = new JTextField();
        pagenum2 = new JTextField();
        theme_label2 = new JLabel("Theme:"); 

        title_label = new JLabel("Title:");
        num_teuxos_label = new JLabel("Number of Issue:");
        year_label = new JLabel("Year of Release:");
        num_tomou_label = new JLabel("Arithmos Tomou:");
        location_label = new JLabel("Location:");
        page_num_label = new JLabel("Number of Pages:");

        kartela3.add(title_label);
        kartela3.add(title2);
        kartela3.add(num_teuxos_label);
        kartela3.add(Num_Teuxos);
        
        kartela3.add(year_label);
        kartela3.add(year2);
        kartela3.add(num_tomou_label);
        kartela3.add(Num_Tomou);
        kartela3.add(theme_label2);
        kartela3.add(theme2);
        kartela3.add(location_label);
        kartela3.add(location2);
        kartela3.add(page_num_label);
        kartela3.add(pagenum2);

        add_mag_button = new JButton("Submit");
        kartela3.add(add_mag_button);//------------end of tab  ------------------------------------------
        
        
        //---KARTELA 4
        //-- ( TAB 4 )/ Search a Mag Tab 
        tab_name4 = new JLabel("Search for a Mag in Library:");

        kartela4.add(tab_name4);
        triti = new JRadioButton("Title");
        tetarti = new JRadioButton("Year");
        button_group2 = new ButtonGroup();
        button_group2.add(triti);
        button_group2.add(tetarti);
       //button groups 3 k 4
        bg3 = new JPanel();
        bg3.setLayout(new GridLayout(2,1));
        bg4 = new JPanel();
        bg4.setLayout(new GridLayout(2, 1));
        bg3.add(triti);
        bg4.add(tetarti);
        input_box2 = new JTextField();
        bg4.add(input_box2);

        search_mag = new JButton("Search");
        bg4.add(search_mag);

        kartela4.add(bg3);
        kartela4.add(bg4);
        //TELOS KARTELAS 4
       

        //dilosi kartelon  
        // Adding the tabs to the Tabbed Pane
        karteles.addTab("Add a new Book", null, kartela1, "Add a new Book to the Library Database");
        karteles.addTab("Search a Book", null, kartela2, "Search a Book from the library");
        karteles.addTab("Add a new Mag", null, kartela3, "Add a new Mag to the Library Database");
        karteles.addTab("Search a Mag", null, kartela4, "Search a Mag from the library");
        setSize(500, 800);
        
        setLocationRelativeTo(null);

        //KOUMPI ADD VIVLIO
        add_book_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) { 
                Book vivlio;//  creating a book type object
                // Constructing the new object with the values the user typed 
                vivlio = new Book("Book",title.getText(), isbn.getText(), writter.getText(), year.getText(), description.getText(), location.getText(), pagenum.getText(), theme.getText());
           FileFunctions.objectInjection(vivlio); //  adding the object to the file 
           // emptying the textfields 
           title.setText(null);// resetting the textfields 
                  
                title.setText(null);
                isbn.setText(null);
                writter.setText(null);
                year.setText(null);
                description.setText(null);
                location.setText(null);
                pagenum.setText(null);
                theme.setText(null);
            }
        });
        
        
          add_mag_button.addActionListener(new ActionListener() {// 
                //Same exact process with  "add_book_button" but we add a magazine type file this time 
            @Override
            public void actionPerformed(ActionEvent e) {
                Mag periodiko;
                periodiko = new Mag("Mag",title2.getText(), Num_Teuxos.getText(), year2.getText(), Num_Tomou.getText(), theme2.getText(), location2.getText(), pagenum2.getText());
                System.out.println(periodiko.printInfo());
              FileFunctions.objectInjection(periodiko);
              
             
    
                title2.setText(null);
                Num_Teuxos.setText(null);
                Num_Tomou.setText(null);
                year2.setText(null);
                theme2.setText(null);
                location2.setText(null);
                pagenum2.setText(null);
                
               
            }

        });
        

       search_book.addActionListener(new ActionListener() { // searching a book  ( for the 2nd tab ) 
            @Override
            public void actionPerformed(ActionEvent e) {
                //Creating a stringbuilder that will enable us to append data to the file 
                StringBuilder searchResults = new StringBuilder();
                int option = 0;
                if (proti.isSelected()){ //  / Searching a Book by Title 
                    option=1;
                }
                else if (deuteri.isSelected()){ // / Searching a book by ISBN
                    option=2;
                }
               // System.out.println(option);
                    FileFunctions.displayIssues();// Administrator sysout
                FileFunctions.readIssue(input_box.getText(), option, searchResults); // Criteria based search  .The results are passed into searchResults  
                
                System.out.println(searchResults); // printing the results for the admin 
                
                
                
                String results = searchResults.toString();// pop up window that displays the results  ( for the user  )
                
                 if (results.isEmpty()) { // If we didnt find any books that match the lookup criteria then
                            JOptionPane.showMessageDialog(null, "Book with that title not Found", "Error 404: Book not Found", JOptionPane.INFORMATION_MESSAGE);
                            
                        } else {
                            ResultsFrame(results);
                            
                            results = "";// resetting the string 
                        }
             
            }
            
        });
       
       search_mag.addActionListener(new ActionListener() { //( Mag search button on the 3rd tab ) 
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder searchResults = new StringBuilder();//  Creating a stringbuilder and appending the data
                int option = 0;
                if (triti.isSelected()){ // The user picked the Title of a Mag as the lookup criteria 
                    option=3;
                }
                else if (tetarti.isSelected()){// The user picked the Year of Release as the lookup criteria 
                    option=4;
                }
                System.out.println(option);
                    FileFunctions.displayIssues();
                FileFunctions.readIssue(input_box2.getText(), option, searchResults);
                
                System.out.println(searchResults);
                
                
               
                String results = searchResults.toString();// pop up window 
                
                 if (results.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Mag with that title not Found", "Error 404: Mag not Found", JOptionPane.INFORMATION_MESSAGE);
                            
                        } else {
                            ResultsFrame(results);
                            
                            results = "";
                        }
             
            }


            
        });
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
     
    
      
    }//telos LIBRARY

  
  
    private void ResultsFrame(String Apotelesmata) {
        //arxikopoiisi pop-up window pou emfanizei apotelesmata ( polla kommatia einai apo youtube tutorial pou tha valo stis piges )
        JFrame resultFrame = new JFrame("Results!!");
        resultFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        resultFrame.setVisible(true);
        resultFrame.getContentPane().setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        JTextArea newText = new JTextArea(20, 30);
        newText.setEditable(false);
        JScrollPane scroll = new JScrollPane(newText);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        newText.append(Apotelesmata);
        panel1.add(scroll);
        JButton terminate_button = new JButton("Close");
        panel2.add(terminate_button);
        resultFrame.add(panel1, BorderLayout.NORTH);
        resultFrame.add(panel2, BorderLayout.PAGE_END);
        resultFrame.setSize(400, 400);
        resultFrame.pack();
        resultFrame.setLocationRelativeTo(null);
        
        terminate_button.addActionListener((ActionEvent e) -> {
            resultFrame.setVisible(false);
            resultFrame.dispose();
        });
    }

  
   

} // Telos Library contructor

