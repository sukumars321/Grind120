
// 0 - 1 Knapsack Problem
// Difficulty: MediumAccuracy: 31.76%Submissions: 476K+Points: 4

// Given n items, each with a specific weight and value, and a knapsack with a capacity of W, the task is to put the items in the knapsack such that the sum of weights of the items <= W and the sum of values associated with them is maximized. 

// Note: You can either place an item entirely in the bag or leave it out entirely. Also, each item is available in single quantity.

// Examples :

// Input: W = 4, val[] = [1, 2, 3], wt[] = [4, 5, 1] 
// Output: 3
// Explanation: Choose the last item, which weighs 1 unit and has a value of 3.

// Input: W = 3, val[] = [1, 2, 3], wt[] = [4, 5, 6] 
// Output: 0
// Explanation: Every item has a weight exceeding the knapsack's capacity (3).

// Input: W = 5, val[] = [10, 40, 30, 50], wt[] = [5, 4, 2, 3] 
// Output: 80
// Explanation: Choose the third item (value 30, weight 2) and the last item (value 50, weight 3) for a total value of 80.

// Constraints:
// 2 ≤ val.size() = wt.size() ≤ 103
// 1 ≤ W ≤ 103
// 1 ≤ val[i] ≤ 103
// 1 ≤ wt[i] ≤ 103





public class Knapsack {
    static int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        int[][] memo = new int[n][W + 1];
        return maxBag(n - 1, W, memo, val, wt);
    }

    private static int maxBag(int ind, int W, int[][] memo, int[] val, int[] wt) {
        if (ind == 0) {
            if (wt[0] <= W) {
                return val[0];
            }
            return 0;
        }

        if (memo[ind][W] != 0) {
            return memo[ind][W];
        }

        int take = Integer.MIN_VALUE;
        if (wt[ind] <= W) {
            take = val[ind] + maxBag(ind - 1, W - wt[ind], memo, val, wt);
        }
        int leave = maxBag(ind - 1, W, memo, val, wt);

        memo[ind][W] = Math.max(take, leave);
        return memo[ind][W];
    }

    private static int maxBagtab(int W, int val[], int wt[]) {
        int n = val.length;
        int[][] dp = new int[n][W + 1];

        // base case
        for (int i = wt[0]; i <= W; i++) {
            dp[0][i] = val[0];
        }

        for (int ind = 0; ind < n; ind++) {
            for (int w = 0; w <= W; w++) {
                
                int take = Integer.MIN_VALUE;
                if (wt[ind] <= w) {
                    take = val[ind] + dp[ind - 1][w - wt[ind]];
                }
                
                int leave = dp[ind - 1][w];

                dp[ind][w] = Math.max(take, leave);
            }
        }
        return dp[n-1][W];

    }

}
