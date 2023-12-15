    public class MaxSubArraySum__KADANESALGORITHM
    //NOT VALID FOR ALL -IVE NUMBERS
    //WHENEVER SUM IS -VE MAKE IT 0
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
            

            for(int i=0;i<a.length;i++)
            {
                csum=csum + a[i];
                if(csum<0)
                {
                    csum=0;
                }
                    

                    if(msum<csum)
                    {
                        msum=csum;
                    }
                }
            
            System.out.println("MAX SUM ="+ msum);
        }
    }
