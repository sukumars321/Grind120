/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int longestConsecutiveMysolution(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        // Copy all elements to set for easier lookup and eliminate duplication
        HashSet<Integer> numsSet = new HashSet<Integer>();
        for (int n : nums) {
            numsSet.add(n);
        }

        //
        int count = numsSet.size();
        if (count <= 1) {
            return count;
        }

        for (int n : nums) {
            if ((numsSet.contains(n - 1) && numsSet.contains(n + 1))) {
                continue;
            } else {
                count--;
            }
        }
        return count;
    }

    // Learned Solution
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        // Copy all elements to set for easier lookup
        HashSet<Integer> numsSet = new HashSet<Integer>();
        for (int n : nums) {
            numsSet.add(n);
        }

        // initialize vars
        int length;
        int longest = 0;
        
        // the main observation is all starts of sequences doesn't have left element
        // for ex. 1,2,3,4    100,    200. here we dont have left element for sequence starts
        // so we can try to find max sequence count by checking all starts
        for (int n : nums) {
            if (!numsSet.contains(n - 1)) {
                length = 1;
                while (numsSet.contains(n + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
// @lc code=end
