/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    // my solution doesn't pass all test cases
    public int canCompleteCircuitMySolution(int[] gas, int[] cost) {

        // find possible starts by checking if we have surplus fuel to start in any
        // station
        // there is a possiblity of multiple starts, i didn't account for that in first
        // try
        ArrayList<Integer> starts = new ArrayList<>();
        for (int i = 0; i < cost.length; i++) {
            if (gas[i] - cost[i] >= 0) {
                starts.add(i);
            }
        }

        // if we don't find any starts that we can use return -1;
        if (starts.isEmpty()) {
            return -1;
        }

        // then we try to check if we can complete the circuit starting at any one of
        // the start
        int station;
        for (int start : starts) {
            int carGas = 0;
            for (int i = 0; i < cost.length; i++) {
                station = (start + i) % cost.length;
                carGas = carGas + gas[station] - cost[station];
                if (carGas < 0) {
                    break;
                }
            }
            if (carGas >= 0) {
                return start;
            }
        }

        return -1;
    }

    // learned solution
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // the main idea is to see if we have enough gas to travel by totaling gas and cost
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        // we cost is high we can't travel
        if (totalGas < totalCost) {
            return -1;
        }

        int currentGas = 0;
        int start = 0;
        // at each index we compute current gas to see surplus to make that the starting point
        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return start;
    }

}

// @lc code=end
