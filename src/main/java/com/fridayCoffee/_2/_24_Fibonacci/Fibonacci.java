package com.fridayCoffee._2._24_Fibonacci;

public class Fibonacci {

    public void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(3)); // 3
    }

    class Solution {
        public int solution(int n) {
            int answer = 0;

            if (n <= 1) return n;

            int prevOne = 1;
            int prevTwo = 2;

            for (int i = 3; i <= n; i++) {
                answer = prevOne + prevTwo;
                prevTwo = prevOne;
                prevOne = answer;
            }

            System.out.println(answer);
            answer = answer % 1234567;
            return answer;
        }
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12945