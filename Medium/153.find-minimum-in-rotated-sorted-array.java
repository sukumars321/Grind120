/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        // you search till you end up in the same index.
        while (start < end) {
            mid = (start + end) / 2;
            // mid is greater than end then we are still in the middle of rotate sorted array
            // so move start
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                // if not then we don't if mid itself if not the answer so do mid instead of mid-1.
                // ex. [3,1,2]
                end = mid;
            }
        }
        return nums[start];
    }
}
// @lc code=end
