public class ConstructtheRectangle {


    public int[] constructRectangle(int area) {
        int a = (int) Math.floor(Math.sqrt(area));
        int L = a;
        int W = a;
        while (L * W != area) {
            if (L * W > area) {
                W--;
            }
            if (L * W < area) {
                L++;
            }
        }
        int[] arr = new int[]{L, W};
        System.out.println(L + " " + W);
        return arr;
    }

}
