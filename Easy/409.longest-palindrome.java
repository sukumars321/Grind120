/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start

import java.util.HashMap;
    // best approach
// public int longestPalindrome(String s) {
//     int oddFreqCharsCount = 0;
//     Map<Character, Integer> frequencyMap = new HashMap<>();

//     // Loop over the string
//     for (char c : s.toCharArray()) {
//         // Update count of current character
//         frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

//         // If the current freq of the character is odd,
//         // increment oddCount
//         if ((frequencyMap.get(c) % 2) == 1) {
//             oddFreqCharsCount++;
//         } else {
//             oddFreqCharsCount--;
//         }
//     }

//     // If there are characters with odd frequencies, we are
//     // guaranteed to have at least one letter left unmatched,
//     // which can make the center of an odd length palindrome.
//     if (oddFreqCharsCount > 0) {
//         return s.length() - oddFreqCharsCount + 1;
//     } else {
//         return s.length();
//     }
// }

// this is a greedy algorithm to figure out the length
class Solution {
    public int longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        boolean hasOddFreq = false;
        int count = 0;
        int freq;
        for (Character ch : map.keySet()) {
            freq = map.get(ch);
            if (freq % 2 == 0) {
                count += freq;
            } else {
                count += (freq - 1);
                hasOddFreq = true;
            }
        }

        if (hasOddFreq) {
            return count + 1;
        }
        return count;
    }
}
// @lc code=end
