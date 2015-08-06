import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;
        else {
            char[] c = s.toCharArray();
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '{' || c[i] == '[' || c[i] == '(') {
                    stack.push(c[i]);
                } else{
                    switch (c[i]) {
                    case '}':
                        if (!stack.empty() && stack.peek() == '{')
                            stack.pop();
                        else
                            return false;
                        break;
                    case ')':
                        if (!stack.empty() && stack.peek() == '(')
                            stack.pop();
                        else
                            return false;
                        break;
                    case ']':
                        if (!stack.empty() && stack.peek() == '[')
                            stack.pop();
                        else
                            return false;
                        break;
                    default:
                        break;
                    }
                }
            }
            return stack.empty();
        }
    }
}