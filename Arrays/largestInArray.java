public class largestInArray
{
    public static int getLargest(int numbers[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i < numbers.length; i++)
        {
            if(largest < numbers[i])
            {
                largest=numbers[i];
            }
            if(smallest > numbers[i])
            {
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest value is: " + smallest);
        System.out.println("Largest value is: " + largest);
        return largest;    
    }

    public static void main(String args[])
    {
        int numbers[]={1,2,6,3,5};
        System.out.println("Largest value is: " + getLargest(numbers));
    }
}