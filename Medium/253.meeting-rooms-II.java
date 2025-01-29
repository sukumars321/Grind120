
// Problem statement

// Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], 
// return the minimum number of conference rooms required.

// Example 1:
// Input: intervals = [[0,30],[5,10],[15,20]]
// Output: 2

// Example 2:
// Input: intervals = [[7,10],[2,4]]
// Output: 1

// Constraints:
//     1 <= intervals.length <= 10^4
//     0 <= starti < endi <= 10^6

// Answer - https://neetcode.io/solutions/meeting-rooms-ii

import java.util.Arrays;
import java.util.PriorityQueue;

class MeetingRoomsII {
    public static void main(String[] args) {
        int[][] intervals = { { 2, 4 }, { 1, 3 } };
        System.out.println(" Conference Rooms needed " + minRooms(intervals));
    }
    
    private static int minRooms(int[][] intervals) {
        // this uses lambda expression
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        // PQ automatically sort and keeps the smallest element in the head
        PriorityQueue <Integer> minQ = new PriorityQueue<>();
        
        int start, end;
        for (int i = 0; i < intervals.length; i++) {
            
            start = intervals[i][0];
            end = intervals[i][1];
            
            // if end of the one of the meetings is less than or equal to current start we remove head
            if (!minQ.isEmpty() && minQ.peek() <= start) {
                minQ.poll();    

            }
            // add the end to use in future calculations
            minQ.offer(end);
        }
        // the size of the queue is the overall rooms needed
        return minQ.size();
    }

    // TC : O(n logn) SC : O(n)

    // Line Sweep Alogorithm
    public int minMeetingRooms(List<Interval> intervals) {
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (Interval i : intervals) {
            mp.put(i.start, mp.getOrDefault(i.start, 0) + 1);
            mp.put(i.end, mp.getOrDefault(i.end, 0) - 1);
        }
        int prev = 0;
        int res = 0;
        for (int key : mp.keySet()) {
            prev += mp.get(key);
            res = Math.max(res, prev);
        }
        return res;
    }
}

