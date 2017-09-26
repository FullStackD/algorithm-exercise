import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null)
                map.put(s.charAt(i), 1);
            else
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        int length = 0;
        boolean flag = false;//是否有奇数量字母
        if (map.size() == 1) {
            for (Integer i : map.values()) {
                length = i;
            }
        } else {
            for (Integer i : map.values()) {
                if (i % 2 == 0) {
                    length += i;
                } else {
                    flag = true;
                    length += i - 1;
                }
            }
            if (flag)
                length++;
        }
        return length;
    }

}
