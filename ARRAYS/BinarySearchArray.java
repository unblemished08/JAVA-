 import java.util.*; 
    public class BinarySearchArray
    {

            public static int BinarySearch(int a[],int key)
            {
                int start=0, end=a.length-1;

                while(start<=end)
                {
                    int mid=(start+end)/2;
                
                    if(a[mid]==key)//comparisons
                    return mid;

                    if(a[mid]<key)//right
                    start=mid+1;

                    else//left
                    end=mid-1;
                }

                return -1;
            }

            public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);    
                

                    int arr[]={2,4,6,8,23,34,56};//sorted array
                    

                 System.out.println("ENTER KEY");
                    int k=sc.nextInt();   

                  int f=BinarySearch(arr,k);

                  if(f==-1)
                   System.out.println("NOT FOUND");
                   else
                    System.out.println("FOUND AT ="+f);
            }
    }
    