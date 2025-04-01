/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int productSoFar = 1;
        int n = nums.length;
        int[] ans = new int[n];
        
        // Compute prefix product from left till i-th index and store it in ans to save space
        for (int i = 0; i < n; i++) {
            ans[i] = productSoFar;
            productSoFar *= nums[i];
        }

        // Reset productSoFar, compute suffix from right and compute ans as well by multiplying prefix and computed suffix
        productSoFar = 1;
        for (int i = n - 1 ; i >= 0; i--) {
            ans[i] *= productSoFar;
            productSoFar *= nums[i];
        }

        // we don't need this at all
        // // now multiply prefix and suffix at i-th index to get answer
        // for (int i = 0; i < n; i++) {
        //     ans[i] = ans[i] * nums[i];
        // }

        return ans;
    }

    //  Space : O(1) excluding ans array, Time : O(n) since iteration 2n times
}
// @lc code=end
