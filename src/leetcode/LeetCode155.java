package leetcode;

import java.util.Stack;

/**
 * 155. 最小栈
 */
public class LeetCode155 {

    private Stack<Integer> data;
    private Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public LeetCode155() {
        data = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (data.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        data.pop();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */