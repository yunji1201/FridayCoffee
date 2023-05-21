package com.fridayCoffee._1._009_height;

public class Height {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {149, 180, 192, 170};
        System.out.println(solution.solution(numbers, 167));
    }

}

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int i : array) {
            if (height < i) {
                answer++;
            }
        }
        return answer;
    }
}