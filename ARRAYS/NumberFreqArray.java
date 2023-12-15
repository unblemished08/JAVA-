public class NumberFreqArray //BRUTE FORCE
{
    public static boolean Search(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                return true;
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        int nums[]={1,2,4,5,1};
        if(Search(nums))
        System.out.println("TRUE");
        else
        System.out.println("FALSE");
        
    }
}