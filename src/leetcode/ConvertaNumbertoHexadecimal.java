package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ConvertaNumbertoHexadecimal {

    private Map<Integer, String> map = new HashMap<Integer, String>() {
        {
            put(10, "a");
            put(11, "b");
            put(12, "c");
            put(13, "d");
            put(14, "e");
            put(15, "f");
        }
    };

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int tmp = num & 15;
            sb.insert(0, tmp >= 10 ? map.get(tmp) : tmp);
            num = num >>> 4;
        }
        return sb.toString();
    }

}
