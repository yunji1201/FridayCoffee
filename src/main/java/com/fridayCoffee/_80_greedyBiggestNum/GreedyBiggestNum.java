package com.fridayCoffee._80_greedyBiggestNum;

import java.util.Arrays;

public class GreedyBiggestNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution("4177252841", 4)); // 3234
        System.out.println("======================================");
    }
}

class Solution {
    public String solution(String number, int k) {
        String answer = "";

        String[] strList = number.split("");
        Arrays.sort(strList);
        for (int i = number.length()-1; i > k-1; i--) {
            answer += strList[i];
        }
        return answer;
    }
}