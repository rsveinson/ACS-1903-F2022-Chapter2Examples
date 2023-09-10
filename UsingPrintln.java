public class UsingPrintln
{
    public static void main ( String [] args )
    {
        double grossPay, taxesPaid, taxRate, netPay, deductions;
        grossPay = 100.00;
        deductions = 10.00;
        taxRate = 0.10;
        // Calculate taxes and net pay
        taxesPaid = (grossPay - deductions) * taxRate ;
        netPay = grossPay - taxesPaid;
        //
        // Each time println () executes the output will start on a new line
        // Produce one line of output with one
        double value;
        System.out.println (grossPay);
        // Often a good idea is to label the output so it is self - describing
        // Produce one line of output with a label and a value
        System.out.println ("Gross Pay is "+ grossPay);
        // Several items can be catenated
        // Note that one text string must appear on one line
        // but a long one can be formed over multiple lines
        System.out.println ("Gross Pay = "+ grossPay  +" Deductions = "+ deductions);
        // You can force output to go onto more than one line
        // by embedding control characters in a string
        // '\n' is the new line character
        // '\t' is the tab character
        System.out.println ("\tGross Pay = "+ grossPay
            +"\n\tDeductions = "+ deductions
            +"\n\tTaxes Paid = "+ taxesPaid
            +"\n\tNet Pay = "+ netPay );
            
    // some outliers
    
        System.out.println (grossPay + deductions);
    }
}
