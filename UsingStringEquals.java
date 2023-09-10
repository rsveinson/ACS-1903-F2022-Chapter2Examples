public class UsingStringEquals
{
    public static void main(String[] args)
    {
        // variable password is of type String
        // variable passwordLength is of type int
        String s1 = "John A. Smith";
        String s2 = "John A. Smith";
        String s3 = new String("John A. Smith");
        
        boolean b = s1 == s2;
        System.out.println(b);
        
        b = s1 == s3;
        System.out.println(b);
        
        // Display s1 and s2
        // Display true or false according
        //  to whether they are equal or not
        System.out.println("The strings");
        System.out.println(s1);
        System.out.println(s2);
        
        boolean equalsResult = s1.equals(s3);
        System.out.println(equalsResult);
    }
}
