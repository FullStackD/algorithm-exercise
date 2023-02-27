package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 133. Clone Graph
 *
 * @author Monster
 * @date 2017/12/14
 */
public class LeetCode133 {

    private Map<Node, Node> map = new HashMap<>();

    private Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        // 如果该节点已经被访问过，直接从哈希表中取出
        if (map.containsKey(node)) {
            return map.get(node);
        }
        Node tmp = new Node(node.val);
        map.put(node, tmp);
        for (Node neighbor : node.neighbors) {
            tmp.neighbors.add(cloneGraph(neighbor));
        }
        return tmp;
    }

    private class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

}
