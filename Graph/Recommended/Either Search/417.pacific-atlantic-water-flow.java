/*
 * @lc app=leetcode id=417 lang=java
 *
 * [417] Pacific Atlantic Water Flow
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    int m;
    int n;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;
        // created visited array to mark if cell is reachable from the ocean
        boolean[][] atlantic = new boolean[m][n];
        boolean[][] pacific = new boolean[m][n];

        // check left edge first colum and right edge last colum
        for (int i = 0; i < m; i++) {
            dfs(heights, pacific, i, 0);
            dfs(heights, atlantic, i, n - 1);
        }

        // similarly check for top and bottom edges
        for (int j = 0; j < n; j++) {
            dfs(heights, pacific, 0, j);
            dfs(heights, atlantic, m - 1, j);
        }


        // now the answer is elements that are both marked in dfs and bfs traversal
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }

    private void dfs(int[][] heights, boolean[][] ocean, int i, int j) {
        // mark the current cell as visited
        ocean[i][j] = true;

        // start dfs for

        for (int[] dir : dirs) {
            int newi = i + dir[0];
            int newj = j + dir[1];

            if (newi >= 0 && newi < m && newj >= 0 && newj < n && heights[newi][newj] >= heights[i][j]
                    && !ocean[newi][newj]) {
                dfs(heights, ocean, newi, newj);
            }
        }

    }
    
    // TC : O(m * n), SC : O(m *n)
}
// @lc code=end
