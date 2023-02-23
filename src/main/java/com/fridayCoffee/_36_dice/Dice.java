package com.fridayCoffee._36_dice;

public class Dice {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numbers = {10, 8, 6};
        System.out.println(solution.solution(numbers, 3));
    }
}

class Solution {
    public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}