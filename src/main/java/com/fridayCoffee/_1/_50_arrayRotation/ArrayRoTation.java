package com.fridayCoffee._1._50_arrayRotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRoTation {
    public static void main(String[] args) throws Exception {
        Solution1 solution = new Solution1();
        int[] numbers = {1, 2, 3, 4};
        System.out.println(solution.solution(numbers, "right"));
    }
}

class Solution {
    public int[] solution(int[] numbers, String direction) {
        if (direction.equals("left")) {
            int lastNum = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                numbers[i - 1] = numbers[i];
            }
            numbers[numbers.length - 1] = lastNum;
        } else {
            int firstNum = numbers[numbers.length - 1];
            for (int i = numbers.length - 2; i >= 0; i--) {
                numbers[i + 1] = numbers[i];
            }
            numbers[0] = firstNum;
        }
        return numbers;
    }
}

class Solution1 {
    public int[] solution(int[] numbers, String direction) {
//        int배열을 Integer 리스트로 변환
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
//        Integer 리스트를 다시 int배열로 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

class Solution2 {
    public ArrayList solution(int[] numbers, String direction) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            answer.add(numbers[i]);
        }

        int targetValue = 0;

        if (direction.equals("right")) {
            answer.add(0, numbers[numbers.length - 1]);
            answer.remove(answer.size() - 1);

        } else {
            answer.add(numbers[0]);
            answer.remove(0);
        }

        return answer;
    }
}