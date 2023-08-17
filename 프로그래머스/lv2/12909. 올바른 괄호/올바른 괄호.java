import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack stack = new Stack();
        char[] charArr = s.toCharArray();

        if (s.charAt(0) == ')') {
            return false;
        }
        
        for (char c : charArr) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}