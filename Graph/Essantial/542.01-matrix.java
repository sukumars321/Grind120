/*
 * @lc app=leetcode id=542 lang=java
 *
 * [542] 01 Matrix
 */

// @lc code=start

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {

    // we need to use BFS to get the shortest path in unweighted graph
    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        // create result and initialze it with -1;
        int[][] ans = new int[m][n];
        for (int[] row : ans) {
            Arrays.fill(row, -1);
        }

        // create queue and add all 0 cordinates to the queue
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    ans[i][j] = 0;
                    queue.add(new int[] { i, j });
                }
            }
        }

        // then start the BFS
        int i, j;
        while (!queue.isEmpty()) {

            i = queue.peek()[0];
            j = queue.poll()[1];

            // if top element is within bounds and not visited yet
            if (i - 1 >= 0 && ans[i - 1][j] == -1) {
                ans[i - 1][j] = ans[i][j] + 1;
                queue.add(new int[] { i - 1, j });
            }
            // similarly bottom
            if (i + 1 < m && ans[i + 1][j] == -1) {
                ans[i + 1][j] = ans[i][j] + 1;
                queue.add(new int[] { i + 1, j });
            }

            if (j - 1 >= 0 && ans[i][j - 1] == -1) {
                ans[i][j - 1] = ans[i][j] + 1;
                queue.add(new int[] { i, j - 1 });
            }

            if (j + 1 < n && ans[i][j + 1] == -1) {
                ans[i][j + 1] = ans[i][j] + 1;
                queue.add(new int[] { i, j + 1 });
            }

        }

        return ans;
    }

}
// @lc code=end
