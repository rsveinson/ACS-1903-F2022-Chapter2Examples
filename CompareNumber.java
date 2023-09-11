public class CompareNumber
{
    public static void main(String[] args)
    {
        // i1 and i2 are two char variables
        int i1 = 111;
        int i2 = 555;
        boolean g;
        boolean h = true;
        // Display i1 and i2
        // Display true or false according
        //  to whether they are equal or not
        System.out.println("The int values");
        System.out.println(i1);
        System.out.println(i2);
        
        System.out.println("Testing i1==i2");
        g = i1 == i2;
        System.out.println(g);
        //System.out.println(i1==i2);
        //System.out.println(g > h);
        
        // don't do this 
        //System.out.println(g + h);
        
        System.out.println("Testing i1<i2");
        System.out.println(i1<i2);
        
        System.out.println("Testing i1>i2");
        System.out.println(i1>i2);
    }//end main
}//end class
