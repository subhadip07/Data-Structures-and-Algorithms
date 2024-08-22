public class remove_duplicates 
{
    public static void removeduplicate(String str, int idx, StringBuilder newStr, boolean map[])
    {
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }

        char currChar=str.charAt(idx);
        if(map[currChar -'a']== true)
        {
            //duplicate
            removeduplicate(str, idx+1, newStr, map);
        }
        else
        {
            map[currChar - 'a']=true;
            removeduplicate(str, idx+1, newStr.append(currChar), map);
        }
    }    

    public static void main(String[] args) 
    {
        String str="elephhhhanttttttintherrrrrroom";
        removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
