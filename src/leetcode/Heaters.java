package leetcode;

import java.util.Arrays;

/**
 * 475. Heaters
 *
 * @author Monster
 * @date 2017/10/30
 */
public class Heaters {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int i = 0, radius = 0;
        for (int house : houses) {
            while (i < heaters.length - 1 && heaters[i] + heaters[i + 1] <= house * 2) {
                i++;
            }
            radius = Math.max(radius, Math.abs(heaters[i] - house));
        }

        return radius;
    }

}
