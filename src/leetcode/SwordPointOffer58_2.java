package leetcode;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 */
public class SwordPointOffer58_2 {

    public String reverseLeftWords(String s, int n) {
        s = reverse(s, 0, n - 1);
        s = reverse(s, n, s.length() - 1);
        s = reverse(s, 0, s.length() - 1);
        return s;
    }

    private String reverse(String s, int start, int end) {
        char[] chars = s.toCharArray();
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

}
