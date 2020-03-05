package leetcode;

/**
 * 1103. Distribute Candies to People
 */
public class DistributeCandiestoPeople {

    public int[] distributeCandies(int candies, int num_people) {
        int i = 1;//当前分配糖果数量
        int j = 0;//当前分配人
        int[] res = new int[num_people];
        while (candies > 0) {
            if (j >= num_people) {
                j = 0;
            }
            if (candies > i) {
                res[j] += i;
            } else {
                res[j] += candies;
                break;
            }
            candies -= i;
            j++;
            i++;
        }
        return res;
    }

}
