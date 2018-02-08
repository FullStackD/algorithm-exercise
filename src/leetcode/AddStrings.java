package leetcode;

/**
 * Created by Admin on 2017/10/7 0007.
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int tmp = 0;
        while (i >= 0 && j >= 0) {
            int sum = Character.getNumericValue(num1.charAt(i--)) + Character.getNumericValue(num2.charAt(j--)) + tmp;
            tmp = sum / 10;
            sb.insert(0, sum % 10);
        }
        while (i >= 0) {
            int sum = Character.getNumericValue(num1.charAt(i--)) + tmp;
            tmp = sum / 10;
            sb.insert(0, sum % 10);
        }
        while (j >= 0) {
            int sum = Character.getNumericValue(num2.charAt(j--)) + tmp;
            tmp = sum / 10;
            sb.insert(0, sum % 10);
        }
        if (tmp != 0) {
            sb.insert(0, tmp);
        }
        return sb.toString();
    }

}
