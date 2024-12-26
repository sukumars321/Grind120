/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    // classic two pointer question
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        // the main idea is that whenever we see zero in idx we move ahead
        // thus moving faster than curNonZeroIdx which is where we need to put the next
        // no zero element

        int curNonZeroIdx = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            if(nums[idx]!= 0){
                int temp = nums[curNonZeroIdx];
                nums[curNonZeroIdx++] = nums[idx];
                nums[idx] = temp;
            }
        }
    }
}
// @lc code=end
