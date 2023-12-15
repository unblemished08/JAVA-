public class ModularExponentiation
//code with O(log n) and normal expo is O(n)
{
    public static int modularexpo(int a,int n,int x)
    {
        //a -base ; n- power; x- divisor
        int ans=1;

        while(n>0)
        {
            if((n&1)==1)//checking LSB
            {
                ans= ans*a;
            }

            a=a*a;
            n=n>>1;
        }

        return (ans%x);
    }

    public static void main(String args[])
    {
        System.out.println(modularexpo(2,6,10));
    }
}
