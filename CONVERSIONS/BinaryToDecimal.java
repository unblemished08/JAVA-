import java.util.*; 
    public class BinaryToDecimal
    {
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
               System.out.println("ENTER BINARY NO.");
                int bnum=sc.nextInt();
                int copy=bnum;

                int pow=0;
                int dnum=0;

                while(bnum>0)
                {
                    int d=bnum%10;
                    dnum=dnum+(d*(int)Math.pow(2,pow));
                    pow++;
                    bnum/=10;
                }
                    
            System.out.println("DECIMAL NO. OF "+copy+" IS = "+dnum);
        }
    }