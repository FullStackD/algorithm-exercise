package leetcode;

/**
 * 14. 最长公共前缀
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //不断更新当前的最长公共前缀
            str = longestCommonPrefix(str, strs[i]);
        }
        return str;
    }

    //求a和b的最长公共前缀
    private String longestCommonPrefix(String a, String b) {
        int i = 0, j = 0;
        while (j < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(i)) {
                i++;
            }
            j++;
        }
        return a.substring(0, i);
    }

}
