public class Sum //sum of first n natural numbers.
{
    public static int calsum(int n)
    {
        if(n==1)
        {
            return 1;
        }

        int sn=n+calsum(n-1);
        return sn;
    }

    public static void main(String[] args)
    {
        System.out.println(calsum(5));
    }
}