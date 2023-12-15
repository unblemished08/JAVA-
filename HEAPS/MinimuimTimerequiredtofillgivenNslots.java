/* Minimum time required to fill given N slots:
We have an integer N which denotes the number of slots, and an array arr[] consisting of K
integers in the range [1, N] repreand. Each element of the array are in the range [1, N] which
represents the indices of the filled slots. At each unit of time, the index with filled slot fills the
adjacent empty slots. The task is to find the minimum time taken to fill all the N slots..  */

import java.util.*;
public class MinimuimTimerequiredtofillgivenNslots
{
    public static int timeTaken(int arr[],int n,int k)
    {
        boolean filled[]=new boolean[n];
        for(int i=0;i<k;i++)
        {
            filled[arr[i]-1]=true;
        }

        int time=0;
        while(true) {


        for(int i=0;i<n;i++)
        {
            if(filled[i]==true)
            {
                if(i!=0)
                    filled[i-1]=true;

                if(i!=n-1)
                    filled[i+1]=true;

                i++;
            }
        }
            time++;

            if(allFilled(filled,n))
                break;
        }

        return time;
    }

    public static boolean allFilled(boolean filled[],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(!filled[i])
            return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        int arr[]={4,8,9};
        int n=10;
        int k=3;
        System.out.println(timeTaken(arr,n,k));
    }
}