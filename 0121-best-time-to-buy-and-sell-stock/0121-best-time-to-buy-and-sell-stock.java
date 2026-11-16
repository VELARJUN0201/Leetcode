class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0],profit=0;
        for(int i : prices){
            min = Math.min(min,i);
            profit = Math.max(profit,i-min);
        }
        return profit;
    }
}