package com.fridayCoffee._2._27_rectangle;

public class Rectangle {

    public void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(sizes)); // 4000
    }

    // 내 풀이 : 중점은 우선 모두 max, min 순서 정하는 것
    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;

            int maxWidth = 0;
            int maxHeight = 0;

            for (int[] size : sizes) {
                int width = Math.max(size[0], size[1]);
                int height = Math.min(size[0], size[1]);

                maxWidth = Math.max(maxWidth, width);
                maxHeight = Math.max(maxHeight, height);
            }

            answer = maxWidth * maxHeight;
            return answer;
        }
    }
}