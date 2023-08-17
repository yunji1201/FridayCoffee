package com.fridayCoffee._2._12_MaximumNestingDepth;

import java.util.Stack;

public class MaximumNestingDepth {
//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
//    Input: s = "(1)+((2))+(((3)))"
//    Output: 3
//    Input: s = "(1+(2*3)+((8)/4))+1"
//    Output: 3

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println("my answer : " + solution.maxDepth(s));
    }
}

class Solution {
    public int maxDepth(String s) {
//        Stack stack = new Stack();
        int max = 0; // 최대
        int now = 0; // 현재
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (c == '(') {
                now++;
//                stack.push(c);
                max = Math.max(max, now);

            } else if (c == ')') {
                now--;
//                stack.pop();
            }
        }
        return max;
    }
}

