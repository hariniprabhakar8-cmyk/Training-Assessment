package Module11;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "{[()]}";
        Stack<Character> stack = new Stack<>();
        boolean flag = true;

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else {
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag && stack.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}