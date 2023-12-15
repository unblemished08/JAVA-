public class UpdateIthBit
//updating ith bit means making ith bit 0 or 1 as given by user
//LOGIC 1: if newbit is 0 clear bit; if newbit is 1 set bit 
//LOGIC 2: first clear ith bit now take or with newbit<<i(BIT MASK)
//         if newbit is 0 it makes no change and final is 0(as it is already cleared)
//         if newbit is 1 final is 1
{
    public static int logic1(int n,int i,int newbit)
    {
        if(newbit==0)
        return clear(n,i);
        else
        return set(n,i);
    }

    public static int logic2(int n,int i,int newbit)
    {
        n=clear(n,i);
        int bitmask=newbit<<i;
        return (n|bitmask);
    }

    public static int set(int n,int i)
    {
        int bitmask=1<<i;
        return (n|bitmask) ;
    }

     public static int clear(int n,int i)
    {
        int bitmask=~(1<<i);
        return (n&bitmask) ;
    }

    public static void main(String args[])
    {
        System.out.println(logic1(10,2,1));
        System.out.println(logic2(10,2,1));
    }
}