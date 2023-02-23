package com.fridayCoffee._4_freeDrink;

public class test2 {

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        solution.solution(64,6);
    }
}

class Solution2 {
    public int solution(int n, int k) {
        int answer = 0;
        int freeDrink = 0;

        if (n > 0 && n / 10 != 0){
            freeDrink = n / 10;
        }

        answer = n * 12000 + k * 2000 - freeDrink * 2000;

        return answer;
    }
}


