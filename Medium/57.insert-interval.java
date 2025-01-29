/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {

    // precursor problem : Meeting Rooms
    // public int[][] insert(int[][] intervals, int[] newInterval) {
    //     // we need basically merge inputs and resort the whole array and then merge the
    //     // intervals
    //     int[][] merged = new int[intervals.length + 1][2];
    //     int i = 0;
    //     merged[i++] = newInterval;
    //     for (int[] is : intervals) {
    //         merged[i++] = is;
    //     }

    //     // alternate you can use selection sort to sort 2D arrays
    //     Arrays.sort(merged, Comparator.comparingInt(a -> a[0]));

    //     ArrayList<int[]> ans = new ArrayList<>();
    //     for (int j = 0; j < merged.length - 1; j++) {
    //         if (merged[j][1] < merged[j + 1][0]) {
    //             ans.add(merged[j]);
    //         } else {
    //             merged[j + 1][0] = Math.min(merged[j][0], merged[j + 1][0]);
    //             merged[j + 1][1] = Math.max(merged[j][1], merged[j + 1][1]);
    //         }
    //     }

    //     ans.add(merged[merged.length - 1]);
    //     return ans.toArray(new int[ans.size()][]);
    // }

    // this problem can be solved with my initial approach of iterating once
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0;
        int n = intervals.length;
        ArrayList<int[]> ans = new ArrayList<>();
        
        // copy till we encounter an overlap
        while (i < n && intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }

        //merge till we have an overlap between the newInterval and interval at ith index,
        while (i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        ans.add(newInterval);
        
        // copy the rest of the intervals to ans
        while (i < n) {
            ans.add(intervals[i]);
            i++;
        }
       
        return ans.toArray(new int[ans.size()][]);
    }

}
// @lc code=end
