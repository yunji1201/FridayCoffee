package com.fridayCoffee._74_divisorSum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisorSum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.solution(18));
    }
}

class Solution {
    public int solution(int n) {
        ArrayList newArr = new ArrayList<>();
        List arr = IntStream.range(1, n + 1).mapToObj(k -> (n % k == 0) ? newArr.add(k) : false).collect(Collectors.toList());
        return newArr.stream().mapToInt(s -> (int) s).sum();
    }
}

class Solution1 {
    public int solution(int num) {
        int answer = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                answer += i;
            }
        }
        return answer + num;
    }
}