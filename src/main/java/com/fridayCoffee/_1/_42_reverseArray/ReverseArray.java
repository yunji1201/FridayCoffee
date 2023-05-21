package com.fridayCoffee._1._42_reverseArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ReverseArray {
    public static void main(String[] args) throws Exception {
        Solution1 solution = new Solution1();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution.solution(numbers));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = 0;
        for (int i = num_list.length - 1; i >= 0; i--, j++) {
            for (j = j; j < num_list.length; j++) {
                answer[j] = num_list[i];
                break;
            }
        }
        return answer;
    }
}

//        StringBuilder sb = new StringBuilder();
//        for (int num : num_list) {
//            sb.append(num);
//        }
//        answer = Arrays.stream(sb.reverse().toString().split("")).mapToInt(x -> Integer.parseInt(x)).toArray();
//        System.out.println(answer.toString());


class Solution1 {
    public int[] solution(int[] numList) {
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

class Solution2 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }
}

class Solution3 {
    public int[] solution(int[] num_list) {
        return LongStream.range(1, num_list.length + 1)
                .mapToInt(i -> num_list[(int) (num_list.length - i)])
                .toArray();
    }
}

class Solution4 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int startIdx = 0;
        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[startIdx] = num_list[i];
            startIdx++;
        }
        return answer;
    }
}

class Solution5 {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int temp = 0;

        for (int i = 0; i < length / 2; i++) {
            temp = num_list[i];
            num_list[i] = num_list[length - (i + 1)];
            num_list[length - (i + 1)] = temp;
        }

        return num_list;
    }
}

class Solution6 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[answer.length - 1 - i];
        }
        return answer;
    }
}