import java.util.*; 
public class HollowRectanglePattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NO. OF ROWS");
        int r=sc.nextInt();

        System.out.println("ENTER NO. OF COLUMNS");
        int c=sc.nextInt();
        
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==1||i==r)
                System.out.print("* ");
                else if(j==1||j==c)
                System.out.print("* ");
                else
                System.out.print("  ");

            }
            System.out.println();
        }
    }
}