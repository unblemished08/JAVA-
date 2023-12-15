public class ClearIthBit
//clearing ith bit means making ith bit 0
//or with 1<<i doesnot change any bit except the ith bit and makes it 1
//similarly and with not(1<<i) doesnot change any bit except the ith bit and makes it 0(BIT MASK)
{
    public static int clear(int n,int i)
    {
        int bitmask=~(1<<i);
        return (n&bitmask) ;
    }

    public static void main(String args[])
    {
        System.out.println(clear(10,1));
    }
}