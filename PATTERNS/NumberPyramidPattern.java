import java.util.*; 
    public class NumberPyramidPattern
    {
            public static void main(String args[])
            {
                    Scanner sc=new Scanner(System.in);
                System.out.println("ENTER NO. OF ROWS");
                    int r=sc.nextInt();

                   
                    for(int i=1;i<=r;i++)
                    {
                        for(int j=1;j<=(r-i);j++)//spaces   
                        System.out.print(" ");

                        for(int j=1;j<=i;j++)
                        System.out.print(i+" ");

                        System.out.println();
                    }
            }
    }
    
