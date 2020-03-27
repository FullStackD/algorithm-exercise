package leetcode;

import java.util.ArrayDeque;

/**
 * 71. 简化路径
 */
public class SimplifyPath {

    //用栈
    public static String simplifyPath(String path) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        String[] arr = path.split("/");
        for (String str : arr) {
            if (!str.equals(".") && !str.equals("..") && !str.equals("")) {
                queue.offerLast(str);
            } else if (str.equals("..") && !queue.isEmpty()) {
                queue.pollLast();
            }
        }
        StringBuilder res = new StringBuilder("/");
        if (queue.isEmpty()) {
            return "/";
        }
        while (!queue.isEmpty()) {
            res.append(queue.pollFirst()).append("/");
        }
        return res.substring(0, res.length() - 1);
    }

}
