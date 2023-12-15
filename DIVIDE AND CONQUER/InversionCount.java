/*Brute Force Approach
Idea : Traverse through the array, and for every index, find the number of smaller elements on
its right side of the array. This can be done using a nested loop. Sum up the counts for all
indexes in the array and print the sum.
● Traverse through the array from start to end
● For every element, find the count of elements smaller than the current number up to
that index using another loop.
● Sum up the count of inversion for every index.
● Print the count of inversions.
Time complexity - O(n^2)*/
class InversionCount 
{
    public static int getInvCount(int arr[]) 
    {
        int n = arr.length;
        int invCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                invCount++;
                }
            }
        }
        return invCount;
    }

    public static void main(String[] args) 
    {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println("Inversion Count = "+ getInvCount(arr));
    }
}
