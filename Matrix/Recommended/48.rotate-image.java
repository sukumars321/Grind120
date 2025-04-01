package Recommended;

/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start

class Solution {

    // the idea behind the solution is to rotate the outer 4 walls clockwise
    // and move inside till we have rotated all the walls
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        int value, temp;
        int rotations = matrix.length / 2;
        // we decide on rotations
        for (int i = 0; i < rotations; i++) {
            int row = i, col = i - 1;
            // then we iterate the current top row we are trying to rotate
            for (int j = 0; j < n - 2 * i; j++) {

                col++;
                value = matrix[row][col];
                // and we rotate 4 times till we come back to the index we started but replacing
                // it with correct value
                int k = 4;
                while (k > 0) {
                    int newrow = col;
                    int newcol = n - row;

                    temp = matrix[newrow][newcol];
                    matrix[newrow][newcol] = value;

                    value = temp;
                    row = newrow;
                    col = newcol;

                    k--;
                }

            }
        }
        // TC : O(n^2), SC : O(1)
    }
    
    // the usuall solution is to  flip the matrix upside down and 
    // flip across diagonal
    
    public void rotateTranspose(int[][] matrix) {

        // Obtain the length of the matrix which is a square (same width and height)

        int n = matrix.length;

        // Step 1: Perform a vertical flip of the matrix

        // Loop over the first half of the rows (vertically)

        for (int row = 0; row < (n >> 1); ++row) {

            // Loop over all columns

            for (int col = 0; col < n; ++col) {

                // Swap the element at the current position with the element at the mirrored row

                // across the horizontal axis

                int temp = matrix[row][col];

                matrix[row][col] = matrix[n - row - 1][col];

                matrix[n - row - 1][col] = temp;

            }

        }

        // Step 2: Transpose the matrix by flipping it along its diagonal

        // Loop over all rows

        for (int row = 0; row < n; ++row) {

            // Loop over the columns up to the current row (to avoid re-flipping)

            for (int col = 0; col < row; ++col) {

                // Swap the element at (row, col) with the element at (col, row)

                int temp = matrix[row][col];

                matrix[row][col] = matrix[col][row];

                matrix[col][row] = temp;

            }

        }

    }
}
// @lc code=end
