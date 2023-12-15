public class FriendsPairing
{
    public static int friendspair(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }

        int single=friendspair(n-1);
        int pair=(n-1)*friendspair(n-2);

        return single+pair;
    }

    public static void main(String[] args)
    {
        System.out.println( friendspair(4));
    }
}