/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    // Approach : use hashset and check if current element has appeared before 
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)){
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
    // even simpler implementation
    // public boolean containsDuplicate(int[] nums) {
    //     HashSet set = new HashSet();
    //     for(int num: nums) {
    //     	if(!set.add(num))
    //     		return true;
    //     }
    //     return false;
    // }
}
// @lc code=end

