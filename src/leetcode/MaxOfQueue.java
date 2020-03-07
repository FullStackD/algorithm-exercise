package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 面试题59 - II. 队列的最大值
 */
public class MaxOfQueue {

    /**
     * Your MaxQueue object will be instantiated and called as such:
     * MaxQueue obj = new MaxQueue();
     * int param_1 = obj.max_value();
     * obj.push_back(value);
     * int param_3 = obj.pop_front();
     */
    class MaxQueue {

        private Deque<Integer> queue;
        private Deque<Integer> maxQ;

        public MaxQueue() {
            queue = new ArrayDeque<>();
            maxQ = new ArrayDeque<>();
        }

        public int max_value() {
            if (queue.isEmpty()) {
                return -1;
            }
            return maxQ.peek();
        }

        public void push_back(int value) {
            queue.offerLast(value);//队尾插入
            while (!maxQ.isEmpty() && value > maxQ.peekLast()) {//获取队尾数据
                maxQ.pollLast();//队尾移除
            }
            maxQ.offerLast(value);

        }

        public int pop_front() {
            if (queue.isEmpty()) {
                return -1;
            }
            int t = queue.pop();
            if (t == maxQ.peek()) {
                maxQ.pop();
            }
            return t;
        }
    }

}
