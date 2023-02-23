package com.fridayCoffee._6_evaluation;

public class Eval {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution.solution(numbers));
    }

}

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int length = numbers.length;
        int sum = 0;
        for (int i =0; i<length; i++){
            sum += numbers[i];
        }
        answer = (double)sum / length;
        return answer;
    }
}
