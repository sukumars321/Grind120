/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start

import java.util.Stack;

class Solution {

    // this question is solved as stack practice which uses extra space 
    // but there is O(1) space solution using two pointers
    // see https://leetcode.com/problems/backspace-string-compare/solutions/4169137/beginner-friendly-two-pointers-apporach-detailed-explaination-beats-100-runtime/

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> first = new Stack<>();
        Stack<Character> second = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (ch == '#') {
                if (!first.isEmpty())
                    first.pop();
            } else {
                first.push(ch);
            }
        }

        for (Character ch : t.toCharArray()) {
            if (ch == '#') {
                if (!second.isEmpty())
                    second.pop();
            } else {
                second.push(ch);
            }
        }

        if (first.size() != second.size()) {
            return false;
        }

        while (!(first.isEmpty() && second.isEmpty())) {
            if (first.pop() != second.pop()) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end
