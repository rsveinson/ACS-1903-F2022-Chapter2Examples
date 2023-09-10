        
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Basic Variables Listing 2.1 and 2.2
 * 
 * Description: Some basic examples of variables and their uses in Java.
 *              This code example is complementary to listing 2.1 and 2.2 of the
 *              textbook.
 **********************************************************************/

// import statements go here

public class BasicVariableUseExample {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
        
        int i = 0;          // declare the integer variable i and initialize it to 0
        short s = 32767;    // should work
        s++;
        System.out.println(s);
        
    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Basic Variables Listing 2.1 and 2.2");
        System.out.println("****************************\n");
  
    // ***** Processing *****
    
        // the catenation operator
        System.out.println("1 + 6 = " + 1 + 6);
        
        System.out.println("i = " + i);
        
        // now change the value in i
        i = 30;    
        System.out.println("i = " + i);
        
        // what happens if we try to set the value i to some number with a decimal?
        // uncomment the two followin lines to see what happens
        //i = 3.4;
        i = (int)3.7;
        System.out.println("i = " + i);
 
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
