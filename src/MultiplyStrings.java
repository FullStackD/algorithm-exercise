/**
 * 43. Multiply Strings
 *
 * @author Monster
 * @date 2018/1/4
 */
public class MultiplyStrings {


    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] pos = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;//高位
                pos[p2] = sum % 10;//低位
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : pos) {
            //如果首位不是0
            if (!(sb.length() == 0 && i == 0)) {
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

}
