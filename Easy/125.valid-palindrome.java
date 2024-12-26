/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    // This is also classic two pointer question
    // the struggling part is converting the string to valid chars to use
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int start = 0;
        int end = arr.length - 1;
            // This is implementation uses standard functions from Character class which will save time
        // while (start < end) {
        //     strCh = s.charAt(start);
        //     endCh = s.charAt(end);
        //     if (!Character.isLetterOrDigit(strCh)) {
        //         start++;
        //         continue;
        //     }
        //     if (!Character.isLetterOrDigit(endCh)) {
        //         end--;
        //         continue;
        //     }

        //     if (Character.toLowerCase(strCh) == Character.toLowerCase(endCh)) {
        //         start++;
        //         end--;
        //     } else {
        //         return false;
        //     }
        // }


        while(start <= end){
            if (!isAlphaNum(arr[start])){
                start++;
                continue;
            }
            if (!isAlphaNum(arr[end])){
                end--;
                continue;
            }
            if (arr[start] != arr[end]){
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
    private static boolean isAlphaNum(char ch){
        if (ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z'){
            return true;
        }
        return false;
    }
}
// @lc code=end
