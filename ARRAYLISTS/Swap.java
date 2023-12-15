import java.util.ArrayList;
public class Swap
{
    public static void swap(ArrayList<Integer> list,int idx1,int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(22);
        list.add(30);
        list.add(49);
        list.add(35);

        int idx1=2;
        int idx2=4;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}