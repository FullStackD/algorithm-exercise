package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 417. 太平洋大西洋水流问题
 */
public class LeetCode417 {


    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                List<Integer> list = new ArrayList<>();
                if (dfs(heights, new boolean[heights.length][heights[0].length], heights[i][j], i, j, new HashSet<>())) {
                    list.add(i);
                    list.add(j);
                }
                if (!list.isEmpty()) {
                    result.add(list);
                }
            }
        }
        return result;
    }

    private boolean dfs(int[][] heights, boolean[][] used, int currNum, int i, int j, Set<String> set) {
        if (i < 0 || j < 0) {
            set.add("P");
            if (set.size() == 2) {
                return true;
            }
            return false;
        }
        if (i == heights.length || j == heights[0].length) {
            set.add("A");
            if (set.size() == 2) {
                return true;
            }
            return false;
        }
        if (heights[i][j] > currNum || used[i][j]) {
            return false;
        }
        used[i][j] = true;

        return dfs(heights, used, heights[i][j], i + 1, j, set) ||
                dfs(heights, used, heights[i][j], i - 1, j, set) ||
                dfs(heights, used, heights[i][j], i, j + 1, set) ||
                dfs(heights, used, heights[i][j], i, j - 1, set);
    }

}
