package com.fridayCoffee._8_odd;

public class Odd {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution.solution(numbers));
    }

}

class Solution {
    public int[] solution(int[] num_list) {

        int odd = 0;
        int even = 0;

        for (int i : num_list) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int[] answer = new int[2];
        answer[0] = even;
        answer[1] = odd;

        return answer;
    }
}
