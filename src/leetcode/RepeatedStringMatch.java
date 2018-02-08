package leetcode;

/**
 * 686. Repeated String Match
 *
 * @author Monster
 * @date 2017/11/2
 */
public class RepeatedStringMatch {

    public int repeatedStringMatch(String A, String B) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }
        if (sb.toString().contains(B)) {
            return count;
        }
        if (sb.append(A).toString().contains(B)) {
            return ++count;
        }
        return -1;
    }

}
