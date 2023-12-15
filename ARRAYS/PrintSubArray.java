public class PrintSubArray
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        PrintSubArray(arr);

        
    }

    public static void PrintSubArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                System.out.print(a[k]+" ");
                }
            
            System.out.println();
            }
            System.out.println();
        }
    }
}       
