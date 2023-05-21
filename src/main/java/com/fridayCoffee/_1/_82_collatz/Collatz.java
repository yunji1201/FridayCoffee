package com.fridayCoffee._1._82_collatz;

public class Collatz {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(16)); // 4
        System.out.println("======================================");
    }
}

class Solution {
    public int solution(long num) {
        int answer = 0;
        while (num != 1) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            answer++;
        }

        if (answer > 500) return -1;
        return answer;
    }
}

class Solution1 {
    public int solution(int num) {
        long n = (long) num;
        for (int i = 0; i < 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return -1;
    }
}