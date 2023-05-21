package com.fridayCoffee._1._58_twoDimensional;

import java.util.Arrays;

public class AToB {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(solution.solution(numbers, 2));
    }
}

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int count = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[count++];
            }
        }
        return answer;
    }
}

class Solution1 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};

        int length = num_list.length;

        answer = new int[length / n][n];

        for (int i = 0; i < length; i++) {
            answer[i / n][i % n] = num_list[i];
        }

        return answer;
    }
}

class Solution2 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        int chk = 0;
        for (int i = 0; i <= num_list.length - 1; i += n) {
            int[] a = Arrays.copyOfRange(num_list, i, i + n); // copyOfRange - 특정범위 배열 복사
            answer[chk] = a;
            chk++;
        }
        return answer;
    }
}