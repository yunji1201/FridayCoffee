package com.fridayCoffee._54_biggest;

import java.util.Arrays;

public class Biggest {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numbers = {1, 2, -3, 4, -5};
        System.out.println(solution.solution(numbers));
    }
}

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int max1 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int max2 = numbers[0] * numbers[1];
        return max1 > max2 ? max1 : max2;
    }
}

class Solution1 {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}

class Solution4 {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        if (numbers[0] * numbers[1] > numbers[numbers.length - 2] * numbers[numbers.length - 1]) {
            answer = numbers[0] * numbers[1];
        } else answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];

        return answer;
    }
}
