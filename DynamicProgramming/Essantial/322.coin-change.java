/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

// @lc code=start

import java.util.Arrays;

class Solution {

    public int coinChange(int[] coins, int amount) {
        // int[] memo = new int[amount + 1];
        // int answer = minCoin(coins, memo, amount);
        // return answer == Integer.MAX_VALUE ? -1 : answer;
        
        return minCoinTab(coins, amount);
    }

    private int minCoinTab(int[] coins, int amount){
        int[] memo = new int[amount + 1];
        // fill the memo with max in this case amount + 1 so that we can check for min
        Arrays.fill(memo, amount + 1);
        // it takes 0 coins to get a some of 0, base condition
        memo[0] = 0;

        // 0 1 2 3 4 5 6 6 7 8 9 10 11
        // 0 1 2 2 2 1
        // 1x1 2x1 1x2 (3)
        //         1x1
        for (int curAmount = 1; curAmount < memo.length; curAmount++) {
            // for all coins combination, check how many coins it would take to get the
            // current amount
            for (int coin : coins) {
                if (curAmount - coin >= 0) {
                    // if reminder amount is great than zero then we can take this coin (1) and look
                    // up for the reminder in memo
                    memo[curAmount] = Integer.min(memo[curAmount], 1 + memo[curAmount - coin]);
                }
            }
        }
        return memo[amount] == amount + 1 ? -1 : memo[amount];
    }

    private int minCoin(int[] coins, int[] memo, int amount) {
        // base condition, // if amount is 0 then we have one of the valid answer
        if (amount == 0) {
            return 0;
        } else if (amount < 0) {
            return Integer.MAX_VALUE;
        } else if (memo[amount] != 0) {
            return memo[amount];
        }

        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int newamount = amount - coin;
            int ans = minCoin(coins, memo, newamount);
            if (ans != Integer.MAX_VALUE) {
                min = Integer.min(min, ans + 1);
            }
        }

        memo[amount] = min;
        // and return the min as results
        return min;
    }

    // public static void main(String[] args) {
    //     Solution solution = new Solution();
    //     // Test cases
    //     test(solution, new int[] { 1, 2, 5 }, 11, 3);
    //     test(solution, new int[] { 2 }, 3, -1);
    //     test(solution, new int[] { 1 }, 0, 0);
    //     test(solution, new int[] { 1 }, 1, 1);
    //     test(solution, new int[] { 1 }, 2, 2);
    //     test(solution, new int[] { 1, 2, 5 }, 100, 20);
    //     test(solution, new int[] { 2, 5, 10, 1 }, 27, 4);
    //     test(solution, new int[] { 186, 419, 83, 408 }, 6249, 20);
    // }

    // private static void test(Solution solution, int[] coins, int amount, int expected) {
    //     int result = solution.coinChange(coins, amount);
    //     if (result == expected) {
    //         System.out.println("Test passed for input (coins: " + Arrays.toString(coins)
    //                 + ", amount: " + amount + ")");
    //     } else {
    //         System.out.println("Test failed for input (coins: " + Arrays.toString(coins)
    //                 + ", amount: " + amount
    //                 + "). Expected " + expected + " but got " + result);
    //     }
    // }

}
// @lc code=end
