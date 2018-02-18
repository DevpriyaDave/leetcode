import java.util.Stack;

/**
 * Created by devpriyadave on 2/18/18.
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

 Example ({{[]}})
 (({))

 Logic:
 Use stacks

 */
public class ValidParanthese {

    public boolean myisValidUsingStacks(String s) {
        if(s == "" || s.length()%2 < 0) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i< s.length(); i++) {
            if(stack.isEmpty() || !isPair(stack.peek(),s.charAt(i)))
                stack.push(s.charAt(i));
            else
                stack.pop();
        }

        return stack.isEmpty();

    }
    private boolean isPair(Character peek, Character c) {

        switch (peek) {
            case '(':
                if(c!=')')
                    return false;
                break;
            case '{':
                if(c!='}')
                    return false;
                break;
            case '[':
                if(c!=']')
                    return false;
                break;
            default:
                return false;

        }
        return true;
    }

    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int head = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack[head++] = c;
            } else if (c == '[') {
                stack[head++] = c;
            } else if (c == '{') {
                stack[head++] = c;
            } else if (c == ')') {
                if (head == 0) return false;
                if (stack[--head] != '(') return false;
            } else if (c == ']') {
                if (head == 0) return false;
                if (stack[--head] != '[') return false;
            } else if (c == '}') {
                if (head == 0) return false;
                if (stack[--head] != '{') return false;
            }
        }
        return head == 0;
    }

    public static void main(String [] args) {
        ValidParanthese validParanthese = new ValidParanthese();
        System.out.println(validParanthese.myisValidUsingStacks("(){}"));
    }
}
