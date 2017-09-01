public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tmp = 0;
        for (int i : nums) {
            if (i == 0) {
                max = max > tmp ? max : tmp;
                tmp = 0;
            }
            if (i == 1) {
                tmp++;
            }
        }
        return max > tmp ? max : tmp;
    }


}
