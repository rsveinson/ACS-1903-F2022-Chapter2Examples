public class UsingStringTrim
{
    public static void main(String[] args)
    {
        // variable sin is of type String
        // note the spaces at the front and back of the string

        String sin = "   123-987-555   ";
        
        System.out.print("SIN is");
        System.out.print(sin);
        System.out.println("Hahaaah");
        
        // print a trimmed version
        System.out.print("SIN is");
        System.out.print(sin.trim());
        System.out.println(sin = "Hahaaah");
        //System.out.print(sin.toUpperCase());
        
        // use trim() to remove leading and trailing spaces;
        sin = sin.trim();
        System.out.print("SIN is");
        System.out.print(sin);
        System.out.println("Hahaaah");
        
    }
}
