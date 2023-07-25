package com.fridayCoffee._2._2_dungeons;

// 전력망 네트워크가 하나의 트리 형태
public class Dungeons {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(80, dungeons)); // 3
    }
}

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        return answer;
    }
}