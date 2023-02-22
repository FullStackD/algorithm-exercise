package leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * 271.字符串的编码与解码
 */
public class LeetCode271 {

    private static final char SPLIT = '/';

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append(SPLIT).append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != SPLIT) {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1 + length;// 跳过分隔符和字符串
            result.add(str.substring(j + 1, i));
        }
        return result;
    }


}
