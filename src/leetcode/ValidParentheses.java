package leetcode;

import java.util.Stack;

/**
 * Created by Admin on 2017/9/3 0003.
 */
public class ValidParentheses {

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
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }

}
