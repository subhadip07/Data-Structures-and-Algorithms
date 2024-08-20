public class last_occurence 
{
    public static int lastoccurrence(int arr[], int key, int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        int isfound=lastoccurrence(arr, key, i+1);
        if(isfound == -1 && arr[i]==key)
        {
            return i;
        }
        return isfound;
    }    

    public static void main(String[] args) 
    {
        int arr[]={5,5,5,5,4};
        System.out.println(lastoccurrence(arr, 5, 0));    
    }
}
