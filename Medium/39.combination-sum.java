/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        findCombinations(new ArrayList<Integer>(), candidates, 0, target);
        return ans;
    }

    private void findCombinations(ArrayList<Integer> choices, int[] candidates,
            int index, int target) {
        
        // base conditions
        if (target == 0) {
            ans.add(new ArrayList<>(choices));
            return;
        } else if (target < 0 || index >= candidates.length) {
            return;
        }

        // the main driver code is this, we are actually doing taking/leaving techinque for each 
        // element. only differnce is that we are backtracking the choice by adding and removing the last added element
        choices.add(candidates[index]);
        // taking element
        findCombinations(choices, candidates, index, target - candidates[index]);
        choices.remove(choices.size() - 1);
        // leaving element
        findCombinations(choices, candidates, index + 1, target);
    }
}
// @lc code=end
