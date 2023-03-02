package leetcode;

/**
 * 211. 添加与搜索单词 - 数据结构设计
 */
public class LeetCode211 {

    class WordDictionary {

        public WordDictionary() {
            root = new TreeNode();
        }

        private final TreeNode root;

        private class TreeNode {
            private boolean isWord;
            private final TreeNode[] children = new TreeNode[26];
        }

        public void addWord(String word) {
            TreeNode curr = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (curr.children[c - 'a'] == null) {
                    curr.children[c - 'a'] = new TreeNode();
                }
                curr = curr.children[c - 'a'];
            }
            curr.isWord = true;
        }

        public boolean search(String word) {
            return find(root, word, 0);
        }

        /**
         * @param root
         * @param word
         * @param index 开始查找索引
         * @return
         */
        private boolean find(TreeNode root, String word, int index) {
            for (int i = index; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c == '.') {
                    for (int j = 0; j < 26; j++) {
                        if (root.children[j] != null && find(root.children[j], word, i + 1)) {
                            return true;
                        }
                    }
                    return false;
                }
                if (root.children[c - 'a'] == null) {
                    return false;
                }
                root = root.children[c - 'a'];
            }
            return root.isWord;
        }
    }

    /**
     * Your WordDictionary object will be instantiated and called as such:
     * WordDictionary obj = new WordDictionary();
     * obj.addWord(word);
     * boolean param_2 = obj.search(word);
     */
}
