package com.fridayCoffee._2._8_snaNum;

public class SnaNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(13, 17)); // 43
    }
}

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
            count = 0;
        }
        return answer;
    }
}

class Solution1 {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}

class Solution2 {
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += i * ((countDenominators(i) % 2 == 0) ? 1 : -1);
        }
        return sum;
    }

    private int countDenominators(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        return count;
    }
}