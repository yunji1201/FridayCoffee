package com.fridayCoffee._1._25_flipString2;

public class FlipString2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {0, 0, 1, 5, 6, 321, 123, 31, 12};
        System.out.println(solution.solution(numbers));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0 ; i< num_list.length; i++){
            for(int j = num_list.length; j > 0; j--){
                answer[j] = num_list[i];
            }
        }
        return answer;
    }
}