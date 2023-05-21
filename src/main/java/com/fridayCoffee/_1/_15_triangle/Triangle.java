package com.fridayCoffee._1._15_triangle;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {199, 72, 222};
        System.out.println(solution.solution(numbers));
    }

}

//class Solution {
//    public int solution(int[] sides) {
//        int answer = 0;
//        int max = sides[0];
//        int sum = 0;
//        for (int i = 0; i < sides.length; i++) {
//            if (sides[i] > max) {
//                max = sides[i];
//            }
//            sum += sides[i];
//        }
//        answer = (max < sum - max) ? 1 : 2;
//        return answer;
//    }
//}

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
    }
}

//class Solution {
//    public int solution(int[] sides) {
//        int A = sides[0] + sides[1];
//        int B = sides[1] + sides[2];
//        int C = sides[0] + sides[2];
//
//        if(A <= sides[2] || B <= sides[0] || C <= sides[1]) return 2;
//        else return 1;
//    }
//}