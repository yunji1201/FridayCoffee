package com.fridayCoffee._71_stringCalc;

public class StringCalc {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        String[] numbers = {"10 Z 20 Z 1"};
        System.out.println(solution.solution("3 + 4"));
    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String pattern = "^[0-9]*$";
        String[] arr = my_string.split("");
        for(String s : arr){
            s.matches(pattern)?Integer.parseInt(s):(s=="+")?answer+=
        }

        return answer;
    }
}