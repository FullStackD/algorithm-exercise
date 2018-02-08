package leetcode;

public class PoorPigs {

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;
        int num = minutesToTest / minutesToDie + 1;
        while (Math.pow(num, pigs) < buckets) {
            pigs++;
        }
        return pigs;
    }

}

