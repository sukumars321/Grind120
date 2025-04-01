package Recommended;
/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][][] boxCount = new boolean[3][3][10];
        boolean[][] rowsCount = new boolean[9][10];
        boolean[][] colsCount = new boolean[9][10];
        int ele;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                
                if (board[i][j] == '.') {
                    continue;
                }
                // check if this element occured before row, col and box wise
                ele = board[i][j] - '0';
                if (rowsCount[i][ele] || colsCount[j][ele] || boxCount[i / 3][j / 3][ele]) {
                    return false;
                } else {
                    rowsCount[i][ele] = true;
                    colsCount[j][ele] = true;
                    boxCount[i / 3][j / 3][ele] = true;
                }
            }
        }
        return true;
    }
}
// @lc code=end
