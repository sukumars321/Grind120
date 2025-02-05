/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> groups = new HashMap<>();
        
        for (String str : strs) {
            // create a key for the groups by sorting the string alphabetically
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            // use the key to either update existing list or create new one
            groups.computeIfAbsent(sorted, key -> new ArrayList<>()).add(str);
        }
        // System.out.println(groups);
        return new ArrayList<>(groups.values());
    }
}
// @lc code=end
