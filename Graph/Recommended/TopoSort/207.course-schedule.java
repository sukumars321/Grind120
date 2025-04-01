/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

// @lc code=start

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    // this problem is based on Khan's topological sorting algorithm
    // its basically cycle finding problem, basic DFS and BFS works too
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // Count the prerequisite count for each course while creating graph adjList
        int[] inDegrees = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        int course, prerequisite;
        for (int[] egde : prerequisites) {
            course = egde[0];
            prerequisite = egde[1];

            graph.get(prerequisite).add(course);
            inDegrees[course]++;
        }

        // now add the courses with 0 indegree to que and start BFS
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < inDegrees.length; i++) {
            if (inDegrees[i] == 0) {
                que.add(i);
            }
        }

        int processedCourses = 0;

        while (!que.isEmpty()) {
            processedCourses++;
            course = que.poll();
            // for each neighbour reduce its indegree to mark the current course as taken
            // on the way if we have any new 0 indegree ones add them to the queue.
            for (int neighbour : graph.get(course)) {
                inDegrees[neighbour]--;
                if (inDegrees[neighbour] == 0) {
                    que.add(neighbour);
                }
            }
        }
        // if all courses are processed then we have a valid graph without cycles
        return numCourses == processedCourses;
    }

    // TC and SC : O(V + E)
}
// @lc code=end
