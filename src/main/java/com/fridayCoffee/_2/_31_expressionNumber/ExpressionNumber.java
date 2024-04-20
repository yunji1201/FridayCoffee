package com.fridayCoffee._2._31_expressionNumber;

import java.util.HashMap;
import java.util.Map;

public class ExpressionNumber {

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(15)); // 4
    }
}

// 내 풀이
class Solution {
    public int solution(int n) {
        int count = 0;
        int sum = 0;

        for (int num = 1; num <= n; num++) {
            sum = 0;
            for (int currentNum = num; currentNum <= n; currentNum++) {
                sum += currentNum;
                if (sum == n) {
                    count++;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        return count;
    }
}

// 다른 사람들 풀이
class Solution1 {
    public int solution(int num) {
        int answer = 0;
        for (int i = 1; i <= num; i += 2)
            if (num % i == 0)
                answer++;

        return answer;
    }
}
// 문제 해석
    // 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리
    // 홀수의 약수 개수르 세는 방식


// https://school.programmers.co.kr/learn/courses/30/lessons/12924