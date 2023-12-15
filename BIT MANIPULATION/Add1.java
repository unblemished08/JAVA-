//The expression -(~x) will add1 to an integer x.
//We know that to get negative of a number,invert its bits and add 1 to it
//Remember negative numbers are stored in 2's complement form
// -x = ~x + 1
//-(~x) = x + 1 (by replacing x by ~x)
public class Add1
{
    public static void main(String[]args)
     { 
        int x=6;
        System.out.println(x+" + "+1+" is "+-~x);
        x= -4;
        System.out.println(x+" + "+1+" is "+-~x);
        x=0;
        System.out.println(x+" + "+1+" is "+-~x);
     }    
}