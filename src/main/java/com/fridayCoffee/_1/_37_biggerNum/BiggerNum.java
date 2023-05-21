package com.fridayCoffee._1._37_biggerNum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BiggerNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numbers = {9, 10, 11, 8};
        System.out.println(solution.solution(numbers));
    }
}

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = Arrays.stream(array).max().getAsInt();
        int index = IntStream.range(0, array.length).filter(i -> max == array[i]).findFirst().getAsInt();
        answer[0] = max;
        answer[1] = index;
        return answer;
    }
}

class Solution2 {
    public int[] solution(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        // boxed() 메소드는 IntStream 같이 원시 타입에 대한 스트림 지원을 클래스 타입(예: IntStream -> Stream<Integer>)으로 전환하여 전용으로 실행 가능한
        // (예를 들어 본문과 같이 int 자체로는 Collection에 못 담기 때문에 Integer 클래스로 변환하여 List<Integer> 로 담기 위해 등) 기능을 수행하기 위해 존재
        int max = list.stream().max(Integer::compareTo).orElse(0);
        int index = list.indexOf(max);
        return new int[]{max, index};
    }
}

class Solution3 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}

class Solution4 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}

class Solution5 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        answer[0] = array[0];
        answer[1] = 0;
        for (int i = 0; i < array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}