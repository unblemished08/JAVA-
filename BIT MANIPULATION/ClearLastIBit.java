public class ClearLastIBit
//clearing last i bit means making last i bit 0
//and with -1<<i OR ~0<<i doesnot change any bit except the last i bit and makes it 0
{
    public static int clearlasti(int n,int i)
    {
        int bitmask=-1<<i;
        return (n&bitmask) ;
    }

    public static void main(String args[])
    {
        System.out.println(clearlasti(15,2));
    }
}