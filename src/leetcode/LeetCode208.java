package leetcode;

/**
 * 208. 实现 Trie (前缀树)
 */
public class LeetCode208 {

    class Trie {

        private TreeNode root;

        private class TreeNode {
            private boolean isEnd = false;
            private TreeNode[] children = new TreeNode[26];

            public TreeNode() {

            }
        }

        public Trie() {
            root = new TreeNode();
        }

        public void insert(String word) {
            TreeNode temp = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (temp.children[c - 'a'] == null) {
                    temp.children[c - 'a'] = new TreeNode();
                }
                temp = temp.children[c - 'a'];
            }
            temp.isEnd = true;
        }

        public boolean search(String word) {
            TreeNode temp = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (temp.children[c - 'a'] == null) {
                    return false;
                }
                temp = temp.children[c - 'a'];
            }
            return temp.isEnd;
        }

        public boolean startsWith(String prefix) {
            TreeNode temp = root;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                if (temp.children[c - 'a'] == null) {
                    return false;
                }
                temp = temp.children[c - 'a'];
            }
            return true;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */


}
