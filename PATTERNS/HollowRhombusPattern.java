    import java.util.*; 
        public class HollowRhombusPattern
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

                            
            
                            for(int j=1;j<=r;j++)//code for hollow rectangle
                            {
                            if(i==1||i==r)
                        System.out.print("* ");
                        else if(j==1||j==r)
                        System.out.print("* ");
                        else
                        System.out.print("  ");

                    }

                                System.out.println();
                            }
                    }
            }


                        
