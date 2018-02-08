package leetcode;

/**
 * 67. Add Binary
 *
 * @author Monster
 * @date 2017/10/24
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int tmp = 0;
        while (i >= 0 && j >= 0) {
            int sum = tmp + a.charAt(i--) - '0' + b.charAt(j--) - '0';
            sb.insert(0, sum % 2);
            tmp = sum / 2;
        }
        while (i >= 0) {
            int sum = tmp + a.charAt(i--) - '0';
            sb.insert(0, sum % 2);
            tmp = sum / 2;
        }
        while (j >= 0) {
            int sum = tmp + b.charAt(j--) - '0';
            sb.insert(0, sum % 2);
            tmp = sum / 2;
        }
        if (tmp != 0) {
            sb.insert(0, tmp);
        }
        return sb.toString();
    }

}
