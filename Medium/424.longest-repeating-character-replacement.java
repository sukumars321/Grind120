/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class Solution {

    public int characterReplacement(String s, int k) {
        char[] str = s.toCharArray();

        int start = 0, end = 0;
        int index, countOfMaxChar = 0, windowLen;
        int[] count = new int[26];
        while (end < str.length) {
            index = str[end] - 'A';
            count[index]++;
            countOfMaxChar = Math.max(countOfMaxChar, count[index]);
            windowLen = end - start + 1;
            // System.out.printf("maxcharcount %d sum %d\n", countOfMaxChar, sumofCount);
            if (windowLen - countOfMaxChar > k) {
                index = str[start] - 'A';
                count[index]--;
                start++;
            }
            // check next char
            end++;
        }

        return end - start;
    }
}
// @lc code=end
