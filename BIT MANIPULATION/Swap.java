public class Swap
{
    public static void main(String[]args)
     {
        int x=43,y=49;
        System.out.println("Before swap: x = "+x+" and y = "+y);
        //swap using xor
        x=x^y;
        y=x^y;
        x=x^y; 
        // NORMAL SWAPPING : x=x+y; y=x-y; x=x-y;
        System.out.println("After swap: x = "+x+" and y = "+y);
        }
}       