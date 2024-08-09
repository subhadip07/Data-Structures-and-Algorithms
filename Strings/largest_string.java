public class largest_string 
{
    public static void main(String[] args) 
    {
        String language[] = 
        {
            "C++", "Python", "java"
        };
        
        String largest = language[0];
        for(int i=1; i<language.length; i++)
        {   
            if(largest.compareTo(language[i]) < 0)
            {   
                largest = language[i];
            }
        }

        System.out.println(largest);
    }    
}
