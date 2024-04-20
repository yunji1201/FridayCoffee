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


// https://school.programmers.co.kr/learn/courses/30/lessons/12924