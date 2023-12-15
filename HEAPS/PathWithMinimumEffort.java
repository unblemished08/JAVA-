/*  Path With Minimum Effort :
We have a two-dimensional grid, each cell of which contains an integer cost which represents
a cost to traverse through that cell, we need to find a path from the top left cell to the bottom
right cell by which the total cost incurred is minimum.*/
import java.util.*;
public class PathWithMinimumEffort
{
    public static class nextCell implements Comparable<nextCell>{
        int i;
        int j;
        int val;

        nextCell(int i, int j,int val){
            this.i = i;
            this.j = j;
            this.val = val;
        }

        @Override
        public int compareTo(nextCell c2)
        {
            if(this.val != c2.val)
                return this.val - c2.val;
            else if(this.i != c2.i)
                return  c2.i - this.i;
            else
            return c2.j - this.j ;
        }
    }

    public static int findPath(int arr[][])
    {
        int i=0,j=0;
        int ans=arr[0][0];
        boolean visited[][]=new boolean[arr.length][arr.length];
        visited[0][0]=true;
        System.out.println(arr[0][0]);
        while(i!=arr.length-1 || j!=arr.length-1)
        {
            nextCell next=find(arr,i,j,visited);
            ans+=next.val;
            i=next.i; 
            j=next.j;
            visited[i][j]=true;
        }

        return ans;
    }

    public static nextCell find(int arr[][],int i,int j,boolean visited[][])
    {
        PriorityQueue<nextCell> pq=new PriorityQueue<>();

        if(i!=arr.length-1 && visited[i+1][j]==false)
        {
            pq.add(new nextCell(i+1,j,arr[i+1][j]));
        }

        if(j!=arr.length-1 && visited[i][j+1]==false)
        {
            pq.add(new nextCell(i,j+1,arr[i][j+1]));
        }

        if(i!=0 && visited[i-1][j]==false)
        {
            pq.add(new nextCell(i-1,j,arr[i-1][j]));
        }

        if(j!=0 && visited[i][j-1]==false)
        {
            pq.add(new nextCell(i,j-1,arr[i][j-1]));
        }

        System.out.println(pq.peek().val+" ");
        return pq.peek();
    }

    public static void main(String[] args)
    {
        int arr[][]={{31,100,65,12,18},
                     {10,13,47,157,6},
                     {100,113,174,11,33},
                     {88,124,41,20,140},
                     {99,32,111,41,20}};

        System.out.println("--------------------"+findPath(arr));
    }
}