package com.fridayCoffee._97_SumBetweenNum._96_vowelsDict;

import java.util.ArrayList;
import java.util.Collections;

public class SumBetweenNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(5, 3)); // 12
        System.out.println("======================================");
    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        ArrayList list = new ArrayList();
        list.add(a);
        list.add(b);

        Collections.sort(list);

        for (int i = (int) list.get(0); i < (int) list.get(1) + 1; i++) {
            answer += i;
        }
        return answer;
    }
}

class Solution1 {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2; //등차수열의 합 공식
    }
}

class Solution2 {
    public long solution(int a, int b) {
        long answer = 0;
        for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++)
            answer += i;

        return answer;
    }
}

class Solution3 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a != b) {
            for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                answer += i;
            }
        } else {
            answer = a;
        }
        return answer;
    }
}