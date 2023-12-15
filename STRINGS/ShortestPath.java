public class ShortestPath
//NORTH Y+1
//SOUTH Y-1
//EAST X+1
//WEST X-1
{
    public static double getpath(String str)
    {
        int n=str.length();
        int X=0,Y=0; //ORIGIN
        for(int i=0;i<n;i++)
        {
            char dir=str.charAt(i);
            if(dir=='N')
            Y++;
            if(dir=='S')
            Y--;
            if(dir=='E')
            X++;
            if(dir=='W')
            X--;
        }
            double length=Math.sqrt((X*X)+(Y*Y));
        return length;
    }

    public static void main(String args[])
    {
        System.out.println(getpath("WNEENESENNN"));
    }
}