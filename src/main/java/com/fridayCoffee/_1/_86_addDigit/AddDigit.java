package com.fridayCoffee._1._86_addDigit;

import java.util.*;

public class AddDigit {
    public static void main(String[] args) throws Exception {
        Solution3 solution = new Solution3();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(987)); // 24
        System.out.println("======================================");
    }
}

class Solution {
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(i -> Integer.parseInt(i)).sum();
    }
}

class Solution1 {
    public int solution(int n) {
        int answer = 0;

        while (true) {
            answer += n % 10;
            if (n < 10) break;
            n = n / 10;
        }
        return answer;
    }
}

class Solution2 {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}

class Solution3 {
    public int solution(int n) {
        int answer = 0;
        int len = (int) Math.log10(n) + 1;
        for (int i = 0; i < len; i++) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }
}