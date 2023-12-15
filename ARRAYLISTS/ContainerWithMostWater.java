import java.util.ArrayList;
public class ContainerWithMostWater //BRUTE FORCE APPROACH
{
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

    int maxvol=0;
    for(int i=0;i<list.size();i++)
    {
        for(int j=i+1;j<list.size();j++)
        {
            int vol=Math.min(list.get(i),list.get(j))*(j-i);
            if(vol>maxvol)
            maxvol=vol;
        }
    }

    System.out.println("MAX VOL= "+ maxvol);
}
}