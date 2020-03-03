package luogu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class P2141 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] num = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            num[i] = cin.nextInt();
            set.add(num[i]);
        }
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (set.contains(num[i] + num[j])) {
                    res.add(num[i] + num[j]);
                }

            }
        }
        System.out.println(res.size());
    }

}
