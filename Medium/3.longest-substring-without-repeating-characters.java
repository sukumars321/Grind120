/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        char[] sarr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int start = 0, end = 0, count = 0;

        while (end < sarr.length) {
            // remove till the the window is again unique
            while (set.contains(sarr[end])) {
                set.remove(sarr[start++]);
            }
            // add the char increment end by 1 to easily compute count
            set.add(sarr[end++]);
            // since end is incremented by 1 we can do end - start, otherwise we need to add +1
            count = Math.max(end - start, count);
        }

        return count;
    }

    public int lengthOfLongestSubstringL(String s) {
        int maxLength = 0;
        int left = 0;
        int[] charIndex = new int[128];
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            left = Math.max(left, charIndex[currentChar]);
            maxLength = Math.max(maxLength, right - left + 1);
            charIndex[currentChar] = right + 1;
        }
        return maxLength;
    }
}
// @lc code=end
