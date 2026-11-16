class Solution {
    public int maxProfit(int[] prices) {
        int p = prices.length;
        int maxProfit = 0;
        for(int i = 0; i < p; i++){
            for(int j = i+1; j < p; j++){
               int profit = prices[j] - prices[i];
               maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
}
