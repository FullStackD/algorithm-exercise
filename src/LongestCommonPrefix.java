public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            str = longestCommonPrefix(str, strs[i]);
        }
        return str;
    }

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
