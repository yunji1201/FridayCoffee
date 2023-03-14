package com.fridayCoffee._77_nextNum;

public class NextNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numbers = {-2, 0, 2, 4, 6};
        System.out.println(solution.solution(numbers)); // {3,4,5}
    }
}

class Solution {
    public int solution(int[] common) {
        int d = common[1] - common[0];
        int last = common[common.length - 1];
        return d == common[2] - common[1] ? last + d : last * common[1] / common[0];
    }
}