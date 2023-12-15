import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort
{
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

    public static void printarr1(Integer arr1[])
    {
        for(Integer i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }

        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr);
        //Arrays.sort(arr,start,end);
        //start inclusive and end exclusive
        printarr(arr);
        Integer arr1[]={5,4,1,3,2};
        //reverseOrder works on object only so Integer insted of int
        Arrays.sort(arr1,Collections.reverseOrder());
        printarr1(arr1);
    }
}