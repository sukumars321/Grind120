/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {

    public int climbStairs(int n) {
        int [] memo = new int[n+1];
        return claim(n, memo);
    }

    private int claim(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo[n] == 0){
            memo[n] = claim(n-1, memo) + claim(n-2, memo);
            return memo[n];
        }
        return memo[n];
    }
}
// @lc code=end
