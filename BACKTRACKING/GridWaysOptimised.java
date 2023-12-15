public class GridWaysOptimised {
    public static int gridWays(int i,int j,int n,int m) {

        return fact(n-1+m-1)/(fact(n-1)*fact(m-1));
    }

    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        int n=2;
        int m=3;
        System.out.println(gridWays(0,0,n,m));
    }
}