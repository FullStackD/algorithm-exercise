/**
 * 605. Can Place Flowers
 *
 * @author Monster
 * @date 2017/11/2
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1) {
            if (n == 1 && flowerbed[0] == 0) {
                return true;
            }
            return false;
        }
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
            if (n == 0) {
                return true;
            }
        }
        int i = 2;
        for (; i < flowerbed.length - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        if (i < flowerbed.length && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
            n--;
        }
        return n == 0;
    }


    public static void main(String[] args) {
        new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1);
    }
}
