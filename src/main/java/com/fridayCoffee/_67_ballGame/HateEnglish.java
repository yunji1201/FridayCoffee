package com.fridayCoffee._67_ballGame;

public class HateEnglish {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(solution.solution(numbers, 5));
    }
}

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
        while(count == k){
            System.out.println("");
            count ++;
        }
        return answer;
    }
}