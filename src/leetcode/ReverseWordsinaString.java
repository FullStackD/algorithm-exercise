package leetcode;


/**
 * 151. 翻转字符串里的单词
 */
public class ReverseWordsinaString {

    public String reverseWords(String s) {
        String[] arr = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]).append(' ');
        }
        return sb.substring(0, sb.length() - 1);
    }


}
