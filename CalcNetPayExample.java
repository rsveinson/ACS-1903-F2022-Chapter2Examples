
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

public class CalcNetPayExample {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
        
        double grossPay = 10000.0;
        double deductions = 1500.0;
        double taxRate = 0.2;
        
        double taxesPaid = 0.0;
        double netPay = 0.0;
        
        double netPayLessDeductions = 0.0;
        
    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Calculate Net Pay");
        System.out.println("****************************\n");
  
    // ***** Processing *****
        // two ways to do this
        
        // netPayLessDeductions = grossPay - deductions;
        // taxesPaid = netPayLessDeductions * taxRate;
        
        // netPay = grossPay - deductions - taxesPaid;


        netPay =  grossPay - deductions - ((grossPay - deductions) * taxRate);   
        
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
