public class ImageSmoother {

    public int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int sum = M[i][j];//数字和
                int count = 1;//数字数量
                if (i - 1 >= 0) {//上面
                    sum += M[i - 1][j];
                    count++;
                    if (j - 1 >= 0) {//左上
                        sum += M[i - 1][j - 1];
                        count++;
                    }
                    if (j + 1 < M[0].length) {//右上
                        sum += M[i - 1][j + 1];
                        count++;
                    }
                }
                if (j + 1 < M[0].length) {//右边
                    sum += M[i][j + 1];
                    count++;
                }
                if (j - 1 >= 0) {//左边
                    sum += M[i][j - 1];
                    count++;
                    if (i + 1 < M.length) {//左下
                        sum += M[i + 1][j - 1];
                        count++;
                    }
                }
                if (i + 1 < M.length) {//下面
                    sum += M[i + 1][j];
                    count++;
                    if (j + 1 < M[0].length) {//右下
                        sum += M[i + 1][j + 1];
                        count++;
                    }
                }
                res[i][j] = (int) Math.floor(sum / count);
            }
        }
        return res;
    }

}
