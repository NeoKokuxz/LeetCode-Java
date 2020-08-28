class Solution {
    public int maxProfit(int[] prices) {
            //Track Max Profit
            int maxProfit = 0;
            int lowestBuy = Integer.MAX_VALUE;
            
            //Loop through Array
            for(int i = 0; i < prices.length; i++){
                //Keep track of lowest to buy in
                if(prices[i] < lowestBuy){
                    lowestBuy = prices[i];
                } else {
                    //Always calculate the current price against current lowest buy
                    maxProfit = Math.max(maxProfit, prices[i] - lowestBuy);
                }
            }
            return maxProfit;
    }
}
