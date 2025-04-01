/*
 * @lc app=leetcode id=622 lang=java
 *
 * [622] Design Circular Queue
 */

// @lc code=start
class MyCircularQueue {

    // this is the optimal solution
    int K, size, start, end;
    int[] arr;

    public MyCircularQueue(int k) {
        start = 0;
        end = -1;
        size = 0;
        this.K = k;
        arr = new int[k];
    }

    public boolean enQueue(int value) {
        if (!isFull()) {
            size++;
            end = (end + 1) % K;
            arr[end] = value;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            size--;
            start = (start + 1) % K;
            return true;
        }
        return false;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[start];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[end];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == K;
    }


    // Enqueue (enQueue): O(1)
    // Dequeue (deQueue): O(1)
    // Front & Rear retrieval: O(1)
    // Space Complexity: O(n) (Fixed-size array)


}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
// @lc code=end
