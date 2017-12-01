import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 *
 * @author Monster
 * @date 2017/12/1
 */
public class GenerateParentheses {

    private List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generateParenthesis("", n, n);
        return res;
    }

    private void generateParenthesis(String str, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(str);
        }
        if (left > 0) {
            generateParenthesis(str + "(", left - 1, right);
        }
        if (right > 0 && left < right) {
            generateParenthesis(str + ")", left, right - 1);
        }
    }

}
