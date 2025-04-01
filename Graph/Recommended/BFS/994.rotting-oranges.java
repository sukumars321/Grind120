/*
 * @lc app=leetcode id=994 lang=java
 *
 * [994] Rotting Oranges
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    // The main trick is to count the fresh oranges to terminate the process early if there are no more freshoranges

    public int orangesRotting(int[][] grid) {
        // collect all rotten oranges and fresh ones to start the BFS
        Queue<int[]> que = new LinkedList<>();
        int freshOranges = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    que.add(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        int minute = 0;
        int size, i, j;
        int[] pos;

        int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        
        // by checking freshOrnges count we terminate early 
        while (!que.isEmpty() && freshOranges > 0) {
            minute++;
            // run inner loop to rotten oranges in the queue currently
            size = que.size();
            while (size > 0) {
                pos = que.poll();
                for (int[] dir : dirs) {
                    i = pos[0] + dir[0];
                    j = pos[1] + dir[1];
                    if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
                        grid[i][j] = 2;
                        freshOranges--;
                        que.add(new int[] { i, j });
                    }
                }
                size--;
            }
        }

        return freshOranges > 0 ? -1 : minute;
    }

    // TC : O(m * n), SC : O(m * n)
}
// @lc code=end
