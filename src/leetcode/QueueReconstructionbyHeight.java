package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 406. Queue Reconstruction by Height
 *
 * @author Monster
 * @date 2017/11/10
 */
public class QueueReconstructionbyHeight {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (people1, people2) -> {
            if (people1[0] != people2[0]) {
                return people2[0] - people1[0];
            } else {
                return people1[1] - people2[1];
            }
        });
        List<int[]> res = new LinkedList<>();
        for (int[] arr : people) {
            res.add(arr[1], arr);
        }
        return res.toArray(new int[people.length][]);
    }

}
