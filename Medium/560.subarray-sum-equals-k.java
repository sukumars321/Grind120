/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        int sum = 0, count = 0;
        prefixSum.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            if (prefixSum.containsKey(sum - k)) {
                count += prefixSum.get(sum - k);
            } 
                
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
            
        }
        return count;
    }
}
// @lc code=end
