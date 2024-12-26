/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
class Solution {

    // simple case of removing LSB and counting the removal would suffice

    public int hammingWeight(int n) {
        int count  = 0;
        while (n > 0){
            count++;
            n = n & (n-1);
        }
        return count;   
    }
}
// @lc code=end

