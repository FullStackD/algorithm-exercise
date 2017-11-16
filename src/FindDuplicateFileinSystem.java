import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 609. Find Duplicate File in System
 *
 * @author Monster
 * @date 2017/11/16
 */
public class FindDuplicateFileinSystem {

    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : paths) {
            String[] arr = str.split(" ");
            for (int i = 1; i < arr.length; i++) {
                String filename = arr[i].split("\\(")[0];
                String content = arr[i].split("\\(")[1].split("\\)")[0];
                if (map.get(content) == null) {
                    map.put(content, new ArrayList<>());
                }
                map.get(content).add(arr[0] + "/" + filename);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> list : map.values()) {
            if (list.size() > 1) {
                res.add(list);
            }
        }
        return res;
    }

}
