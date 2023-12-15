/*Split the given input array into two halves, left and right similar to merge sort
recursively.
● Count the number of inversions in the left half and right half along with the inversions
found during the merging of the two halves.
● Stop the recursion, only when 1 element is left in both halves.
● To count the number of inversions, we will use a two pointers approach. Let us
consider two pointers i and j, one pointing to the left half and the other pointing
towards the right half. harshitanand893@gmail.com
● While iterating through both the halves, if the current element A[i] is less than A[j], add
it to the sorted list, else increment the count by mid – i.
Time complexity - O(n* logn)*/

//refer divide and conquer pdf for diagram

public class InversionCountOptimised 
{
    public static int merge(int arr[], int left, int mid, int right) 
    {
        int i = left, j = mid, k = 0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];
        while ((i < mid) && (j <= right)) 
        {
            if (arr[i] <= arr[j]) {
            temp[k] = arr[i];
            k++;
            i++;
            }
            else {
            temp[k] = arr[j];
            invCount += (mid - i);
            k++;
            j++;
            }
        }

        while (i < mid) 
        {
            temp[k] = arr[i];
            k++;
            i++;
        }       
        while (j <= right) 
        {
            temp[k] = arr[j];
            k++;
            j++;
        }
        for (i = left, k = 0; i <= right; i++, k++) 
        {
            arr[i] = temp[k];
        }
        
        return invCount;
    }

    private static int mergeSort(int arr[], int left, int right) 
    {
        int invCount = 0;
        if (right > left) {
            int mid = (right + left) / 2;
            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);
            invCount += merge(arr, left, mid + 1, right);
        }
        return invCount;
    }

        public static int getInversions(int arr[]) 
        {
            int n = arr.length;
            return mergeSort(arr, 0, n - 1);
        }

    public static void main(String args[]) 
    {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println("Inversion Count = " + getInversions(arr));
    }
}
