package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 295. 数据流的中位数
 */
public class LeetCode295 {

    class MedianFinder {

        // 大顶堆 存储较小的一半数，堆顶是最大的数
        private Queue<Integer> smallHeap;
        // 小顶堆 存储较大的一半数，堆顶是最小的数
        private Queue<Integer> largeHeap;

        public MedianFinder() {
            smallHeap = new PriorityQueue<>((a, b) -> b - a);
            largeHeap = new PriorityQueue<>((a, b) -> a - b);
        }

        /**
         * 若两个队列长度不同，中位数放在smallHeap中
         * 若两个队列长度相同，中位数取两个队列堆顶的数求平均数
         * 时间复杂度：O(logn)
         *
         * @param num
         */
        public void addNum(int num) {
            if (smallHeap.size() == largeHeap.size()) {
                if (smallHeap.isEmpty() || num <= largeHeap.peek()) {
                    smallHeap.add(num);
                } else {
                    smallHeap.add(largeHeap.poll());
                    largeHeap.add(num);
                }
            } else {
                if (num > smallHeap.peek()) {
                    largeHeap.add(num);
                } else {
                    largeHeap.add(smallHeap.poll());
                    smallHeap.add(num);
                }
            }
        }

        /**
         * 时间复杂度：O(1)
         *
         * @return
         */
        public double findMedian() {
            if (smallHeap.size() == largeHeap.size()) {
                return (double) (smallHeap.peek() + largeHeap.peek()) / 2;
            } else {
                return smallHeap.peek();
            }
        }
    }
    /**
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder();
     * obj.addNum(num);
     * double param_2 = obj.findMedian();
     */

}
