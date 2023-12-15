public class Digits
{
    static String word[]={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void convert(int n)
    {
        if(n==0)
        {
            return;
        }

        int d=n%10;
        convert(n/10);
        System.out.print(word[d]+" ");

    }

    public static void main(String[] args)
    {
        convert(1947);
    }
}