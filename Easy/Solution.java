/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    // best approach
    // public int firstBadVersion(int n) {
    //     int start = 1;
    //     int end = n;
        
    //     while (start < end) { 
    //         int mid = start + (end - start) / 2;
            
    //         if (isBadVersion(mid)) {
    //             end = mid; 
    //         } else {
    //             start = mid + 1;  
    //         }
    //     }
    //     return start;
    // }


    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                if (start == end) {
                    return mid;
                } else {
                    end = mid;
                }
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
// @lc code=end
