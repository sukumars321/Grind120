/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    
    // this is the previous answer i learned
    // here when we sort strings, its by default lexographic
    // so we can combare the first and last and get the common substring

    // public String longestCommonPrefix(String[] v) {
    // StringBuilder ans = new StringBuilder();
    // Arrays.sort(v);
    // String first = v[0];
    // String last = v[v.length - 1];
    // for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
    // if (first.charAt(i) != last.charAt(i)) {
    // return ans.toString();
    // }
    // ans.append(first.charAt(i));
    // }
    // return ans.toString();
    // }

    // the main idea is finding the sortest length
    public String longestCommonPrefix(String[] strs) {
        char ch;
        // find the shortest string in the array cause we can't have bigger prefix tha
        // the shortest string
        String shortestStr = strs[0];
        for (String string : strs) {
            if (string.length() < shortestStr.length()) {
                shortestStr = string;
            }
        }
        // check if each char in the shortest string is present in all other strings
        // if yes ans is shortest string
        // if no then we return the substring of common length we found
        for (int j = 0; j < shortestStr.length(); j++) {
            ch = strs[0].charAt(j);
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].charAt(j) != ch) {
                    return shortestStr.substring(0, j);
                }
            }
        }
        return shortestStr;
    }
}
// @lc code=end
