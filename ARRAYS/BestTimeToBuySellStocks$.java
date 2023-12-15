public class BestTimeToBuySellStocks$
//SHRADHA DIDI'S METHOD
{
    public static int stocks(int prices[])
    {
        int buyprice= Integer.MAX_VALUE;
        int MAXPROFIT=0;  

        for(int i=0;i<prices.length;i++)
        {
            if(buyprice<prices[i])//profit
            {
                int profit=prices[i]-buyprice; //todays profit
                MAXPROFIT=Math.max(MAXPROFIT,profit);
            }
            else//loss
            {
                buyprice=prices[i];
            }
        }      
    return MAXPROFIT;
    }

     public static void main(String args[])
    {
        int price[]={1,7,6,4,10,3,1};
        System.out.println("MAX PROFIT = "+stocks(price));
    }
}
