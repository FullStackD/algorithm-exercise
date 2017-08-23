public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        int num = 0;
        for(int i = 0; i < 32; i++) {
            if((x >> i & 1) != (y >> i & 1)){
                num++;
            }
        }
        return num;
    }

}
