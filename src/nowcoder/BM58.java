package nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * BM58 字符串的排列
 */
public class BM58 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str string字符串
     * @return string字符串ArrayList
     */
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return result;
        }
        char[] charStr = str.toCharArray();
        Arrays.sort(charStr);

        boolean[] visited = new boolean[str.length()];
        Arrays.fill(visited, false);
        dfs(charStr, result, visited, new StringBuilder());
        return result;
    }

    private void dfs(char[] charStr, ArrayList<String> result, boolean[] visited, StringBuilder cur) {
        if (cur.length() == charStr.length) {
            result.add(cur.toString());
            return;
        }
        for (int i = 0; i < charStr.length; i++) {
            if (visited[i]) {
                continue;
            }
            if (i > 0 && charStr[i - 1] == charStr[i] && visited[i - 1]) {
                // 当前元素和前一个元素相同，且前一个元素已经用过了
                continue;
            }
            visited[i] = true;
            cur.append(charStr[i]);
            dfs(charStr, result, visited, cur);
            visited[i] = false;
            cur.deleteCharAt(cur.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new BM58().Permutation("ABBC"));
    }


}
