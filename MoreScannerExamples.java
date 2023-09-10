/*************************************************************************
 * Name:            R Sveinson
 * Class:           ACS-1309
 * 
 * Assignment:       Ax Qy
 * 
 * Description:        brief description
 **************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MoreScannerExamples {
    public static void main(String[] args) {
   // ***** declaration of constants *****
    
    // ***** declaration of variables ******
    
    String st = "";
    char ch = 'b';
    int i = 0;
    double d = 0.0;
    
    String strin = "";      // to get input from the keyboard
    String prompt;          // prompt for input
    
    // ***** creation of objects *****
    
    Scanner scanner = new Scanner(System.in);
    
    // ***** output banner *****
    
    System.out.println("************************************");
    System.out.println("Name: R. Sveinson");
    System.out.println("Class: ACS-1903");
    System.out.println("Assignment: Ax Qy");
    System.out.println("************************************");
    
    // ***** get input *****
    
    // System.out.println("enter a string.");
    // st = scanner.next();
    // System.out.println("you entered." + st);
    
    // System.out.println("enter an int.");
    // i = scanner.nextInt();
    // System.out.println("you entered." + i);
    
    // System.out.println("enter a double.");
    // d = scanner.nextDouble();
    // System.out.println("you entered." + d);
    
    // System.out.println("enter a single letter or char.");
    // ch = scanner.next().charAt(0);
    // System.out.println("you entered." + ch);
    
    // **** use JOptionPane and scanner together ****
    // prompt = "Enter a short sentence.";
    // strin = JOptionPane.showInputDialog(prompt);
    
    // //now create a scanner that uses strin as it's input
    // Scanner sc = new Scanner(strin);
    
    // // now use scanner and next() to extract the first word
    // st = sc.next();
    // System.out.println("Word: " + st);
    // st = sc.next();
    // System.out.println("Word: " + st);
    // // see if there is more in the scanner
    // System.out.println("There's more " + sc.hasNext());

    // ***** processing *****
    
    // ***** print output *****

    
    // ******* closing message *****
    
    System.out.println("\nend of processing");
    } // end of main method
    
} // end of public class
