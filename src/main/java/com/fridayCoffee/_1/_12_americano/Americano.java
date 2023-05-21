package com.fridayCoffee._1._12_americano;

public class Americano {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        System.out.println(solution.solution(15000));
    }

}

class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int americano = 5500;
        int cup = 0;
        int remind = 0;

        for (int i = 0; i < 1000000; i++) {
            if (americano * cup <= money) {
                cup++;
            }
        }

        remind = money - (americano * (cup - 1));
        answer[0] = cup - 1;
        answer[1] = remind;

        return answer;
    }
}