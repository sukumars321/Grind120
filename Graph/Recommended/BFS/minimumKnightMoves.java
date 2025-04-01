// Minimum Knight Moves
// Difficulty: Medium

// Description:

// In an infinite chessboard with coordinates from -infinity to +infinity, you have a knight at the coordinate (0, 0).

// A knight has 8 possible moves it can make, as illustrated below. Each move is two squares in a cardinal direction, then one square in an orthogonal direction.

// ou are given two integers x and y representing the coordinate of your target position. Return the minimum number of moves required for the knight to reach the position (x, y) from (0, 0).

// -300 <= x, y <= 300
// The coordinates (x, y) are valid coordinates on the infinite chessboard.

import java.util.*;

public class minimumKnightMoves {
    // Method to be implemented by you
    public int minKnightMoves(int x, int y) {

        if (x == y && y == 0) {
            return 0;
        }
        // offset by 310 since the range is in -300 to 300, so that we can declare
        // visited matrix as 621
        x += 310;
        y += 310;
        boolean[][] visited = new boolean[621][621];
        Queue<int[]> que = new LinkedList<>();
        // add the (310,310) in this case, instead of original value (0,0)
        que.add(new int[] { 310, 310 });
        visited[310][310] = true;

        int[][] dirs = new int[][] { { -1, -2 }, { -2, -1 }, { -2, 1 }, { -1, 2 },
                { 1, -2 }, { 2, -1 }, { 2, 1 }, { 1, 2 } };
        int[] pos;
        int i, j, size, moves = 0;
        while (!que.isEmpty()) {
            size = que.size();

            while (size > 0) {
                pos = que.poll();
                i = pos[0];
                j = pos[1];

                if (i == x && j == y) {
                    return moves;
                }

                for (int[] dir : dirs) {
                    i = pos[0] + dir[0];
                    j = pos[1] + dir[1];

                    if (i > -1 && j > -1 && i < visited.length && j < visited[0].length && !visited[i][j]) {
                        que.add(new int[] { i, j });
                        visited[i][j] = true;
                    }
                }
                size--;
            }
            ++moves;
        }

        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        minimumKnightMoves solution = new minimumKnightMoves();

        // Test cases
        test(solution, 2, 1, 1);
        test(solution, 5, 5, 4);
        test(solution, 0, 0, 0);
        test(solution, -2, -1, 1);
        test(solution, 300, 300, 200); // Example of a larger input
        test(solution, -300, -300, 200); // Negative coordinates
        test(solution, 1, 1, 2); // Close to origin but not reachable in one move
        test(solution, 2, 2, 4); // Diagonal move
        test(solution, 3, 3, 2); // Another diagonal move
        test(solution, 100, 100, 68); // Larger input
        test(solution, -100, -100, 68); // Larger negative input
        test(solution, 0, 2, 2); // Straight line move
        test(solution, 2, 0, 2); // Straight line move
        test(solution, 1, 0, 3); // One step away horizontally
        test(solution, 0, 1, 3); // One step away vertically
    }

    private static void test(minimumKnightMoves solution, int x, int y, int expected) {
        int result = solution.minKnightMoves(x, y);
        if (result == expected) {
            System.out.println("Test passed for input (" + x + ", " + y + ")");
        } else {
            System.out.println(
                    "Test failed for input (" + x + ", " + y + "). Expected " + expected + " but got " + result);
        }
    }
}