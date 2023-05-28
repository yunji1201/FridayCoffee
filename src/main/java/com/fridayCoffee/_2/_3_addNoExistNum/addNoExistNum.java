package com.fridayCoffee._2._3_addNoExistNum;

import java.util.Arrays;
import java.util.stream.IntStream;

public class addNoExistNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(numbers)); // 14
    }
}

class Solution {
    public int solution(int[] numbers) {
        boolean[] found = new boolean[10];
        Arrays.stream(numbers).forEach(n -> found[n] = true);
        return (int) IntStream.range(0, found.length).filter(i -> !found[i]).sum();
    }
}

// ------------------------------< 다른사람 풀이 >----------------------

class Solution1 {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}

class Solution2 {
    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }
}

class Solution3 {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] sum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (sum[i] == numbers[j]) {
                    sum[i] -= numbers[j];
                }
            }
            answer += sum[i];
        }
        return answer;
    }
}

class Solution4 {
    public int solution(int[] numbers) {
        var map = new int[10];

        for (int v : numbers) map[v] = 1;

        int sum = 0;
        for (int v = 0; v < map.length; v++) sum += (map[v] == 0) ? v : 0;

        return sum;
    }
}