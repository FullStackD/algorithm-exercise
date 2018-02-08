package leetcode;

public class Base7 {

    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        if (num == 0) {
            return "0";
        }
        if (num < 0) {
            num = -num;
            base7(sb, num);
            sb.insert(0, "-");
        } else {
            base7(sb, num);
        }
        return sb.toString();
    }

    private void base7(StringBuilder sb, int num) {
        while (num != 0) {
            int mod = Math.floorMod(num, 7);
            sb.insert(0, mod);
            num = num / 7;
        }
    }

}
