package com.fridayCoffee._76_continuityNum;

import java.util.stream.IntStream;

public class ContinuityNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.solution(4, 14)); // {3,4,5}
    }
}

// intStream 사용하기
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int firstNum = total % num != 0 ? total / num - num / 2 + 1 : total / num - num / 2;
        return IntStream.range(firstNum, firstNum + num).toArray();
    }
}

// for문 사용하기
class Solution1 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if (total % num != 0) { // 안나눠떨어짐
            int firstNum = total / num - num / 2 + 1;
            for (int i = 0; i < num; i++, firstNum++) {
                answer[i] = firstNum;
            }
        } else { // 나눠떨어짐
            int firstNum = total / num - num / 2;
            for (int i = 0; i < num; i++, firstNum++) {
                answer[i] = firstNum;
            }
        }
        return answer;
    }
}