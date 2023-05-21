package com.fridayCoffee._1._47_germ;

public class Germ {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution.solution(2, 10));
    }
}

class Solution {
    public int solution(int n, int t) {
        int answer = n;
        int count = 0;
        while (count < t) {
            answer = answer * 2;
            count++;
        }
        return answer;
    }
}

class Solution1 {
    public int solution(int n, int t) {
        int answer = 0;

        answer = n << t;

        return answer;
    }
}

class Solution2 {
    public int solution(int n, int t) {
        int answer = n;

        for (int i = 0; i < t; i++) {
            answer = answer + answer;
        }
        return answer;
    }
}

class Solution3 {
    public int solution(int n, int t) {
        int answer = 0;
        while (t != 0) {
            n = n * 2;
            t--;
        }
        answer = n;
        return answer;
    }
}

class Solution4 {
    public int solution(int n, int t) {

        for (int i = 0; i < t; i++) {
            n *= 2;
        }
        return n;
    }
}