//Determine if 2 Strings are anagrams of each other
//If two strings contain the same characters but in a different order,they can be said to be anagrams.
//Consider race and care.
//In this case,race's characters can be formed into care,or care's characters can be formed into race
public class Anagrams
//using strings 
//FEW FLAWS IN THIS METHOD, CHECK FOR Anagrams$
{
    public static boolean check(String a,String b)
    {
        if(a.length()!=b.length())
        return false;
       boolean ans=false;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            for(int j=0;j<b.length();j++)
            {
                if(ch==(b.charAt(j)))
                ans=true;

            }
            if(!ans)
            return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        System.out.println(check("race","care"));
    }
}