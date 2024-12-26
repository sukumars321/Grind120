/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (char ch : magazine.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            freq[ch - 'a']--;
            // this is the best implementation, we can straight up return the answer
            // if we found a ransomNote char thats not in magazine
            if (freq[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
