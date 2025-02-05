/*
 * @lc app=leetcode id=179 lang=java
 *
 * [179] Largest Number
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        // convert the integer for to strings
        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = Integer.toString(nums[i]);
        }
        // use custom comparator, this is what I couldnt figureout
        Arrays.sort(numStrings, (a, b) -> (b + a).compareTo(a + b));

        // if first string is zero then all are zero
        if (numStrings[0].equals("0")) {
            return "0";
        }

        // build the number
        StringBuilder number = new StringBuilder();
        for (String num : numStrings) {
            number.append(num);
        }

        return number.toString();
    }
}
// @lc code=end
