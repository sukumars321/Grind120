/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        return LIS(nums);
        // we need to store index and prev index chosen in memo
        // int[][] memo = new int[nums.length][nums.length + 1];
        // return findLongestSeq(nums, memo, 0, -1);
    }

    private int findLongestSeq(int[] nums, int[][] memo, int idx, int prev_idx) {
        // if we hit the end we return 0;
        if (idx == nums.length) {
            return 0;
        }

        if (memo[idx][prev_idx + 1] != 0) {
            return memo[idx][prev_idx + 1];
        }

        int len = findLongestSeq(nums, memo, idx + 1, prev_idx);

        // take the current element and increase the count, also change the prev_idx to
        // current idx only if its bigger than the previous choice
        // only if the curr is greater than prev try to find the length with curr as
        // prev selection
        if (prev_idx == -1 || nums[prev_idx] < nums[idx]) {
            len = Math.max(len, 1 + findLongestSeq(nums, memo, idx + 1, idx));
        }

        // now take the max of both cases and store and return
        memo[idx][prev_idx + 1] = len;
        return memo[idx][prev_idx + 1];
    }

    private int LIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        // initially all indexes only have one increasing subseq, themselves
        Arrays.fill(dp, 1);
        int max = 1;
        // we take each element index
        for (int i = 1; i < n; i++) {
            // for each index we go back and to check the previous indexes
            for (int j = 0; j < i; j++) {
                // if j value is less then we can append i as next increasing value so we compute max of dp[i], 1 + dp[j]
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
            // since our answer is the max subseq we keep track of the max
            if (dp[i] > max) {
                max = dp[i];
            }
        }

        return max;
    }

}
// @lc code=end
