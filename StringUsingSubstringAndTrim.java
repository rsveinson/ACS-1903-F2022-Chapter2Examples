public class StringUsingSubstringAndTrim
{
    public static void main(String[] args)
    {
        // variable password is of type String
        // variable passwordLength is of type int
        String password = "my123Password";
        // use the length() method
        int passwordLength = password.length();
        // Display the string and its length
        System.out.println("password is");
        System.out.println(password);
        System.out.println("length is");
        System.out.println(passwordLength);

// Here's some new stuff that isn't part of the original sample code
        System.out.println();
        String sub = password.substring(2, 8);
        System.out.println(sub);
        
        System.out.println();
        sub = "   spaces to the left of me       ";
        System.out.println(password + sub + password);
        
        System.out.println();
        System.out.println(password + sub.trim() + password);
        
        System.out.println();
        sub = sub.trim();
        System.out.println(password + sub + password);
    }
}
