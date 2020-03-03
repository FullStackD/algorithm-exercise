package luogu;

import java.util.Scanner;
import java.util.Stack;

public class P1427 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (a != 0) {
            stack.push(a);
            a = cin.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            sb.append(" ");
        }
        System.out.println(sb.toString());

    }

}
