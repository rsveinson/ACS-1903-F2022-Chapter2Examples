/**
 * This Java class uses JOptionPane to obtain
 * input from the user
 */
import javax.swing.JOptionPane;
public class UsingJOptionPaneForInput
{
    public static void main(String[] args){
        String firstName =
            JOptionPane.showInputDialog("Enter first name");
            
        String lastName =
            JOptionPane.showInputDialog("Enter last name");
            
        System.out.println ("Your name is:"+firstName+" "+lastName);
        
        // added to the textbook sample code
        int n = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
        double d = Double.parseDouble(JOptionPane.showInputDialog("give me a decimal"));
    }
}
