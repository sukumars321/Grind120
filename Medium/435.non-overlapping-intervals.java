/*
 * @lc app=leetcode id=435 lang=java
 *
 * [435] Non-overlapping Intervals
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // sort by endtime
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        
        int count = 0;
        // consider 0th interval as non-overlapping by default
        int end = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end){
                count++;
            } else {
                end = intervals[i][1];
            }
        }
        return count;
    }
}
// @lc code=end
