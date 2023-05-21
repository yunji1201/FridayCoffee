package com.fridayCoffee._1._16_splitArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SliceArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution.solution(numbers, 1, 3));
    }

}

class Solution1 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }
}

class Solution2 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i -num1] = numbers[i];
        }

        return answer;
    }
}

class Solution3 {
    public int[] solution(int[] numbers, int num1, int num2) {
        return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
    }
}

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for(int i = num1, j = 0; i < num2+1; i++) {
            answer[j] = numbers[i];
            j++;
        }

        return answer;
    }
}