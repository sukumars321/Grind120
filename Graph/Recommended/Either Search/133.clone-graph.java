/*
 * @lc app=leetcode id=133 lang=java
 *
 * [133] Clone Graph
 */

// @lc code=start

// Definition for a Node.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Solution {
    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }
        // use an hashmap to track old and new nodes
        HashMap<Node, Node> oldtoNew = new HashMap<>();
   
        return dfs(node, oldtoNew);

    }
    // do DFS to clone the entire graph
    private Node dfs(Node node, HashMap<Node, Node> oldtoNew) {
        // if there is a match in the Map then we have a new node 
        // for the one we are visiting just return that
        if (oldtoNew.containsKey(node)) {
            return oldtoNew.get(node);
        } else {
            // create a new node and add it to the map and do DFS for its neighbours
            Node newNode = new Node(node.val);
            oldtoNew.put(node, newNode);
            for (Node n : node.neighbors) {
                newNode.neighbors.add(dfs(n, oldtoNew));
            }

            return newNode;
        }
    }
}


// class Solution {
//     public Node cloneGraph(Node node) {
//         // {{2 : Node(2)}, {1 : Node(1)}, ... }
//         // {node.val : Node(node.val)} -> format of each entry in map
//         // acts as both visited array and cloned graph storage
//         Map<Integer, Node> valNodeMap = new HashMap<>();

//         if (node == null) {
//             // empty cloneGraph
//             return null;
//         }

//         // (add, poll, peek)
//         Queue<Node> queue = new ArrayDeque<>();
//         // add the root to queue - mark it as visited
//         queue.add(node);
//         valNodeMap.put(node.val, new Node(node.val));

//         while (!queue.isEmpty()) {
//             // deque and peform action
//             Node currentNode = queue.poll();
//             Node clonedNode = valNodeMap.get(currentNode.val);

//             // for all neighbors - add the edge in the cloned graph
//             // which are not visited add them to the queue
//             // processing the batches - not one by one
//             for (Node neighbor : currentNode.neighbors) {

//                 if (!valNodeMap.containsKey(neighbor.val)) {
//                     // not visited
//                     valNodeMap.put(neighbor.val, new Node(neighbor.val));
//                     queue.add(neighbor);
//                 }
                
//                 clonedNode.neighbors.add(valNodeMap.get(neighbor.val));
                                
//             }
//         }

//         return valNodeMap.get(node.val);

//     }
// }

// TC O(N + M) (N - nodes, M - egdes)
// SC - O(N)



// @lc code=end
