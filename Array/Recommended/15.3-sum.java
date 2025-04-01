/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        int n = nums.length;
        int j, k, sum;

        // sort the array so that we can use two pointer traversal
        Arrays.sort(nums);

        // using Set to remove duplicate triplets
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n - 2 && nums[i] <= 0; i++) {
            // using two pointer traversal find all triplets
            j = i + 1;
            k = n - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        // Create desired return type and copy the values
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);

        return ans;
    }
}
// @lc code=end
