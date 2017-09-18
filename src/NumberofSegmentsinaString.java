public class NumberofSegmentsinaString {

    public int countSegments(String s) {
        if (s == null || s.trim().equals("")) {
            return 0;
        }
        s = s.trim();
        int num = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                num++;
            }
        }
        return num;
    }

}
