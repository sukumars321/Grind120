/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start

import java.util.Stack;

class MyQueue {

    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    // we use first stack for push and 
    // second stack for pop and peek operation
    
    public void push(int x) {
        // initialy had a copy operation here and that is not need 
        // if we think the problem through cuz we can add in the first
        // with out affecting the order
        first.push(x);
    }
    
    public int pop() {
         //if second is empty we need copy elements from first
         // cuz second is what we use to pop and peek
         copy(second, first);
        return second.pop();
    }
    
    public int peek() {
        // same logic here if second is empty we need copy elements from first
         // cuz second is what we use to pop and peek
        copy(second, first);
        return second.peek();
    }
    
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }


    // this function copies one stack to another    
    private void copy(Stack<Integer> a, Stack<Integer> b){
        if (a.isEmpty()){
            while (!b.isEmpty()) {
                a.push(b.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

