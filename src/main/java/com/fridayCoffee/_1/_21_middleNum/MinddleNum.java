package com.fridayCoffee._1._21_middleNum;

import java.util.Arrays;

public class MinddleNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 7, 2, 11, 10};
        System.out.println(solution.solution(numbers));
    }

}

class Solution {
    public int solution(int[] array) {
        return Arrays.stream(array).sorted().toArray()[array.length / 2];
    }
}

class Solution1 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length >> 1];
    }
}

class Solution2 {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        answer = array[array.length / 2];

        return answer;
    }
}