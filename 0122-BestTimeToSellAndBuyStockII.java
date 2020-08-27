class Solution {
    public int maxProfit(int[] prices) {
            //Keep track of profit
            int profit = 0;

            for(int i = 1; i < prices.length; i++){
                //If current price higher than previous price, sell it
                if(prices[i] > prices[i-1]){
                    profit += prices[i] - prices[i-1];
                }
            }

            return profit;
    }
}
