package Essantial;

/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    // there is a little optimized solution - https://algo.monster/liteproblems/73
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        boolean r0 = false, c0 = false;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {

                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;

                    if (row == col && col == 0) {
                        r0 = true;
                        c0 = true;
                    } else if (row == 0) {
                        r0 = true;
                    } else if (col == 0) {
                        c0 = true;
                    }
                }
            }
        }

        for (int col = n - 1; col > 0; col--) {
            if (matrix[0][col] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][col] = 0;
                }
            }
        }

        for (int row = m - 1; row > 0; row--) {
            if (matrix[row][0] == 0) {
                for (int i = 1; i < n; i++) {
                    matrix[row][i] = 0;
                }
            }
        }

        if (r0) {
            Arrays.fill(matrix[0], 0);
        }
        if (c0) {
            for (int i = 1; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
// @lc code=end
