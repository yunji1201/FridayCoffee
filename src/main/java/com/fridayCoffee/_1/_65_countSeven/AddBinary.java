package com.fridayCoffee._1._65_countSeven;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AddBinary {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numbers = {7, 77, 17};
        System.out.println(solution.solution(numbers));
    }
}

class Solution {
    public int solution(int[] array) {
        return (int) Arrays.stream(Arrays.toString(array).replaceAll("[^0-9]", "").split("")).filter(n -> n.equals("7") == true).count();
    }
}

class Solution1 {
    public int solution(int[] array) {
        return (int) Arrays.stream(
                        Arrays.stream(array)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining())
                                .split("")
                )
                .filter(s -> s.equals("7"))
                .count();
    }
}

class Solution2 {
    public int solution(int[] array) {
        int answer = 0;
        for (int a : array) {
            while (a != 0) {
                if (a % 10 == 7) {
                    answer++;
                }
                a /= 10;
            }
        }
        return answer;
    }
}