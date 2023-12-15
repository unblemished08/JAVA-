public class FirstOccurrence 
{
    public static int first(int arr[],int key,int i)
    {
        if(i==arr.length) 
        {
            return -1;
        }

        if(arr[i]==key)
        {
            return i;
        }

        return first(arr,key,i+1);
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,4,6};
        System.out.println(first(arr,4,0));
    }
}