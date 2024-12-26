/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> compMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            if(compMap.containsKey(comp)){
                return new int[]{i, compMap.get(comp)};
            } else {
                compMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
// @lc code=end

