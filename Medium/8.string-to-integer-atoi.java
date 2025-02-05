/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        char[] arr = s.toCharArray();

        int ans = 0;
        int index = ignoreLeadingWhiteSpaces(arr);
        if (index >= arr.length || s.isEmpty()) {
            return ans;
        }

        int sign = 1;
        if (arr[index] == '-') {
            sign = -1;
            index++;
        } else if (arr[index] == '+') {
            index++;
        }
        // Pre-calculate the threshold to check for overflow
        int threshold = Integer.MAX_VALUE / 10;

        while (index < arr.length && arr[index] >= '0' && arr[index] <= '9') {

            // Check for overflow when adding a new digit
            if (ans > threshold || (ans == threshold && arr[index] > '7')) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = (ans * 10) + (arr[index++] - '0');

        }

        return ans * sign;
    }

    private int ignoreLeadingWhiteSpaces(char[] arr) {
        int index = 0;
        while (index < arr.length && arr[index] == ' ') {
            index++;
        }
        return index;
    }

}
// @lc code=end
