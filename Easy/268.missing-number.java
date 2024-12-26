/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {

    // Idea 1 is to use sum of n natural numbers formula 
        // n(n+1)/2 to have the total sum and subtract the actual sum
    
    // idea 2 is to use XOR and first take xor of 1 to n and then the actual arr
    // when we are done we will only have missing number
    public int missingNumber(int[] nums) {
        // Idea 1
        int n  = nums.length; 
        // int totalSum = (n * (n+1)) / 2;
        // int actualSum = 0;
        // for (int i : nums) {
        //     actualSum+=i;
        // }
        // return totalSum - actualSum;
        
        int xorVal= 0;
        for (int i = 1; i <= n; i++) {
            xorVal^=i;
        }

        for (int i : nums) {
            xorVal^= i;
        }
        return xorVal;


    // a little more concise code

    //     // Length of the array should be one number short of the full set
    //     int n = nums.length;
    //     // Initialize answer with the last number (which is n since array is 0-indexed)
    //     int result = n;
    //     // Iterating through the array
    //     for (int i = 0; i < n; ++i) {
    //         // Apply XOR operation between the current index and the element at that index, and XOR that with the current result
    //         // Since a number XORed with itself is 0 and a number XORed with 0 is the number itself, this will eventually leave us with only the missing number
    //         result ^= i ^ nums[i];
    //     }
    //     // Return the result which is the missing number
    //     return result;

    // }
    
    }
}
// @lc code=end

