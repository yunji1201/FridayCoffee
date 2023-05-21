package com.fridayCoffee._1._41_divisor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Divisol {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {9, 10, 11, 8};
        System.out.println(solution.solution(24));
    }
}

class Solution {
    public ArrayList solution(int n) {
        ArrayList answer = new ArrayList();
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        return answer;
    }
}

class Solution1 {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}

class Solution2 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        list.add(n);

        return list.stream().mapToInt(e -> e).toArray();
    }
}

class Solution3 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}