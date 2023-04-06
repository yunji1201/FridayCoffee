package com.fridayCoffee._90_distanceNumber;

import java.util.Arrays;
import java.util.stream.LongStream;

public class DistanceNumber {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(-4, 3)); // "2,4,6,8,10"
        System.out.println("======================================");
    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }
        return answer;
    }
}

class Solution1 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0;
        for (int i = 0; i < answer.length; i++) {
            sum += x;
            answer[i] = sum;
        }


        return answer;
    }
}

class Solution2 {
    public long[] solution(int x, int n) {
        return LongStream.iterate(x, i -> i + x).limit(n).toArray();
    }
}