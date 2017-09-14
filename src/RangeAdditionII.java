public class RangeAdditionII {

    public int maxCount(int m, int n, int[][] ops) {
        int row = m;
        int col = n;
        for (int[] arr : ops) {
            if (arr[0] < row) {
                row = arr[0];
            }
            if (arr[1] < col) {
                col = arr[1];
            }
        }
        return row * col;
    }

}
