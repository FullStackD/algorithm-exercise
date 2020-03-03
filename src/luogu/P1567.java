package luogu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P1567 {

    /**
     * 1. 使用数组存储->MLE
     * 2. 使用2个变量->MLE
     * 3. 查询题解及Blog，发现应该用流->AC
     */
    public static void main(String[] args) throws IOException {
        //使用StreamTokenizer同样可以高效读取
        //StreamTokenizer sc = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        //sc.nextToken();//nextToken方法读取下一个Token.
        //int n = (int) sc.nval;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();//读入N，并不使用，下面使用temp.length代替
        String[] temp = reader.readLine().split(" ");
        int maxDay = 0;
        int t = 1;
        for (int i = 1; i < temp.length; i++) {
            //应使用parseInt而不是valueOf，避免比较时自动拆箱
            if (Integer.parseInt(temp[i]) > Integer.parseInt(temp[i - 1])) {
                t++;
            } else {
                if (t > maxDay) {
                    maxDay = t;
                }
                t = 1;
            }
        }
        System.out.println(maxDay);
    }

}
