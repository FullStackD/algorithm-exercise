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
public class CloneGraph {

    private Map<Integer, UndirectedGraphNode> map = new HashMap<>();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return clone(node);
    }

    private UndirectedGraphNode clone(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node.label)) {
            return map.get(node.label);
        }
        UndirectedGraphNode tmp = new UndirectedGraphNode(node.label);
        map.put(tmp.label, tmp);
        for (UndirectedGraphNode neighbor : node.neighbors) {
            tmp.neighbors.add(clone(neighbor));
        }
        return tmp;
    }

    private class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;

        UndirectedGraphNode(int x) {
            label = x;
            neighbors = new ArrayList<>();
        }
    }


}
