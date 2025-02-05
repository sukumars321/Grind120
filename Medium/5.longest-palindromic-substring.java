/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindromeMyFIrstTry(String s) {
        char[] str = s.toCharArray();
        String maxPalString = "";
        int start, end;
        for (int i = 0; i < str.length; i++) {
            start = i;
            end = i;
            while (start >= 0 && end < str.length) {
                if (str[start] == str[end]) {
                    start--;
                    end++;
                } else if (str[start] == str[end - 1]) {
                    start--;
                } else if (str[start - 1] == str[end]) {
                    end++;
                } else {
                    break;
                }

            }
            System.out.printf("start %d end %d", start, end);
            if (maxPalString.length() < end - start - 2) {
                // if (start > 0) {
                // maxPalString = s.substring(0, end + 1);
                // } else if (end == str.length) {
                // maxPalString = s.substring(start, end);
                // } else {
                // maxPalString = s.substring(start, end + 1);
                // }
                maxPalString = s.substring(start + 1, end);
            }
        }
        return maxPalString;
    }

    public String longestPalindrome(String s) {
        char[] str = s.toCharArray();

        int maxLen = 0, oddLen, evenLen, start = 0, end = 0;
        for (int i = 0; i < str.length; i++) {
            oddLen = getMaxLength(str, i, i);
            evenLen = getMaxLength(str, i, i + 1);
            maxLen = Math.max(oddLen, evenLen);

            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int getMaxLength(char[] arr, int left, int right) {
        while (left >= 0 && right < arr.length && arr[left] == arr[right]) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
// @lc code=end
