package com.fridayCoffee._23_doubleNum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DoubleNum {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
//        int[] numbers = {1, 7, 2, 11, 10};
        System.out.println(solution.solution(20));
    }

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}

class Solution1 {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
        // IntStream.rangeClosed(,): 특정 범위의 숫자를 차례대로 생성해주는 기능
    }
}

class Solution2 {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) list.add(i);
        }
        answer = list.size();
        return answer;
    }
}

class Solution3 {
    public int solution(int n) {
        if (n == 1) {
            return 1;
        }
        int answer = 0;
        for (int i = 1; i <= (int) Math.sqrt(n); i++) { // n의 제곱근
            if (i * 2 > n) {
                break;
            } else if (n % i == 0) {
                ++answer;
                if (n / i != i) {
                    ++answer;
                }
            }
        }
        return answer;
    }
}