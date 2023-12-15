public class PrintPairsArray
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        printpairs(arr);

        
    }

    public static void printpairs(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=(i+1);j<a.length;j++)
            {
                System.out.print("("+a[i]+","+a[j]+")");
            }
            System.out.println();
        }
    }
}