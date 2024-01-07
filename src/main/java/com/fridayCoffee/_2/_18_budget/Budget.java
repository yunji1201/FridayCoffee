package com.fridayCoffee._2._18_budget;

import java.util.Arrays;

public class Budget {

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        int[] d = {1, 4, 2, 3, 5};
        System.out.println("my answer : " + solution.solution(d, 9)); // 3
    }
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];

            if (budget < 0) {
                return answer;
            }

            answer++;
        }
        return answer;
    }
}