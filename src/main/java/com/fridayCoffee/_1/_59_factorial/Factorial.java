package com.fridayCoffee._1._59_factorial;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(solution.solution(7));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 10;
        int sum = 1;
        for (int i = 1; i < 11; i++) {
            if (sum * i > n) {
                return i - 1;
            }
            sum = sum * i;
        }
        return answer;
    }
}

class Solution1 {
    public int solution(int n) {
        int fac = 1;
        int i = 0;

        while (true) {
            if (fac <= n) {
                fac *= i + 1;
                i++;
            } else break;
        }

        return i - 1;
    }
}