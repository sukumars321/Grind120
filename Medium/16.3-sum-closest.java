/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = 0, sum, start, end;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            
            start = i + 1;
            end = nums.length - 1;
            while (start < end) {
                sum = nums[i] + nums[start] + nums[end];
                // if have exact match return
                if (sum == target) {
                    return sum;
                }

                if (Math.abs(target - sum) < diff) {
                    diff = Math.abs(target - sum);
                    closestSum = sum;
                }
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return closestSum;
    }
}
// @lc code=end
