public class ReverseArray
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        reverse(arr);

        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }

    public static void reverse(int a[])
    {
        int first=0;
        int last=a.length-1;

        while(first<last)
        {
            //swap
            int c=a[first];
            a[first]=a[last];
            a[last]=c;

            first++;
            last--;
        }
    }
} 