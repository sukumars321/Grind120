/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    // This is exactly Moore Voting Algorithm.
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0){
                candidate = num;
            }
            if (num == candidate){
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
// @lc code=end

