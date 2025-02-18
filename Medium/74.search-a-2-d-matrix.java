/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = findRow(matrix, target);
        // we dont have a valid row to check
        if (row == -1) {
            return false;
        }

        return findTarget(matrix, row, target);
    }

    private boolean findTarget(int[][] matrix, int row, int target) {
        int start = 0;
        int end = matrix[0].length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    private int findRow(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        int mid;
        int closest = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (matrix[mid][0] == target) {
                // System.out.printf("row %d\n", start);
                return mid;
            } else if (matrix[mid][0] > target) {
                end = mid - 1;
            } else {
                closest = mid;
                start = mid + 1;
            }
        }
        // System.out.printf("closest %d\n", closest);
        return closest;
    }
    // TC : log (m+n)
}
// @lc code=end
