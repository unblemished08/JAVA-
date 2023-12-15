public class RemoveDuplicates
{
    public static void remove(String str,int idx,StringBuilder newstr,boolean map[])
    {
        if(idx==str.length())
        {
            System.out.println(newstr);
            return;
        }

        char ch=str.charAt(idx);
        if(map[ch-'a']==true)
        {
            remove(str,idx+1,newstr,map);
        }
        else
        {
            map[ch-'a']=true;
            remove(str,idx+1,newstr.append(ch),map);
        }
    }

    public static void main(String[] args)
    {
        String str="apppnnacollege";
        boolean map[]=new boolean[26];
        StringBuilder newstr=new StringBuilder("");
        remove(str,0,newstr,map);
    }
}