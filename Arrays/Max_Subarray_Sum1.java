public class Max_Subarray_Sum1 
{
    public static void maxSubarraySum(int numbers[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++)
        {
            int start=i;
            for(int j=i; j<numbers.length; j++)
            {
                int end=j;
                currSum=0;
                for(int k=start; k<=end; k++)
                {
                    //Subarray Sum
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) 
                {
                    maxSum=currSum;    
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
    public static void main(String[] args) 
    {
        int numbers[]={5,2,3,8,6,2,4};
        maxSubarraySum(numbers);    
    }    
}
