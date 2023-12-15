public class ClearRangeOfBit
//clearing range of bit means making range of bit 0
//MY METHOD: ~(-1<<i)
//DIDI'S METHOD: (1<<i)-1
{
    public static int clearrange(int n,int i,int j)
    {
        int bitmask=(-1<<(j+1))|((1<<i)-1); ///(DIDI'S METHOD)
        //int bitmask=(-1<<(j+1))|~(-1<<i); (MY METHOD)
        return (n&bitmask) ;
    }

    public static void main(String args[])
    {
        System.out.println(clearrange(10,2,4));
    }
}