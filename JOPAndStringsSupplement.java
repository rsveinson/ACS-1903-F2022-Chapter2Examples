import java.util.Scanner;
import javax.swing.JOptionPane;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class JOPAndStringsSupplement{
    public static void main(String[] args) {
    // **** variables and constants ***
    
        String strin = "";  // empty string used for intput from JOP
        String prompt = "Tell the user what to enter.";
    
    // **** objects ****
        Scanner scanner = new Scanner(System.in);
        
    // **** input ****
    
        //strin = JOptionPane.showInputDialog("enter some stuff");
        //strin = JOptionPane.showInputDialog(prompt);
    
    // **** some string methods ****
    
        // i'll use this in the following examples
        String st = "The Quick Brown Fox";          
        
        System.out.println(strin);
        
        // length
        int l = strin.length();
        System.out.println(l);
        
        if(l > 10){
            JOptionPane.showMessageDialog(null, "word is too long");
        }// end length
        
        // charAt()
        System.out.println();
        System.out.println(st);
        char ch = st.charAt(0);        
        System.out.println("charAt(0) " + ch);
        
        ch = st.charAt(8);
        System.out.println("charAt(8) " + ch);
        
        // should cause an index out of bounds error
        ch = st.charAt(l);
        
        // indexOf()
        System.out.println();
        System.out.println(st);
        int i = st.indexOf('Q');
        System.out.println("Q is at index " + i );
        
        // to lower/upperCase();
        System.out.println();
        System.out.println(st);
        String otherCase;
        
        otherCase = st.toUpperCase();
        System.out.println("All caps: " + otherCase);
        
        System.out.println("all lower case: " + st.toLowerCase());
        
        // Here's a new one that you should know
        // replace()
        System.out.println();
        System.out.println(st);
        
        String newString;
        newString = st.replace("Qu", "12345");
        System.out.println("The new string: " + newString);
        
        System.out.println(st.replace("The", "An"));
        System.out.println("The original is not changed. " + st);
        
        // substring again
        System.out.println();
        System.out.println(st);
        
        String sub;
        
        sub = st.substring(4);
        System.out.println("from index 4 to the end: " + sub);
        
        sub = st.substring(4, 8);
        System.out.println("from index 4 to index 7 (8 -1): " + sub);
        
        // trim
        System.out.println();
        String trimString = "       leading and following           ";
        String trimmed;
        
        System.out.println(trimString);
        trimmed = trimString.trim();
        System.out.println(trimmed);
        
        
    // **** output ****
    
        //JOptionPane.showMessageDialog(null, "your output here");
    
    // *** end of program ****
        System.out.println("\n\n");
        System.out.println("end of program");
    }
}
