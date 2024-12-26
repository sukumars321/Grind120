/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else {

                // check if stack is empty before pop/peeking cuz
                // it throws exception and by logic wise also if its empty
                // paranthesis is not valid

                if (st.isEmpty()) {
                    return false;
                }
                if (ch == '}' && st.pop() != '{') {
                    return false;
                }
                if (ch == ')' && st.pop() != '(') {
                    return false;
                }
                if (ch == ']' && st.pop() != '[') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
// @lc code=end
