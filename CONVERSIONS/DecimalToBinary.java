import java.util.*; 
    public class DecimalToBinary
    {
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
               System.out.println("ENTER DECIMAL NO.");
                int dnum=sc.nextInt();
                int copy=dnum;

                int pow=0;
                int bnum=0;

                while(dnum>0)
                {
                    int d=dnum%2;
                    bnum=bnum+(d*(int)Math.pow(10,pow));
                    pow++;
                    dnum/=2;
                }
                    
            System.out.println("BINARY NO. OF "+copy+" IS = "+bnum);
        }
    }