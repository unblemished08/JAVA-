public class MaxSubArraySum__PREFIXSUM
{
    public static void main(String args[])
    {
        int arr[]={1,-2,6,-1,3};
        MaxSubArraySum(arr);    
    }

    public static void MaxSubArraySum(int a[])
    {
        int csum=0;
        int msum= Integer.MIN_VALUE;
        int prefix[]=new int[a.length];

        prefix[0]=a[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1] + a[i];
        }

        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                csum=i==0 ? prefix[j] : prefix[j]-prefix[i-1];

                if(msum<csum)
                {
                    msum=csum;
                }
            }
        }
        System.out.println("MAX SUM ="+ msum);
    }
}       
