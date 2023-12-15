import java.util.*;
public class Pallindrome
{
    public static void main(String args[])
    {
       Scanner scr=new Scanner(System.in);
       System.out.println("ENTER THE NUMBER");
       int num=scr.nextInt();
       int rev=0;
       while(num>0)
       {
        rev=rev*10+(num%10);
        num/=10;
       }
       System.out.println("PALLINDROME IS : "+rev); 
    }
}