package Essantial;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        ArrayList<Integer> list = new ArrayList<>();
        int row = 0, col = -1, direction = 1;
        while (rows > 0 && cols > 0) {
            // visit row in left or right direction based on direction value
            for (int i = 0; i < cols; i++) {
                col += direction;
                list.add(matrix[row][col]);
            }
            // decrement over all rows count
            rows--;

            // visit col in up or down direction based on direction value
            for (int i = 0; i < rows; i++) {
                row += direction;
                list.add(matrix[row][col]);
            }
            // decrement over all rows count
            cols--;
            direction *= -1;
        }

        // System.out.println(list.toString());

        return list;

    }
}
// @lc code=end
