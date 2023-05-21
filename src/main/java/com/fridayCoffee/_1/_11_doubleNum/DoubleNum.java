package com.fridayCoffee._1._11_doubleNum;

public class DoubleNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        System.out.println(solution.solution(numbers));
    }

}

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}