public class string_substring 
{
    public static String substring(String str, int si, int ei)
    {
        String substr=" ";
        for(int i=si; i<ei; i++)
        {
            substr += str.charAt(i);
        }
        return substr;
    }    

    public static void main(String[] args) 
    {
        String str = "Performing String Substring function";
        System.out.println(str.substring(0,8));
        System.out.println(substring(str, 0, 8));    
    }
}