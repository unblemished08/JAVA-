public class SearchInRoatedSortedArray // O(log n)
{ // use of modified binary search
    public static void main(String[] args)
    {
        // original array 0,1,2,4,5,6,7 rotated about index 3
        int arr[]={4,5,6,7,0,1,2};
        int target=7;
        System.out.println("FOUND AT : "+search(arr,target));
    }

    public static int search(int[] arr,int target)
    {
        int min=findmin(arr); //finds index of min element
        if(arr[min]<=target && target<=arr[arr.length-1]) 
        //search in right part after min element
        return binsearch(arr,min,arr.length-1,target);
        else
        //search in left part before min element
        return binsearch(arr,0,min,target);
    }

    public static int findmin(int[] arr)
    {
        //cant use linear search as O(n) so use idea of binary search
        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(mid>0 && arr[mid-1]>arr[mid])//smallest found
            return mid;
            else if(arr[mid]>=arr[start] && arr[mid]>arr[end])
            //smallest found in right part 
            start=mid+1;
            else
            //smallest found in left part
            end=mid-1;
        }

        return start;
    }

    public static int binsearch(int arr[],int start,int end,int target)
    {
        while(start<end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
            return mid;
            else if(arr[mid] > target)
            end = mid-1;
            else
            start = mid+1;
        }
            return -1;
        }
    }

