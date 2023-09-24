

import javax.swing.JOptionPane;

public class joptemp{
    public static void main(String[] args) {
    
        String message = "this is the output I want to\n put into the JOP mesage dialog.";
        
        JOptionPane.showMessageDialog(null, "Output text goes here");
        
        // can also be a vairalbe
        JOptionPane.showMessageDialog(null, message);
    }
}
