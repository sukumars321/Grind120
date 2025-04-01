/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */

// @lc code=start

import java.util.*;


// using deck
class MyStack {

    Deque<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();
    }

    public void push(int x) {
        queue.addLast(x);
    }

    public int pop() {
        return queue.removeLast();
    }

    public int top() {
        return queue.peekLast();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

// using 2 queue

class Stack2Queue {

    Queue<Integer> first;
    Queue<Integer> second;

    public Stack2Queue() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }

    public void push(int x) {
        if (first.isEmpty()) {
            second.add(x);
        } else {
            first.add(x);
        }
    }

    public int pop() {
        int val = Integer.MIN_VALUE;
        if (first.isEmpty()) {
            while (true) {
                val = second.remove();
                if (!second.isEmpty()) {
                    first.add(val);
                } else {
                    break;
                }
            }
            return val;
        } else {
            while (true) {
                val = first.remove();
                if (!first.isEmpty()) {
                    second.add(val);
                } else {
                    break;
                }
            }
            return val;
        }
    }

    public int top() {
        int val = Integer.MIN_VALUE;
        if (first.isEmpty()) {
            while (!second.isEmpty()) {
                val = second.remove();
                first.add(val);
            }
            return val;
        } else {
            while (!first.isEmpty()) {
                val = first.remove();
                second.add(val);
            }
            return val;
        }
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.isEmpty();
 */


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
