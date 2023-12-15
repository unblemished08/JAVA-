import java.util.Arrays; 
public class ChocolateDistributionProblem//DSA SHEET
{
    public static void main(String args[])
    {
        int arr[]={0,1,5,4,6,3};
        int m=3;
        Arrays.sort(arr);
        int min_diff=Integer.MAX_VALUE;
        int n=arr.length;

         for (int i = 0; i + m - 1 < n; i++) 
         {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
          }

        System.out.println(min_diff);
    }
}