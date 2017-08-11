import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        String[] tokens = {"0", "3", "/"};
        int result = evalRPN(tokens);
        System.out.println(result);
    }

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String str: tokens) {
            try{
                Integer.valueOf(str);
                stack.push(str);
            }catch(Exception e){
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                int c = 0;
                switch (str) {
                    case "+": c = a + b;break;
                    case "-": c = a - b;break;
                    case "*": c = a * b;break;
                    case "/": c = a / b;break;
                }
                stack.push(String.valueOf(c));
            }
        }
        return Integer.valueOf(stack.peek());
    }
}
