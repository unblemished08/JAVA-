import java.util.ArrayList;
public class ContainerWithMostWaterOptimised //2 POINTER APPROACH
{
    public static int storewater(ArrayList<Integer> list)
    {
        int maxWater=0;
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp)
        {
            //calculate water area
            int ht=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(maxWater,currWater);

            //update pointer
            if(list.get(lp)<list.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String args[])
    {
    
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);

    int maxvol=storewater(list);

    System.out.println("MAX VOL= "+ maxvol);
    }
}