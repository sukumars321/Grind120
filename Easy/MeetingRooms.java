import java.util.Arrays;
import java.util.Comparator;

// Meeting Rooms
// Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...](s1,e1),[s2,e2),...), determine if a person could attend all meetings.
// Example 1:
// Input: [[0,30],[5,10],[15,20]]
// Output: false
// Explanation: The person cannot attend the meetings from 5:00 to 10:00 and from 15:00 to 20:00.
// Example 2:
// Input: [[7,10],[2,4]]
// Output: true
// Explanation: The person can attend all meetings.
// Constraints:

//     0 <= intervals.length <= 10^4
//     intervals[i].length == 2
//     0 <= start_i < end_i <= 10^6

class MeetingRooms {
    public static void main(String[] args) {
        int[][] intervals = { { 2, 4 }, { 1, 3 } };
        System.out.println("Can Attend " + canAttend(intervals));
    }

    private static boolean canAttend(int[][] intervals) {
        // Sorting the array is the hardest part of this problem
        // This is how you sort 2D array using inbuilt func
        // this uses Comparator
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // this uses lambda expression
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] > intervals[i][0]) {
                return false;
            }
        }
        return true;
    }

    static void selectionSort(int[][] arr) {
        int minInd;
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            minInd = i;
            swap = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] < arr[minInd][0]) {
                    swap = true;
                    minInd = j;
                }
            }
            if (swap) {
                int[] temp = arr[minInd];
                arr[minInd] = arr[i];
                arr[i] = temp;
            }
        }
    }
}