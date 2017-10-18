/**
 * 507. Perfect Number
 *
 * @author Monster
 * @date 10/18/2017
 */
public class PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        } else {
            int sum = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    sum += i;
                    if (i != num % i) {
                        sum += num % i;
                    }
                }
            }
            sum++;
            return sum == num;
        }
    }

}
