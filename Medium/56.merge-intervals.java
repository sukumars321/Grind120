/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    // classic merge interval, sorting and checking overlap by comparin end and start is enough
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int ind = 0;
        int[][] ans = new int[intervals.length][2];
        ans[ind++] = intervals[0];

        for (int i = 1; i < ans.length; i++) {
            if (intervals[i][0] <= ans[ind - 1][1]) {
                ans[ind - 1][0] = Math.min(intervals[i][0], ans[ind - 1][0]);
                ans[ind - 1][1] = Math.max(intervals[i][1], ans[ind - 1][1]);
            } else {
                ans[ind] = intervals[i];
                ind++;
            }
        }
        return Arrays.copyOf(ans, ind);
    }
}
// @lc code=end
