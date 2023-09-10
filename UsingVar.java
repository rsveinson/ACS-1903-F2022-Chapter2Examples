public class UsingVar
{
    public static void main(String[] args)
    {
        // variable password is of type String
        // variable passwordLength is of type int
        var s1 = "John A. Smith";
        var s2 = "John A Smith";
        // Display s1 and s2
        // Display true or false according
        //  to whether they are equal or not
        System.out.println("The strings");
        System.out.println(s1);
        System.out.println(s2);
        var equalsResult = s1.equals(s2);
        System.out.println(equalsResult);
    }
}
