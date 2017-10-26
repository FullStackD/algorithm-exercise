/**
 * 69. Sqrt(x)
 *
 * @author Monster
 * @date 10/26/2017
 */
public class Sqrt {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int x1 = x / 2;
        int x2 = (x1 + x / x1) / 2;
        while (x1 - x2 > 0.001) {
            x1 = x2;
            x2 = (x1 + x / x1) / 2;
        }
        return x1;
    }

}
