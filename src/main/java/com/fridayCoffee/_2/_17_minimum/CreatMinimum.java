package com.fridayCoffee._2._17_minimum;

import java.util.Arrays;

public class CreatMinimum {

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        System.out.println("my answer : " + solution.solution(A, B)); // [4, 3, 1, 1, 0]
    }
}

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        reverseArray(B);

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }

    private void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}