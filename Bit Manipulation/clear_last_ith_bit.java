public class clear_last_ith_bit 
{
    public static int clearIthBit(int n, int i)
    {
        int bitmask = (~0)<<i;
        return n & bitmask;
    }    

    public static void main(String[] args) 
    {
        System.out.println(clearIthBit(15, 2));    
    }    
}
