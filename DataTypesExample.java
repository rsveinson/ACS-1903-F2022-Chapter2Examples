
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Data Types Example
 * 
 * Description: Some examples to demonstrate the strict rules governing 
 *              data types in Java
 **********************************************************************/

// import statements go here

public class DataTypesExample {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
    
        int i1 = 7;  
        int i2 = 3;
        double d1 = 3.5;
        double d2 = 7.7;
        int iResult = 0;
        double dResult = 0.0;
        
        String st = "";
        char ch = 'v';
        
        //st = 'a' + 'b' + 'c';
        System.out.println("a" + 1 + 2 + 'b' + 'c');

    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Data Types Example");
        System.out.println("****************************\n");
  
    // ***** Processing *****
    
        //i1 = 5.5;
        
        // iResult = i1 * i2;      // no problem works as expected
        // System.out.println(iResult);
        
        // dResult = d1 * d2;      // no problem works as expected
        // System.out.println(dResult);
        
        // iResult = i1 + d1;      // oops, can't do it
        // System.out.println(iResult);
        
        // iResult = 6 / 3;         // ok no problem
        // System.out.println(iResult);
        
        // iResult = 6 / (int)3.0;       // nope doesn't work
        // System.out.println(iResult);
        
        // dResult = i1 / i2;
        // System.out.println(dResult);    // hmm, strange result
   


        
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
