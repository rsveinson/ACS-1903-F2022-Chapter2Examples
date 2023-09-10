
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Expressions example calculating net pay
 * 
 * Description: Using expressions to do some not so simple 
 *              calculations, i.e. calculate net pay
 **********************************************************************/

// import statements go here
import java.util.Scanner;

public class CalcNetPayExampleStarter {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
        
        double grossPay = 10000.0;
        double deductions = 1500.0;
        double taxRate = 0.2;
        
        double taxesPaid = 0.0;
        double netPay = 0.0;
        
        double netPayLessDeductions = 0.0;
        
        int age = 0;
        
        String firstName = "";
        String lastName = "";
        
        Scanner keyboard = new Scanner(System.in);
        
    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Calculate Net Pay");
        System.out.println("****************************\n");
        
        
    // ***** get input *****
    
        System.out.println("Enter you name with .");
        firstName = keyboard.next();
        lastName = keyboard.next();
        
        System.out.println("Enter you age.");
        age = keyboard.nextInt();
        
        System.out.println("Enter gross pay.");
        grossPay = keyboard.nextDouble();

        System.out.println("Enter deductions.");
        deductions = keyboard.nextDouble();
        
    // ***** Processing *****
        // two ways to do this
        // netPayLessDeductions = grossPay - deductions;
        // taxesPaid = netPayLessDeductions * taxRate;
        
        // netPay = grossPay - deductions - taxesPaid;
        
        // now all at once
        netPay = grossPay - deductions - ((grossPay - deductions) * taxRate);
          
    // ***** output *****
    
        System.out.println("Gross Pay:\t" + grossPay);
        System.out.println("Deductions:\t" + deductions);
        System.out.println("Taxes:\t\t" + taxesPaid);
        System.out.println("Net Pay:\t" + netPay);

    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
