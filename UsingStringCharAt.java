public class UsingStringCharAt
{
    public static void main(String[] args)
    {
        // variable password is of type String
        // variable passwordLength is of type int
        String sin = "123-987-555";
        
        // use the charAt() method
        char firstHyphen = sin.charAt(3);
        
        // Display the string and 
        // the character in position 3
        System.out.println("SIN is");
        System.out.println(sin);
        System.out.println("character at position 3 is");
        System.out.println(firstHyphen);
    }
}
