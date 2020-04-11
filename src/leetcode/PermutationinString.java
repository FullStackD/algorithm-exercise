package leetcode;

/**
 * 567. 字符串的排列(#)
 * 思路：1.通过map保存排列的所有元素，即可检测是否为重排列
 * 2.s2维护一个滑动窗口来检测
 * <p>
 * 空间复杂度O(n)  时间复杂度O(l1+26*(l2-l1))
 */
public class PermutationinString {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1map = new int[26];
        int[] s2map = new int[26];

        //为s2中的第一个窗口创建一次哈希表
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1map, s2map)) {
                return true;
            }
            s2map[s2.charAt(i + s1.length()) - 'a']++;
            s2map[s2.charAt(i) - 'a']--;
        }
        //最后一组位置检测（放在for循环会越界）
        return matches(s1map, s2map);
    }

    //检查两个map是否相同
    private boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i]) {
                return false;
            }
        }
        return true;
    }

}
