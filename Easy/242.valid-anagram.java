/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {

    // follow up : if string contains unicode chars then we have 
    // to use hashmap instead of constant 26 char array

    public boolean isAnagram(String s, String t) {
        // base condition
        if(s.length() != t.length()){
            return false;
        }
        
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

