import java.util.ArrayList;
public class FindMaximum
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(22);
        list.add(30);
        list.add(49);
        list.add(35);

        int max=Integer.MIN_VALUE;
        for (int i=0; i<list.size(); i++)
        {
            max=Math.max(max,list.get(i));
        }

        System.out.println(max);
    }
}