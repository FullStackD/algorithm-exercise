package leetcode;

/**
 * 537. Complex Number Multiplication
 *
 * @author Monster
 * @date 2017/11/9
 */
public class ComplexNumberMultiplication {

    public String complexNumberMultiply(String a, String b) {
        String[] arrA = a.split("\\+");
        String[] arrB = b.split("\\+");
        StringBuilder res = new StringBuilder();
        int y = 0;
        int tmp = Integer.valueOf(arrA[1].split("i")[0]) * Integer.valueOf(arrB[1].split("i")[0]);
        int x = Integer.valueOf(arrA[0]) * Integer.valueOf(arrB[0]) - tmp;
        y += Integer.valueOf(arrA[1].split("i")[0]) * Integer.valueOf(arrB[0]) + Integer.valueOf(arrA[0]) *
                Integer.valueOf(arrB[1].split("i")[0]);
        res.append(x).append('+').append(y).append('i');
        return res.toString();
    }

}
