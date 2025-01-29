/*
 * @lc app=leetcode id=525 lang=java
 *
 * [525] Contiguous Array
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        // base case
        if (nums.length == 1) {
            return 0;
        }
        // map to keep count for the indexes
        HashMap<Integer, Integer> map = new HashMap<>();
        // we have a count of 0 at -1 index
        map.put(0, -1);
        int count = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            // increase count by 1 if 1. if 0 decrease by 1
            count += (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }

        return maxLen;

    }
}
// @lc code=end
