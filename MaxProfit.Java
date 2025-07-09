class MaxProfit {
    public int maxProfit(int[] prices) {
        //minimum price max value of the integer
        int minPrice=Integer.MAX_VALUE;
        // set maxProfit = 0
        int maxProfit=0;

    //check for the prices of shares each day in the array
     for(int price:prices)
     if(price<minPrice)  //if the price = minPrice ? buy the share.
     {
        minPrice=price;
     }
     //else the price is not the minimum prices
     else 
     {
        //profit = prices minus minprice
        int profit=price-minPrice;
        //check if profit is greater than maxProfit 
        if(profit>maxProfit){
            //if the profit is greater than maxProfit then maxProfit = profit
            maxProfit=profit;

        }
     }
        
// return the maxProfit
      return maxProfit;  
    }

    public static void main(String[] args) {
        MaxProfit solution = new MaxProfit();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(prices);
        System.out.println("Maximum profit: " + result);
    }
}