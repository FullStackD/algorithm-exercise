package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 207. 课程表
 */
public class LeetCode207 {

    private List<List<Integer>> edges;
    private int[] visited; // 0 未访问 1 访问中 2 已访问
    private boolean valid = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        visited = new int[numCourses];
        // 初始化每个节点的边
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
        }
        for (int i = 0; i < numCourses && valid; i++) {
            // 找一个未访问的点作为起始点
            if (visited[i] == 0) {
                dfs(i);
            }
        }
        return valid;
    }

    private void dfs(int i) {
        visited[i] = 1;
        // 遍历该节点的所有边
        for (int v : edges.get(i)) {
            if (visited[v] == 0) {
                dfs(v);
                if (!valid) {
                    return;
                }
            } else if (visited[v] == 1) {
                valid = false;
                return;
            }
        }
        visited[i] = 2;// 标记为已访问
    }

}
