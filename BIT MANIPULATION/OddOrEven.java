public class OddOrEven
//and with 1 makes every bit 0 except the last(BIT MASK)(way to check LSB)
//even last bit = 0
//odd last bit = 1
{
    public static void check(int n)
    {
        int bitmask=1;
        if((n & bitmask)==0)
        System.out.println("EVEN NUMBER");
        else
        System.out.println("ODD NUMBER");
    }

    public static void main(String args[])
    {
        check(20);
        check(46);
        check(33);
        check(69);
    }
}