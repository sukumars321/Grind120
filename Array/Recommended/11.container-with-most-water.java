/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    // simple two-pointer sum and calculation of max water at each step is sufficient
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int max = Integer.MIN_VALUE;
        int curr;
        
        while (start < end) {
            // we take the min height b/w start and end, calculate water containble by multiplying distance
            curr = Math.min(height[start], height[end]) * (end - start);
            if (max < curr){
                max = curr;
            }
            // we greedly keep the max height we have b/w start and end for next calculation
            if(height[start] <= height[end]){
                start++;
            } else {
                end--;
            }
        }

        return max;
    }
}
// @lc code=end
