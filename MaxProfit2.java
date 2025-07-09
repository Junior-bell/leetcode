class MaxProfit2 {
    public int maxProfit(int[] prices) {
int profit =0;
for (int i=1;i<prices.length;i++)
{
    if(prices[i]>prices[i-1])
    {
    
    profit+=prices[i]-prices[i-1];
   
    }
   
}
return profit;
    
    }
    public static void main(String[] args) {
        MaxProfit2 solution = new MaxProfit2();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(prices);
        System.out.println("Maximum profit: " + result);
    }

}

