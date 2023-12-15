public class PowerOfTwo
//if n and n-1 == 0 ; n is power of 2
{
    public static boolean poweroftwo(int n)
    {
        return (n&(n-1))==0;  
    }

    public static void main(String args[])
    {
        System.out.println(poweroftwo(4));
        System.out.println(poweroftwo(14));
        System.out.println(poweroftwo(64));
        System.out.println(poweroftwo(69));
    }
}