/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
//  the main idea is to build the ans from right buy 
// finding the biggest squre possible comparing start and end
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int sqStrt;
        int sqEnd;
        int idx = end;
        while (start <= end) {
            sqStrt = nums[start] * nums[start];
            sqEnd = nums[end] * nums[end];
            if (sqStrt > sqEnd) {
                ans[idx--] = sqStrt;
                start++;
            } else {
                ans[idx--] = sqEnd;
                end--;
            }
        }
        return ans;
    }

    // This is what I tried without looking at the solution 
    // similar to merge function of the mergesort
    // public int[] sortedSquares(int[] nums) {
    // int[] ans = new int[nums.length];
    // int minIdx = 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] <= 0) {
    // nums[i] = -1 * nums[i];
    // if (nums[i] < nums[minIdx]) {
    // minIdx = i;
    // }
    // }
    // }

    // int left = minIdx - 1;
    // int right = minIdx + 1;
    // int itr = 0;
    // ans[itr++] = nums[minIdx] * nums[minIdx];

    // while (left >= 0 && right < nums.length) {
    // if (nums[left] <= nums[right]) {
    // ans[itr++] = nums[left] * nums[left];
    // left--;
    // } else {
    // ans[itr++] = nums[right] * nums[right];
    // right++;
    // }
    // }

    // while (left >= 0) {
    // ans[itr++] = nums[left] * nums[left];
    // left--;
    // }

    // while (right < nums.length) {
    // ans[itr++] = nums[right] * nums[right];
    // right++;
    // }

    // return ans;
    // }
}
// @lc code=end
