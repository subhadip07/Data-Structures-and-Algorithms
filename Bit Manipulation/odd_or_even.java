public class odd_or_even
{
    public static void oddoreven(int n)
    {
        int bitmask=1;
        if((n&bitmask)==0)
        {
            //even number
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }

    public static void main(String args[])
    {
        oddoreven(3);
        oddoreven(10);
        oddoreven(17);
    }
}
