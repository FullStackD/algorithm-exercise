package leetcode;

public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        String s1 = s + s;
        s1 = s1.substring(1, s1.length() - 1);
        return s1.contains(s);
    }

}
