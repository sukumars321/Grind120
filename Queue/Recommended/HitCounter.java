// In this question, you need to design a HitCounter class.

// In this class, there are the following functions:

//     HitCounter(): No-argument constructor
//     void hit(int timestamp): Indicates that a tap occurs at the specified time
//     int getHits(int timestamp): Returns the total number of hits within 300 seconds before the specified time

// Where timestamp is in seconds.

import java.util.ArrayDeque;
import java.util.Deque;

public class HitCounter {

    Deque<Integer> queue;

    public HitCounter() {
        queue = new ArrayDeque<Integer>();
    }

    /**
     * @param timestamp: the timestamp
     * @return: nothing
     */
    public void hit(int timestamp) {
        queue.offer(timestamp);
    }

    /**
     * @param timestamp: the timestamp
     * @return: the count of hits in recent 300 seconds
     */
    // Time Complexity : O(n)
    public int getHits(int timestamp) {
        int starttime = timestamp - 300;

        while (!queue.isEmpty() && queue.peek() <= starttime) {
            queue.poll();
        }

        return queue.size();
    }

    // TC : O(n)
    // SC : O(n)


}