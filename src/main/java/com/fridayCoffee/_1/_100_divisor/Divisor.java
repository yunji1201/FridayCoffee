package com.fridayCoffee._1._100_divisor;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisor {
    public void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] arr = {5, 9, 7, 10};
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(arr, 5)); // [5, 10]
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList divisorNum = new ArrayList();

        for (int i : arr) {
            if (i % divisor == 0) {
                divisorNum.add(i);
            }
        }

        if (divisorNum.size() == 0) divisorNum.add(-1);
        int[] answer = divisorNum.stream().mapToInt(i -> (int) i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}

class Solution1 {
    public int[] divisible(int[] array, int divisor) {
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
}

class Solution2 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if (answer.length == 0) answer = new int[]{-1};
        java.util.Arrays.sort(answer);
        return answer;
    }
}

class Solution3 {
    public int[] divisible(int[] array, int divisor) {

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) {

                index++;
            }
        }
        int[] ret = new int[index];
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % divisor == 0) {
                ret[count++] = array[i];

            }

        }
        return ret;
    }
}