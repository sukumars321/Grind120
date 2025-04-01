/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    
    // this is my last attempt with 2ms runtime

    // if (prices.length < 2){
    // return 0;
    // }
    // int maxProfit = 0;
    // int profit, sell;
    // int buy = prices[0];
    // for (int i = 1; i < prices.length; i++) {
    // sell = prices[i];
    // profit = sell - buy;
    // maxProfit = Math.max(maxProfit,profit);
    // buy = Math.min(sell, buy);
    // }
    // return maxProfit;

    public int maxProfit(int[] prices) {
        // this is better with 1ms runtime
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int price : prices) {
            if (price < buyPrice) {
                buyPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - buyPrice);
            }
        }
        if (buyPrice == Integer.MAX_VALUE || maxProfit == Integer.MIN_VALUE) {
            return 0;
        }
        return maxProfit;
    }
}
// @lc code=end
