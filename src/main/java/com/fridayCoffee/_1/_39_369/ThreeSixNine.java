package com.fridayCoffee._1._39_369;

import java.util.Arrays;

public class ThreeSixNine {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {9, 10, 11, 8};
        System.out.println(solution.solution(29423));
    }
}

class Solution {
    public int solution(int order) {
        int answer = 0;
        for (String s : String.valueOf(order).split("")) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) answer++;
        }
        return answer;
    }
}

class Solution1 {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
    }
}

class Solution2 {
    public int solution(int order) {
        int answer = 0;
        String str = order + "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '3' || c == '6' || c == '9') answer++;
        }
        return answer;
    }
}