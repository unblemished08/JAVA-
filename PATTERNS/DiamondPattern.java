    import java.util.*; 
    public class DiamondPattern
    {
            public static void main(String args[])
            {
                    Scanner sc=new Scanner(System.in);
                System.out.println("ENTER NO. OF ROWS");//no. of rows is taken from 1st half only
                    int r=sc.nextInt();

                   //1st Half
                    for(int i=1;i<=r;i++)
                    {
                        for(int j=1;j<=(r-i);j++)//spaces   
                        System.out.print("  ");

                         for(int j=1;j<=(2*i)-1;j++)//stars
                         System.out.print("* ");    
                    
                        System.out.println();
                    }


                     //2nd Half
                    for(int i=r;i>=1;i--)
                    {
                         for(int j=1;j<=(r-i);j++)//spaces   
                        System.out.print("  ");

                         for(int j=1;j<=(2*i)-1;j++)//stars
                         System.out.print("* ");    
                    
                        System.out.println();
                    }    
                }
    }
            