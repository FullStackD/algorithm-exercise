package leetcode;


import leetcode.common.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * 138. 随机链表的复制
 */
public class LeetCode138 {

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node p = head;
        while (p != null) {
            Node newNode = new Node(p.val);
            map.put(p, newNode);
            p = p.next;
        }
        p = head;
        while (p != null) {
            Node newNode = map.get(p);
            if (p.next != null) {
                newNode.next = map.get(p.next);
            }
            if (p.random != null) {
                newNode.random = map.get(p.random);
            }
            p = p.next;
        }
        return map.get(head);
    }

}
