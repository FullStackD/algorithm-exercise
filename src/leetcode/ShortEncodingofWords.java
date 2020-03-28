package leetcode;

import java.util.Arrays;

/**
 * 820. 单词的压缩编码
 */
public class ShortEncodingofWords {

    //暴力解法
    public int minimumLengthEncoding(String[] words) {
        String[] arr = new String[words.length];
        int num = 0;
        arr[num++] = words[0];
        for (int i = 1; i < words.length; i++) {
            boolean flag = true;
            //查看索引列表中是否有words[i]的后缀，有则替换
            for (int j = 0; j < num; j++) {
                String str = arr[j];
                if (str.length() < words[i].length() && isSuffix(words[i], str)) {
                    arr[j] = words[i];
                    flag = false;
                    break;
                }
                if (isSuffix(str, words[i])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[num++] = words[i];
            }
        }
        int result = 0;
        for (int i = 0; i < num; i++) {
            result += arr[i].length();
        }
        return result + num;
    }

    //判断word是否为target的后缀
    private boolean isSuffix(String target, String word) {
        int j = target.length() - 1;
        for (int i = word.length() - 1; i >= 0; i--) {
            if (word.charAt(i) == target.charAt(j)) {
                j--;
            } else {
                return false;
            }
        }
        return true;
    }


    class Trie {

        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        //若插入新单词，返回true
        public boolean insert(String word) {
            TrieNode cur = root;
            boolean isNew = false;
            //逆序插入单词
            for (int i = word.length() - 1; i >= 0; i--) {
                int c = word.charAt(i) - 'a';
                if (cur.children[c] == null) {
                    isNew = true;
                    cur.children[c] = new TrieNode();
                }
                cur = cur.children[c];
            }
            return isNew;
        }
    }

    class TrieNode {
        char val;
        TrieNode[] children = new TrieNode[26];

        public TrieNode() {
        }
    }

    //使用字典树的解法
    public int minimumLengthEncoding2(String[] words) {
        int len = 0;
        Trie trie = new Trie();
        //根据单词长短排序
        Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
        for (String word : words) {
            if (trie.insert(word)) {
                len += word.length() + 1;
            }
        }
        return len;
    }
}
