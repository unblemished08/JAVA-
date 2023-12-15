 import java.util.*; 
    public class LinearSearchArray
    {
            public static void input(int a[])
            {
                Scanner sc=new Scanner(System.in);
                for(int i=0;i<a.length;i++)
                {
                    a[i]=sc.nextInt();
                }
            }

            public static int LinearSearch(int a[],int key)
            {
                for(int i=0;i<a.length;i++)
                {
                    if(a[i]==key)
                    return i;
                }

                return -1;
            }

            public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);    
                System.out.println("ENTER NO. OF CELLS");
                    int r=sc.nextInt();

                    int arr[]=new int[r];
                    input(arr);

                 System.out.println("ENTER KEY");
                    int k=sc.nextInt();   

                  int f=LinearSearch(arr,k);

                  if(f==-1)
                   System.out.println("NOT FOUND");
                   else
                    System.out.println("FOUND AT ="+f);
            }
    }
    