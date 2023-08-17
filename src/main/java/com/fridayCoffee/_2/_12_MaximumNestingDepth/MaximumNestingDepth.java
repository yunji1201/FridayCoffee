package com.fridayCoffee._2._12_MaximumNestingDepth;

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

        return 0;
    }
}

