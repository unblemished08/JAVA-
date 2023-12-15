import java.util.ArrayList;
public class PairSum1Optimised //2 pointer approach
{
    public static boolean pairsum(ArrayList<Integer> list,int target)
    {
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp)
        {
            //case 1
            if(list.get(lp)+list.get(rp)==target)
                    return true;
            
            //case 2
            if(list.get(lp)+list.get(rp)<target)
                lp++;
            //case 3
            else
                rp--;  
        }
    
        return false;
    }

    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(pairsum(list,6));
    }

}