package com.fridayCoffee._1._71_stringCalc;

public class StringCalc {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        String[] numbers = {"10 Z 20 Z 1"};
        System.out.println(solution.solution("3 + 4"));
    }
}

class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i += 2) {
            int nextNum = Integer.parseInt(arr[i + 1]);
            if (arr[i].equals("+")) {
                answer += nextNum;
            } else {
                answer -= nextNum;
            }
        }
        return answer;
    }
}