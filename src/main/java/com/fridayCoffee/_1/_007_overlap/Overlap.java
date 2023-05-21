package com.fridayCoffee._1._007_overlap;

import java.util.Objects;

public class Overlap {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 1, 2, 3, 4, 5};
        System.out.println(solution.solution(numbers, 1));
    }

}

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (Objects.equals(n, i)) {
                answer++;
            }
        }
        return answer;
    }
}
