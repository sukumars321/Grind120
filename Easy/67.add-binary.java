/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    // simple addition logic should solve it
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        // to correctly do addition we have traverse from the back
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                carry += b.charAt(j) - '0';
                j--;
            }
            sb.append(carry % 2);
            carry = carry / 2;
        }

        // reverse the sb before returning cause we build the answer in reverse
        return sb.reverse().toString();
    }

    // another approach
    // BigInteger i = new BigInteger(a, 2); 
    //     BigInteger j = new BigInteger(b, 2);
    //      BigInteger sum = i.add(j);
    //   return sum.toString(2);
}
// @lc code=end
