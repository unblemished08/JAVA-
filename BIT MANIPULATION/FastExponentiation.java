public class FastExponentiation
//code with O(log n) and normal expo is O(n)
{
    public static int fastexpo(int a,int n)
    {
        //a -base ; n- power
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

        return ans;
    }

    public static void main(String args[])
    {
        System.out.println(fastexpo(2,4));
    }
}
