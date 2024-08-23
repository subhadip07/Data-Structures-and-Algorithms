public class friends_pairing
{
    public static int friendspairing(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
   
        //choice
        //single
        int fmn1=friendspairing(n-1);
        //pair
        int fmn2=friendspairing(n-2);
        int pairways=(n-1)*fmn2;
        //total ways
        int totways=fmn1 + pairways;
        return totways;
    }
    public static void main(String[] args) 
    {
        System.out.println(friendspairing(3));    
    }
}