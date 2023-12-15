import java.util.*; 
    public class PallindromicPattern
    {
            public static void main(String args[])
            {
                    Scanner sc=new Scanner(System.in);
                System.out.println("ENTER NO. OF ROWS");
                    int r=sc.nextInt();

                   
                    for(int i=1;i<=r;i++)
                    {
                        for(int j=1;j<=(r-i);j++)//spaces   
                        System.out.print("  ");

                        for(int j=i;j>=1;j--)
                        System.out.print(j+" ");

                         for(int j=2;j<=i;j++)
                        System.out.print(j+" ");

                        System.out.println();
                    }
            }
    }
    
