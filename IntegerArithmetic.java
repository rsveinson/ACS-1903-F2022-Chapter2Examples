public class IntegerArithmetic
{
    public static void main(String[] args)
    {
        // Use integer arithmetic
        //   Division: no remainder
        //   Modulo: yields the remainder
        int number, digit;
        number = 1297;
        
        // Get right-most digit
        digit = number % 10; 
        System.out.println(digit);
        
        // Decrease number by a factor of 10
        // and get next digit
        number = number / 10;
        digit = number % 10;
        System.out.println(digit);
        
        System.out.println(99-99.0/10);
        System.out.println("sum of numbers: " + (4 + 5));
        
    }// end main
}// end clas
