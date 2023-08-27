package com.fridayCoffee._2._14_validParentheses;

import java.util.Stack;

public class ValidParentheses {
// "()()"	true
//"(())()"	true
//")()("	false
//"(()("	false

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        String s = ")()(";
        System.out.println("my answer : " + solution.solution(s));
    }
}

class Solution {
    boolean solution(String s) {
        Stack stack = new Stack();
        char[] charArr = s.toCharArray();

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

class Solution1 {
    boolean solution(String s) {
        boolean answer = true;
        char[] charArr = s.toCharArray();
        int point = 0;

        for (char c : charArr) {
            if (c == '(') {
                point++;
            } else if (c == ')') {
                point--;
            }
        }
        if (point < 0) {
            answer = false;
        }

        answer = point == 0 ? true : false;
        return answer;
    }
}