public class SetIthBit
//setting ith bit means making ith bit 1
//or with 1<<i doesnot change any bit except the ith bit and makes it 1(BIT MASK)
{
    public static int set(int n,int i)
    {
        int bitmask=1<<i;
        return (n|bitmask) ;
    }

    public static void main(String args[])
    {
        System.out.println(set(10,2));
    }
}