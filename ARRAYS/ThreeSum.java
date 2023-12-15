import java.util.*;
public class ThreeSum 
{
    public static void main(String[] args)
    {
        int arr[]={-1,0,1,2,-1,4};
        System.out.println(threeSum(arr));
    }

public static List<List<Integer>> threeSum(int nums[])
{
    HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
    for(int i=0; i<nums.length; i++) {
        for(int j=i+1; j<nums.length; j++) {
            for(int k=j+1; k<nums.length; k++) {
                if(nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> triplet = new ArrayList < Integer > ();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    Collections.sort(triplet);
                    hs.add(triplet);
                }
            }
        }
    }
    ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
    for(List<Integer> l:hs)
    {
        result.add(l);
    }
    return result;
}
}