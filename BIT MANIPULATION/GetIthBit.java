public class GetIthBit
//and with 1<<i makes every bit 0 except the ith bit(BIT MASK)
{
    public static void check(int n,int i)
    {
        int bitmask=1<<i;
        if((n & bitmask)==0)
        System.out.println("Ith BIT IS 0");
        else
        System.out.println("Ith BIT IS 1");
    }

    public static void main(String args[])
    {
        check(10,3);
    }
}