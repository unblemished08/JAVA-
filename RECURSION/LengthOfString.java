public class  LengthOfString
{
    public static int length(String str,int count)
    {
        if(str=="")
        return count;

        return length(str.substring(1),count+1);
    }

    public static void main(String[] args)
    {
        System.out.println(length("harshit anand",0));
    }
}