package leetcode;

import java.util.Stack;

/**
 * 739. 每日温度
 */
public class LeetCode739 {

    public int[] dailyTemperatures(int[] temperatures) {
        // 维护一个递减栈（栈顶是最小的元素）
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            // 当前元素比栈顶元素大时，说明栈内的元素都可计算answer
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                res[index] = i - index;
            }
            // 栈为空或者当前元素更小，则将当前元素入栈。
            stack.push(i);
        }
        return res;
    }

    /**
     * 暴力解法
     *
     * @param temperatures
     * @return
     */
    public int[] dailyTemperatures2(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int current = temperatures[i];
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > current) {
                    answer[i] = j - i;
                    break;
                }
            }
        }
        return answer;
    }

}
