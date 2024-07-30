public class Subarrays 
{
    public static void printSubarrays(int numbers[])
    {
        int ts=0;
        for(int i=0; i<numbers.length; i++)
        {
            int start=i;
            for(int j=i; j<numbers.length; j++)
            {
                int end=j;
                for(int k=start; k<=end; k++)
                {
                    System.out.print(numbers[k]+ " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray = " + ts);
    }
    public static void main(String args[])
    {
        int numbers[]={5,4,8,6,2,10,7};
        printSubarrays(numbers);
    }    
}
