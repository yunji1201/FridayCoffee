package com.fridayCoffee._1._10_pizza1;

public class Pizza {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {1, 1, 2, 3, 4, 5};
        System.out.println(solution.solution(15));
    }

}

class Solution {
    public int solution(int n) {
        int pizza = 7;
        return (n <= pizza) ? 1 : ((n % 7 < 1) ? n / 7 : n / 7 + 1);
    }
}