import java.util.ArrayList;
public class PairSum2Optimised //2 pointer approach
{
    public static boolean pairsum(ArrayList<Integer> list,int target)
    {
        int bp=-1;
        for(int i=0;i<list.size();i++) {
            if(list.get(i)>list.get(i+1)) { //breaking point
                bp=i;
                break;
            }
        }

        int lp=bp+1; //smallest
        int rp=bp; //largest

        while(lp!=rp) {
            //case 1
            if(list.get(lp)+list.get(rp)==target) {
                return true;
            }

            //case 2
            if(list.get(lp)+list.get(rp)<target)
                lp=(lp+1)%list.size();
            //case 3
            else
                rp=(list.size()+rp-1)%list.size();
        }

        return false;
    }

    public static void main(String[] args) 
    {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairsum(list,16));
    }

}