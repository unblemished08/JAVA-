public class CountSetBits
//countsetbits means count no. of 1
{
    public static int countsetbits(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1)==1)//checking LSB
            count++;

            n= n>>1;
        }

        return count;
    }

    public static void main(String args[])
    {
        System.out.println("NO. OF SET BITS = "+countsetbits(16));
    }
}
