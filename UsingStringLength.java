public class UsingStringLength
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
        
        String sub = password.substring(2, 7);
        System.out.println(sub);
        
        sub = "   spaces to the left of me       ";
        System.out.println(password + sub + password);
        
        System.out.println(password + sub.trim() + password);
        
        //sub = sub.trim();
        //System.out.println(sub + password);
        
        int l = sub.trim().length();
        System.out.println(l);
    }
}
