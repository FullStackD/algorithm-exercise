package leetcode;

public class LengthofLastWord {

    public int lengthOfLastWord(String s) {
        int tail = s.length() - 1;
        int length = 0;
        while (tail >= 0 && s.charAt(tail) == ' ') {
            tail--;
        }
        while (tail > 0 && s.charAt(tail) != ' ') {
            length++;
            tail--;
        }
        return length;
    }

}
