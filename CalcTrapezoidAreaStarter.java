
/*******************************************************
 * Name:        Sveinson
 * Class:       ACS-1903
 * 
 * Assignment:  Expressions example calculating the area of a trapezoid
 * 
 * Description: Using expressions to do some not so simple 
 *              calculations, i.e. the area of a trapezoid using the 
 *              formula a + b / 2 * h
 **********************************************************************/

// import statements go here

public class CalcTrapezoidAreaStarter {
    public static void main(String[] args) {
    // ****** Declaration of Constants *****
    
    // ***** Declaration of Variables *****
        
        double a = 3.5;             // this is the short side of the trap
        double b = 6.0;             // the long side of the tap
        double h = 4.5;             // height of the trap
        
        double area = 0.0;          // area of trapezoid
        
    // ***** Output Banners *****
    
        System.out.println("****************************");
        System.out.println("Name: Sveinson");
        System.out.println("Class: ACS-1903");
        System.out.println("Assignment: Calculate the Area of a Trapeoid");
        System.out.println("****************************\n");
  
    // ***** Processing *****
    
        area = (a + b) / 2 * h;
    
    // ***** output *****
    
        System.out.println("Side a:\t" + a);
        System.out.println("Side b:\t" + b);
        System.out.println("Height:\t" + h);
        System.out.println("Area:\t" + area);

    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("End of processing");
    
    } // end of main method
    
} // end of public class
