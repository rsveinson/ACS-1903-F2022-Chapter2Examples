
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Integer Math Example
 * 
 * Description: Some examples of integer math in Java
 **********************************************************************/

// import statements go here

public class Ch2IntegerMathExample {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
    
        int operand1 = 7;  
        int operand2 = 4;
        int result = 0;
        
    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Integer Math Example");
        System.out.println("****************************\n");
  
    // ***** Processing *****
    
        // // integer addition
        // result = operand1 + operand2;
        // System.out.println(operand1 + " + " + operand2 + " = "  + result);
        
        // // // integer subtraction
        // result = operand1 - operand2;
        // System.out.println(operand1 + " - " + operand2 + " = "  + result);
        
        // // // // //integer multiplication
        // result = operand1 * operand2;
        // System.out.println(operand1 + " * " + operand2 + " = "  + result);
        
    // now things get interesting
        // // // integer division (sometimes pronounce div)
        result = operand1 / operand2;
        System.out.println(operand1 + " / " + operand2 + " = "  + result);
        
        // // // // // now reverse the operands
        result = operand2 / operand1;
        System.out.println(operand2 + " / " + operand1 + " = "  + result);
        
        // // // // modulus divisio (sometimes pronounce mod)
        result = operand1 % operand2;
        System.out.println(operand1 + " % " + operand2 + " = "  + result);
        
        result = operand2 % operand1;
        System.out.println(result);
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
