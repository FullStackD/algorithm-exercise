package leetcode;

/**
 * 面试题 01.03. URL化
 */
public class ReplaceSpaces {

    public String replaceSpaces(String S, int length) {
        return S.substring(0, length).replace(" ", "%20");
    }

}
