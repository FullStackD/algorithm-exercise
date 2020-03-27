package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

    private List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4) {
            return result;
        }
        for (int i = 1; i <= 3; i++) {
            String temp = s.substring(0, i);
            int t = Integer.valueOf(temp);
            if (temp.length() > 1 && temp.charAt(0) == '0') {
                break;
            }
            if (t <= 255 && t >= 0) {
                ArrayDeque<Integer> deque = new ArrayDeque<>();
                deque.offerLast(t);
                backtrack(deque, s.substring(i));
            }
        }
        return result;
    }


    private void backtrack(ArrayDeque<Integer> deque, String s) {
        if (s.length() == 0) {
            return;
        }
        //终止条件
        if (deque.size() == 3) {
            if (s.length() > 3) {
                return;
            }
            if (s.length() > 1 && s.charAt(0) == '0') {
                return;
            }
            int t = Integer.valueOf(s);
            if (t <= 255 && t >= 0) {
                deque.offerLast(t);
                process(deque);
                deque.pollLast();
                return;
            } else {
                return;
            }
        }

        for (int i = 1; i <= 3; i++) {
            if (s.length() < i) {
                return;
            }
            String temp = s.substring(0, i);
            if (temp.length() > 1 && temp.charAt(0) == '0') {
                return;
            }
            int t = Integer.valueOf(temp);
            if (t <= 255 && t >= 0) {
                deque.offerLast(t);
                backtrack(deque, s.substring(i));
                deque.pollLast();
            }
        }
    }

    //生成IP地址
    private void process(ArrayDeque<Integer> deque) {
        StringBuilder sb = new StringBuilder();
        for (Integer integer : deque) {
            sb.append(integer).append(".");
        }
        result.add(sb.substring(0, sb.length() - 1));
    }


}
