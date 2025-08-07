public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;//start the min price with highest possible integer value
        int maxProfit = 0;
        for (int price : prices) {  //loop through each array element
            if (price < minPrice) {//if minPrice is greater than given price then minPrice =price
                minPrice = price;
            } else if (price - minPrice > maxProfit) {//else the price given is greater than minPrice then profit will be
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit: " + maxProfit(prices)); // Output: 5
    }
}