public class string_compare 
{
    public static void main(String[] args) 
    {
        String s1 = "Tony";
        // String s2 = "Tony";
        String s3 = new String("Tony");
        
        if (s1.equals(s3)) 
        {
            System.out.println("Strings are equal");    
        }
        else
        {
            System.out.println("String are not equal");
        }
    }    
}
