/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {

    public int climbStairs(int n) {
        // int[] memo = new int[n + 1];

        // return claimTab(n, memo);
        // return claim(n, memo);
        // return claimO1(n);
        return f(n);
    }
    // basic recursion, gets TLE 
    private int f(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }

    // memoization
    private int claim(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo[n] == 0) {
            memo[n] = claim(n - 1, memo) + claim(n - 2, memo);
            return memo[n];
        }
        return memo[n];
    }

    // tabulation
    private int claimTab(int n, int[] memo) {
        memo[0] = 1;
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }

    // O(1) memory solution
    private int claimO1(int n) {
        int prev2 = 1;
        int prev = 1;
        int curr;

        for (int i = 2; i <= n; i++) {
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        return prev;
    }

}
// @lc code=end
