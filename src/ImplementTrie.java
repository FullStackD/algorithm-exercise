/**
 * 208. Implement Trie (Prefix Tree)
 * You may assume that all inputs are consist of lowercase letters a-z.
 *
 * @author Monster
 * @date 2017/12/26
 */
public class ImplementTrie {


    class Trie {
        private TrieNode root;

        private class TrieNode {
            public boolean isWord;
            public TrieNode[] children = new TrieNode[26];

            public TrieNode() {
            }
        }

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            root = new TrieNode();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            if (word.length() == 0) {
                return;
            }
            TrieNode ws = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (ws.children[c - 'a'] == null) {
                    ws.children[c - 'a'] = new TrieNode();
                }
                ws = ws.children[c - 'a'];
            }
            ws.isWord = true;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            TrieNode ws = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (ws.children[c - 'a'] != null) {
                    ws = ws.children[c - 'a'];
                } else {
                    return false;
                }
            }
            return ws.isWord;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            TrieNode ws = root;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                if (ws.children[c - 'a'] != null) {
                    ws = ws.children[c - 'a'];
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
