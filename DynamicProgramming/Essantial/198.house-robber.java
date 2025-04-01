/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start

import java.util.Arrays;

// class HouseRobber {
class Solution {
    public int rob(int[] nums) {
        // memoization
        // int[] memo = new int[nums.length];
        // Arrays.fill(memo, -1);
        // return maxRob(nums, memo, nums.length - 1);

        // tabulation
        return maxRobTab(nums);
    }

    private int maxRobTab(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Integer.max(nums[1], dp[0]);

        for (int i = 2; i < n; i++) {
            dp[i] = Integer.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[n - 1];
    }

    private int maxRob(int[] nums, int[] memo, int idx) {
        if (idx < 0) {
            return 0;
        }

        if (idx == 0) {
            return nums[0];
        }

        if (memo[idx] != -1) {
            return memo[idx];
        }

        // take current element and move 2 indexes
        int take = nums[idx] + maxRob(nums, memo, idx - 2);
        // leave current element and consider next element by moving 1 index
        int leave = maxRob(nums, memo, idx - 1);

        // store the max b/w the current maxSum we got and previous max sum
        memo[idx] = Integer.max(take, leave);

        // and return whatever happens to the max
        return memo[idx];
    }

    // public static void main(String[] args) {
    // HouseRobber hb = new HouseRobber();
    // int[] nums = new int[] { 1, 2, 1, 1 };
    // System.out.println(hb.rob(nums));
    // }
}
// @lc code=end
