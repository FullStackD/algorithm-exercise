public class MissingNumber {

    public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }

}
