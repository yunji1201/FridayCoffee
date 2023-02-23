package com.fridayCoffee._44_countK;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountK {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution.solution(1, 13, 1));
    }
}

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String numStr = "";
        for (int n = i; n < j + 1; n++) {
            numStr += String.valueOf(n);
        }
        return (int) Arrays.stream(numStr.split("")).filter(e -> Integer.parseInt(e) == k).count();
    }
}

class Solution1 {
    public int solution(int i, int j, int k) {
        String str = "";
        for (int a = i; a <= j; a++) {
            str += a + "";
        }

        return str.length() - str.replace(k + "", "").length();
    }
}

class Solution2 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++) {
            int tmp = num;
            while (tmp != 0) {
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }
        }
        return answer;
    }
}

class Solution3 {
    public int solution(int i, int j, int k) {
        return (int) Arrays.stream(IntStream.rangeClosed(i, j)
                        .mapToObj(String::valueOf)
                        .flatMap(String::lines)
                        .collect(Collectors.joining())
                        .split(""))
                .filter(s -> s.equals(String.valueOf(k)))
                .count();
    }
}