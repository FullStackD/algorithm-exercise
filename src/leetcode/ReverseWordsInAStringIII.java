package leetcode;

public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strArr) {
            stringBuilder.append(reverseStr(str) + " ");
        }
        return stringBuilder.toString().trim();
    }

    private String reverseStr(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i * 2 < chars.length; i++) {
            char tmp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = tmp;
        }
        return new String(chars);
    }

}
