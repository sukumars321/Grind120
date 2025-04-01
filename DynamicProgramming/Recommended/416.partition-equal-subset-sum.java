/*
 * @lc app=leetcode id=416 lang=java
 *
 * [416] Partition Equal Subset Sum
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        return memo(nums, 0, 0, 0);
    }

    private boolean memo(int[] nums, int i, int sumA, int sumB) {
        if (i == nums.length) {
            return sumA - sumB == 0;
        }
        // adding to sumA gives us true we found the answer, return true
        if (memo(nums, i + 1, sumA + nums[i], sumB)) {
            return true;
        } else {
            // else retrun whatever we get from adding to sumB
            return memo(nums, i + 1, sumA, sumB + nums[i]);
        }

    }
}
// @lc code=end
