/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public List<Integer> findAnagramsMyAttempt(String s, String p) {
        if (p.length() > s.length()) {
            return new ArrayList<Integer>();
        }

        // take freq of char occcurence in comparsion string
        int[] pfreq = new int[26];
        for (Character c : p.toCharArray()) {
            pfreq[c - 'a']++;
        }

        char[] str = s.toCharArray();
        int[] freqCopy;
        char ch;
        boolean failed;
        ArrayList<Integer> ansList = new ArrayList<>();
        // run the loop till - len of p
        for (int i = 0; i < str.length - p.length() + 1; i++) {
            // copy the pfreq for comparison
            freqCopy = pfreq.clone();
            failed = false;
            for (int j = 0; j < p.length(); j++) {
                ch = str[i + j];
                if (--freqCopy[ch - 'a'] < 0) {
                    failed = true;
                    break;
                }
            }
            // System.out.println(failed + "\n" + Arrays.toString(freqCopy));
            // continue if we have failed with freq check in the previous loop
            if (failed) {
                continue;
            }
            // System.out.println(Arrays.toString(freqCopy));
            for (int f : freqCopy) {
                if (f != 0) {
                    continue;
                }
            }

            // if the code reaches this line then we have valid anagram starting at i;
            ansList.add(i);

        }

        return ansList;
    }

    public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) {
            return new ArrayList<Integer>();
        }

        int patternLen = p.length();

        // take freq of char occcurence in comparsion string
        int[] patternCount = new int[26];
        for (Character c : p.toCharArray()) {
            patternCount[c - 'a']++;
        }

        // take the initial sliding window
        char[] str = s.toCharArray();
        int[] windowCount = new int[26];
        for (int i = 0; i < patternLen - 1; i++) {
            windowCount[str[i] - 'a']++;
        }

        // slide the window by each character and record the answers
        ArrayList<Integer> ansList = new ArrayList<>();
        for (int i = patternLen - 1; i < str.length; i++) {
            windowCount[str[i] - 'a']++;

            if (Arrays.equals(patternCount, windowCount)) {
                ansList.add(i - patternLen + 1);
            }
            windowCount[str[i - patternLen + 1] - 'a']--;
        }

        return ansList;
    }

}
// @lc code=end
