package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 323.无向连通图中的连通分量个数
 */
public class LeetCode323 {

    private int res = 0;

    public int countComponents(int n, int[][] edges) {
        int[] visited = new int[n];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i < n; i++) {
            // 找一个未访问的点作为起始点
            if (visited[i] == 0) {
                dfs(i, visited, graph);
                res++;
            }
        }
        return res;
    }

    private void dfs(int i, int[] visited, List<List<Integer>> graph) {
        visited[i] = 1;
        // 遍历该节点的所有边
        for (Integer v : graph.get(i)) {
            if (visited[i] == 0) {
                dfs(v, visited, graph);
            }
        }
    }

}
