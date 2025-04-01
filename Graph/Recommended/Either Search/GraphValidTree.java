
// Given n nodes labeled from 0 to n-1 and a list of undirected edges (each edge is a pair of nodes), write a function to check whether these edges make up a valid tree.

// A valid tree has the following properties:

// It is fully connected, meaning there is a path between any pair of nodes.
// It contains no cycles.
// Example

// Input: n = 5, edges = [[0, 1], [0, 2], [0, 3], [1, 4]]
// Output: true

// Input: n = 5, edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4], 5, 6]
// Output: false

import java.util.*;

public class GraphValidTree {

    public static void main(String[] args) {
        GraphValidTree test = new GraphValidTree();

        // // Test case 1: Valid tree
        // int n1 = 5;
        // int[][] edges1 = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 4 } };
        // System.out.println("Test case 1: " + test.isValidTree(n1, edges1)); //
        // Expected: true

        // // Test case 2: Not a valid tree (cycle present)
        // int n2 = 5;
        // int[][] edges2 = { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 1, 3 }, { 1, 4 } };
        // System.out.println("Test case 2: " + test.isValidTree(n2, edges2)); //
        // Expected: false

        // // Test case 3: Not a valid tree (disconnected graph)
        // int n3 = 4;
        // int[][] edges3 = { { 0, 1 }, { 2, 3 } };
        // System.out.println("Test case 3: " + test.isValidTree(n3, edges3)); //
        // Expected: false

        // // Test case 4: Single node, no edges
        // int n4 = 1;
        // int[][] edges4 = {};
        // System.out.println("Test case 4: " + test.isValidTree(n4, edges4)); //
        // Expected: true

        // Test case 5: Two nodes, one edge
        int n5 = 2;
        int[][] edges5 = { { 0, 1 } };
        System.out.println("Test case 5: " + test.isValidTree(n5, edges5)); // Expected: true
    }

    // setting it global to access in all the places
    HashMap<Integer, Integer> parent = new HashMap<>();

    // use disjoint set union to efficient check if try is valid in O(nalpha(n))
    public boolean isValidTree(int n, int[][] edges) {
        // create parent and assign each node to its parent
 
        int a, b;

        for (int[] is : edges) {
            a = is[0];
            b = is[1];
            if (find(a) == find(b)) {
                return false;
            }
            union(a, b);
            n--;
        }

        return n == 1;
    }

    private int find(int x) {
        // find parent for x
        int y = parent.getOrDefault(x, x);
        // if y != x which means its not the root node so find the root node and do path
        // compression
        if (y != x) {
            y = find(y);
            parent.put(x, y);
        }
        // finally return the root node found
        return y;
    }

    private void union(int a, int b) {
        parent.put(find(a), find(b));
    }

    // Doing DFS works but very inefficient
    public boolean isValidTree(int n, int[][] edges) {
        // n nodes only have n-1 edges to be valid
        if (edges.length > n - 1) {
            return false;
        }

        HashMap<Integer, ArrayList<Integer>> adjMap = new HashMap<>(n);

        for (int[] pair : edges) {
            ArrayList<Integer> list = adjMap.getOrDefault(pair[0], new ArrayList<>());
            list.add(pair[1]);
            adjMap.put(pair[0], list);
        }

        boolean[] visited = new boolean[n];

        boolean hasCycle = dfs(adjMap, 0, visited);

        if (hasCycle) {
            return false;
        }

        for (boolean v : visited) {
            if (!v) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(HashMap<Integer, ArrayList<Integer>> adjMap, int node,
            boolean[] visited) {
        visited[node] = true;

        ArrayList<Integer> neigbours = adjMap.get(node);
        if (neigbours != null) {
            for (int neigh : neigbours) {
                if (!visited[neigh]) {
                    boolean hasCyle = dfs(adjMap, neigh, visited);
                    if (hasCyle) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }

        return false;
    }
    // TC : O(V + E), SC : O(V + E)

}