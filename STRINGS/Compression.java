public class Compression
{
    public static void compress(String str)
    {
        str=str+" ";//to allow loop to execute ones more.
        int count=1;
        
        for(int i=1;i<str.length();i++)
        {
            
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }
            else if(count==1)
            System.out.print(str.charAt(i-1));
            else 
            {
                System.out.print(str.charAt(i-1)+""+count);
                count=1;
            }
            
        }
    }

    public static void main(String args[])
    {
        String str="AaaabbbccccdddDddd";
        compress(str);
    }
}
