package com.fridayCoffee._2._3_divisorNum;

// 전력망 네트워크가 하나의 트리 형태
public class DivisorNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(3, 5)); // 43
    }
}

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;

        for (int i = left; i < right + 1; i++) {
            int j = 1;

            while (j <= i) {

                if (i % j == 0) {
                    count++;
                }
                j++;
            }
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}