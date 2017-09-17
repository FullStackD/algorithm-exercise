/**
 * Created by Admin on 2017/9/17 0017.
 */
public class TwoSumII_Inputarrayissorted {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, n = numbers.length - 1;
        while (i < n) {
            if (numbers[i] + numbers[n] > target) {
                n--;
            } else if (numbers[i] + numbers[n] < target) {
                i++;
            } else {
                return new int[]{i + 1, n + 1};
            }
        }
        return new int[]{};
    }

}
