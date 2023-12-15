public class TrappedRainwater
/* decalare two array one for left max and one for right max of each element
   trapped water level is water level - height
   water level is min of left max and right max */ 
{
    public static int trappedRainwater(int a[])
    {
        int n=a.length;
        //calculate left max boundary array
        int leftMax[]= new int[n];
        leftMax[0]=a[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(a[i],leftMax[i-1]);
        }

        //calculate right max boundary array
        int rightMax[]= new int[n];
        rightMax[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(a[i],rightMax[i+1]);
        }

        int trappedWater=0;
        for(int i=0;i<n;i++)
        {
            //waterlevel = min(leftmax , rightmax)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

            //trapped water= waterlevel-height[i]
            trappedWater+= waterLevel - a[i];
        }

        return trappedWater;
    }

    public static void main(String args[])
    {
        int height[]= {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("TRAPPED RAINWATER = "+trappedRainwater(height));
    }
}