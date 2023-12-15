public class BestTimeToBuySellStocks
//MY METHOD
{
    public static int SearchMin(int a[])
    {
         int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
           if(min>a[i])
           min=a[i];
        }
        return min;
    }

    public static int SearchMax(int a[],int k)
    {
         int max=k;
        for(int i=IndexOf(a,k);i<a.length;i++)
        {
           if(max<a[i])
           max=a[i];
        }
        return max;
    }

    public static int IndexOf(int a[],int k)
    {
        for(int i=0;i<a.length;i++)
        {
           if(a[i]==k)
           return i;
        }
        return -1;
    }

     public static void main(String args[])
    {
        int price[]={1,7,6,4,10,3,1};
        int min=SearchMin(price);
        int max=SearchMax(price,min);

        System.out.println("MAX PROFIT ="+(max-min));
    }
}
