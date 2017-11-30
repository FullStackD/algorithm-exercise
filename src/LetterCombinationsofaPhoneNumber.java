import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 *
 * @author Monster
 * @date 2017/11/30
 */
public class LetterCombinationsofaPhoneNumber {


    public List<String> letterCombinations(String digits) {
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (digits == null || digits.length() == 0 || digits.contains("0") || digits.contains("1")) {
            return new ArrayList<>();
        }
        LinkedList<String> ans = new LinkedList<>();
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length() == i) {
                String base = ans.remove();
                for (char s : mapping[x].toCharArray()) {
                    ans.add(base + s);
                }
            }
        }
        return ans;
    }

}
