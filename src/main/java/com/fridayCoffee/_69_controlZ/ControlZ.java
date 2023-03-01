package com.fridayCoffee._69_controlZ;

public class ControlZ {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        String[] numbers = {"10 Z 20 Z 1"};
        System.out.println(solution.solution("10 Z 20 Z 1"));
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            answer = !arr[i].equals("Z") ? (answer += Integer.parseInt(arr[i])) : (answer -= Integer.parseInt(arr[i - 1]));
        }
        return answer;
    }
}