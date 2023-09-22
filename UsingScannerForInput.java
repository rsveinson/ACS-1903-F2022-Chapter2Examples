import java.util.Scanner;
public class UsingScannerForInput
{
    public static void main(String[] args)
    {
        double rateOfPay;
        String name;
        int hoursWorked;
        
        // Declare a scanner object for the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt the user for a name       
        System.out.println("\n\nEnter your name (no spaces) and press enter");
        name = keyboard.next();
        
        // Prompt the user for hours worked
        System.out.println("Enter the hours worked (no decimal places) and press enter");
        hoursWorked = keyboard.nextInt();
        
        // Prompt the user for the rate of pay
        System.out.println("Enter your rate of pay and press enter");
        rateOfPay = keyboard.nextDouble();

        // Calculate gross pay and display all the information
        double grossPay = hoursWorked * rateOfPay;
        System.out.println("\n Your name: "+name
            +"\n hours worked: "+hoursWorked
            +"\n rate of pay: "+rateOfPay
            +"\n gross pay : "+grossPay); 
    }
}
