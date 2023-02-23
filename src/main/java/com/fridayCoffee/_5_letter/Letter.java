package com.fridayCoffee._5_letter;

public class Letter {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("I love you~"));
    }

}

class Solution {
    public int solution(String message) {
        int answer = message.length() * 2;

        return answer;
    }
}
