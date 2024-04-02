package leetcode;

import java.util.Stack;

/**
 * 20. 有效的括号
 */
public class LeetCode20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{':
                    stack.add('}');
                    break;
                case '(':
                    stack.add(')');
                    break;
                case '[':
                    stack.add(']');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }

}
