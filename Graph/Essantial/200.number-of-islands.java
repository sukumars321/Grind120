/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {

    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // every time you encounter 1 start DFS to remove all of its connected
                // components
                if (grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }
        return islands;
    }

    // directions to use for traversal
    int[][] dir = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    private void dfs(char[][] grid, int i, int j) {
        // if out of bound or encountered a zero, dont have to proceed further
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        // mark the cell as zero
        grid[i][j] = '0';
        // run dfs on all four directions
        for (int[] d : dir) {
            dfs(grid, i + d[0], j + d[1]);
        }
    }

    // TC : O(2 * m * n) we visit every node twice in the worst case
    // SC : O(1)
}
// @lc code=end
