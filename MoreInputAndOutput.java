/*************************************************************************
 * Name:            R Sveinson
 * Class:           ACS-1309
 * 
 * Assignment:       More Input and output examples
 * 
 * Description:        some more examples showing how to use Scanner and 
 *                      JOptionPane for intput, and how to use JOptionPane
 *                      for output
 **************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MoreInputAndOutput {
    public static void main(String[] args) {
   // ***** declaration of constants *****
    
    // ***** declaration of variables ******
    
    String st = "";
    char ch = 'b';
    int i = 0;
    double d = 0.0;
    
    String strin = "";      // to get input from the keyboard
    
    // ***** creation of objects *****
    
    Scanner scanner = new Scanner(System.in);
    
    // ***** output banner *****
    
    System.out.println("************************************");
    System.out.println("Name: R. Sveinson");
    System.out.println("Class: ACS-1903");
    System.out.println("Assignment: More I/O exmaples");
    System.out.println("************************************");
    
    // ***** get input *****
    
    // System.out.println("enter an int.");
    // i = scanner.nextInt();
    // System.out.println("you entered: " + i);
    
    // JOptionPane returns a String so the following line won't work
    //i = JOptionPane.showInputDialog("enter an int.");
    
    // the following will work but the number entered is a string so 
    // we can't use it for calculations
    //strin = JOptionPane.showInputDialog("enter an int.");
    
    // the solution is parsing
    // we have to parse the string as an int
    i = Integer.parseInt(JOptionPane.showInputDialog("enter an int."));
    JOptionPane.showMessageDialog(null, "you entered: " + i);
    
    

    // ***** processing *****
    
    // ***** print output *****

    
    // ******* closing message *****
    
    System.out.println("\nend of processing");
    } // end of main method
    
} // end of public class
