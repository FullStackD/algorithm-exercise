import java.util.*;

public class MinimumIndexSumofTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            Integer tmp = map.get(list2[i]);
            if (tmp != null && tmp + i <= minSum) {
                if (tmp + i < minSum) {
                    res.clear();
                    minSum = tmp + i;
                }
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }


}
