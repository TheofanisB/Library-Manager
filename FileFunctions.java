//Bakitas Theofanis 321/2015133
//1_i ergasia katanemimena 
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;


public class FileFunctions extends JFrame {

    static FileOutputStream outputFile;//Creating a file output stream to the file
    static ObjectOutputStream outputObject;//Steam to read objects from the file

    protected static void txtcreator() { // Creates a  fileoutputstream and a objectoutputstream .Used at the start of the program
        try {
            outputFile = new FileOutputStream(new File("library.txt"));// fileoutput stream to  library.txt
            outputObject = new ObjectOutputStream(outputFile);// objectoutput stream to the filestream above
        } catch (IOException e) { // error during file creation 
            System.out.println("IO Exception during file creation");
        }
    }

    protected static void objectInjection(Object issue) {// Function that adds an object to the file 

        try {

            System.out.println("The object was succesfully written to the file!");
            outputObject.writeObject(issue);//puts the object in the file 
            outputObject.flush();//flushes the memory 

        } catch (FileNotFoundException ex) { // if it doesnt file the file
            System.out.println("File Not Found!");
         } catch (IOException ex) { //if there's an io exception 
            System.out.println("IO Exception during Issue Injection!");
        }
    }//telos injection

    protected static void readIssue(String str, int i, StringBuilder a) {
         //Search Function
        //Gets a string from the user's input ,the selected button and the stringbuilder which contains the results  

        try {
            FileInputStream fileIn = new FileInputStream("library.txt");//creates the file input stream and the object input stream
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object ex;// creating an object 
            try {
               
                for (;;) {// while(true)
                    ex = objectIn.readObject();
                    if ((i == 1 && ex instanceof Book) && ((Book) ex).getTitle().contains(str)) {// TAB 2 ( SEARCH TITLE OF A BOOK BUTTON ) + OBJECT=BOOK
                        a.append(((Book) ex).printInfo());
                        System.out.println("found");
                    } else if ((i == 2 && ex instanceof Book) && ((Book) ex).getISBN().contains(str)) { // TAB 2 ( SEARCH THE ISBN OF A BOOK BUTTON ) + OBJECT=BOOK
                        a.append(((Book) ex).printInfo());
                        System.out.println("found");
                    } else if ((i == 3 && ex instanceof Mag) && ((Mag) ex).getTitle().contains(str)) {// TAB 4 ( SEARCH TITLE OF A MAG BUTTON ) + OBJECT=MAG
                        a.append(((Mag) ex).printInfo());
                        System.out.println("found");
                    } else if ((i == 4 && ex instanceof Mag) && ((Mag) ex).getYear().contains(str)) {// TAB 4 ( SEARCH THE RELEASE YEAR OF A MAG BUTTON ) + OBJECT=MAG
                        a.append(((Mag) ex).printInfo());
                        System.out.println("found");
                    } else {
                     //   System.out.println("else");
                    }
                }
            } catch (EOFException e) {// when we reach the end of the file 
                System.out.println("All the matching Issues have been read from the file");
                objectIn.close();// closes the streams
                fileIn.close();
                return;// exits the function
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected static void displayIssues() { // function that displays all the issues (used for debugging)

        try {
            FileInputStream fileIn = new FileInputStream("library.txt");//creates streams and objects 
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object ex;
            try {
                
                for (;;) {
                    ex = objectIn.readObject();// creates an object from the string
                    if ((ex instanceof Mag)) { // if its a magazine

                        System.out.println(((Mag) ex).printInfo());
                    } else if ((ex instanceof Book)) { // if its a book
                        System.out.println(((Book) ex).printInfo());
                    }
                }
            } catch (EOFException e) { // end of file error
                System.out.println("The Objects have been read from the file ( EOF )");
                objectIn.close();//closes the streams 
                fileIn.close();
               
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}//end of  filefunctions
