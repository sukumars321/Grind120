/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        int oldColor = image[sr][sc];
        fill(image, sr, sc, oldColor, color);
        return image;
    }

    // my implementation
    private static void fill(int[][] image, int row, int col, int oldColor, int newColor) {
        if (image[row][col] == oldColor) {
            image[row][col] = newColor;
            if (row - 1 >= 0) {
                fill(image, row - 1, col, oldColor, newColor);
            }

            if (row + 1 < image.length) {
                fill(image, row + 1, col, oldColor, newColor);
            }

            if (col - 1 >= 0) {
                fill(image, row, col - 1, oldColor, newColor);
            }

            if (col + 1 < image[0].length) {
                fill(image, row, col + 1, oldColor, newColor);
            }
        }

    }

    static int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    // learned implementation
    private static void fillbetter(int[][] image, int row, int col, int oldColor, int newColor) {

        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != oldColor
                || image[row][col] == newColor) {
            return;
        }
        image[row][col] = newColor;
        for (int[] dir : dirs) {
            fillbetter(image, row + dir[0], col + dir[1], oldColor, newColor);
        }

    }
}
// @lc code=end
