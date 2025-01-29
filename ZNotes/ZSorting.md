5. MeetingRooms
    This is precursor to merge intervals, this is pretty easy once we sort the 2D array based on start time.
    I need to remember how to sort 2D array on top of my mind. we can use build in sort or use bubble or selection sort other sorts would be way more complex

42. [57] Insert Interval - https://algo.monster/liteproblems/57
    This probelm extends mergeinterval and meeting room problem, we need to simply merge the overlaps and keep track of it in newInterval variable, Also I came up with a 5 step framework to approach the problems.

43. [15] 3Sum - https://algo.monster/liteproblems/15
    This extends twoSum and we can use twosum as subroutine to solve this problem. The main issue is finding triplets without duplicates, so to effectively solve this we need sort the input and use two pointer technique. I used set to handle the duplicates but we can add conditions to the code (a little complex) to skip the duplicates, see algo monster solution 

54. Meeting Rooms II - https://neetcode.io/solutions/meeting-rooms-ii    https://leetcode.com/discuss/study-guide/2166045/line-sweep-algorithms
    This problem is based on sweep line algorithm, this can be solved using priorityQueue as well after sorting based on start time.

55. [16] 3Sum Closest - https://algo.monster/liteproblems/16
    I was able come up with solution with the hint of using two-pointer for this ques, rest of the problem was understandable from the question, sorting and looking for triplets is the trick with checking the diff of target was currentSum.

56. [435] Non-overlapping Intervals - https://algo.monster/liteproblems/435
    we need to sort the intervals by end time to know to group the intervals that are ending by the same time (possibly), then we compare the last non-overlaping intervals end to start of the current.