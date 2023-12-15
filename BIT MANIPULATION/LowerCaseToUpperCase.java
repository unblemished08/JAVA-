public class LowerCaseToUpperCase
{
    public static void main(String[]args)
     { 
        // Convert lowercase character to uppercase
        for(char ch='a';ch<='z';ch++) 
        {
            System.out.println((char)(ch&'_'));
            // prints ABCDEFGHIJKLMNOPQRSTUVWXYZ
            }
        }
}