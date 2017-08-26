import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public static int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int i : candies) {
            set.add(i);
        }
        return candies.length / 2 > set.size() ? set.size() : candies.length / 2;
    }

}
