/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {

    // Idea 1: For each no, run for loop till its zero and count its set bits and
    // add to ans
    // overall complexity is O(n^2)

    // Idea 2: do the same logic but we can reduce bit counting TC to nlog(n) by
    // using
    // while (n > 0) {
    // count++;
    // n = n & (n-1);
    // }

    // Idea 3 : Dynamic programming, we can tabulate the solution using the
    // observation
    // Iterate from 1 to n:
    // For each ( i ):
    // If ( i ) is even, set ans[i] = ans[i / 2].
    // If ( i ) is odd, set ans[i] = ans[i - 1] + 1.

    // idea 2
    // public int[] countBits(int n) {
    // int[] ans = new int[n + 1];
    // int count, k;
    // for (int i = 0; i <= n; i++) {
    // count = 0;
    // k = i;
    // while (k > 0) {
    // count++;
    // k = k & (k - 1);
    // }
    // ans[i] = count;
    // }

    // return ans;
    // }

    // idea 3
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        if (n == 0){
            return ans;
        }
        ans[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                ans[i] = ans[i / 2];
            } else {
                ans[i] = ans[i - 1] + 1;
            }
        }
        // this is also another solution
        for (int i = 1; i <= n; ++i) {

            // Use the previously computed results to find the current number's bit count.

            // 'i & (i - 1)' drops the lowest set bit of i. So 'bitCounts[i & (i - 1)]' gives us

            // the count of bits for the current number without the lowest set bit.

            // Then, we add 1 for the dropped bit to get the final count for the current number.

            ans[i] = ans[i & (i - 1)] + 1;

        }

        return ans;
    }
}
// @lc code=end
