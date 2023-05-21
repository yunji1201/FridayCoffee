package com.fridayCoffee._1._19_addNumberLine;

import java.util.Arrays;

public class AddNumberLine {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.solution(1234));
    }

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] stringNumList = Integer.toString(n).split("");
        for (String i : stringNumList) {
            answer += Integer.parseInt(i);
        }
        return answer;
    }
}

class Solution2 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}

class Solution1 {
    public int solution(int n) {
        Arrays.stream(Integer.toString(n).split("")).mapToInt(Integer::parseInt).sum();
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
