// ### Problem Statement: Alien Dictionary

// #### Objective
// Given a list of words sorted lexicographically according to an alien language's dictionary, find the order of characters in the alien language.

// #### Input
// - A list of strings `words` representing the sorted order of words in the alien language.

// #### Output
// - A string representing the characters' order in the alien language. If there are multiple valid orders, return any of them. If it is impossible to determine the order, return an empty string.

// #### Constraints
// 1. `1 <= words.length <= 100`
// 2. `1 <= words[i].length <= 100`
// 3. `words[i]` consists of only lowercase English letters.

// #### Example
// ##### Example 1:
// - **Input**: `words = ["wrt", "wrf", "er", "ett", "rftt"]`
// - **Output**: `"wertf"`
// - **Explanation**: The correct order is: "w" -> "e" -> "r" -> "t" -> "f".

// ##### Example 2:
// - **Input**: `words = ["z", "x"]`
// - **Output**: `"zx"`
// - **Explanation**: The correct order is: "z" -> "x".

// ##### Example 3:
// - **Input**: `words = ["z", "x", "z"]`
// - **Output**: `""`
// - **Explanation**: The order is invalid because "z" -> "x" -> "z" forms a cycle.

// ### Java Code to Test the Problem

// Here is the Java code to test the problem without the solution:


import java.util.*;

public class AlienDictionary {
    public static void main(String[] args) {
        AlienDictionary test = new AlienDictionary();
        
        // Test case 1
        String[] words1 = {"wrt", "wrf", "er", "ett", "rftt"};
        System.out.println(test.alienOrder(words1)); // Expected output: "wertf"

        // Test case 2
        String[] words2 = {"z", "x"};
        System.out.println(test.alienOrder(words2)); // Expected output: "zx"

        // Test case 3
        String[] words3 = {"z", "x", "z"};
        System.out.println(test.alienOrder(words3)); // Expected output: ""
    }

    public String alienOrder(String[] words) {
        // You will write the solution here
        return "";
    }
}