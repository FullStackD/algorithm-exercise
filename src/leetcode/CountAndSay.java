package leetcode;

public class CountAndSay {

    public String countAndSay(int n) {
        String str = "1";
        for (int i = 1; i < n; i++) {
            str = getCountSay(str);
        }
        return str;
    }

    private String getCountSay(String str) {
        if (str.equals("1")) {
            return "11";
        }
        StringBuilder sb = new StringBuilder();
        char tmp = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == tmp) {
                count++;
            } else {
                sb.append(count).append(tmp);
                tmp = str.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(tmp);
        return sb.toString();
    }

}
