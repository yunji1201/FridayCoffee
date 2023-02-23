package com.fridayCoffee._24_pizza3;

public class Pizza3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {1, 7, 2, 11, 10};
        System.out.println(solution.solution(7, 10)); // 답 : 3
    }
}

class Solution {
    public int solution(int slice, int n) {
        int answer = (n % slice > 0) ? n / slice + 1 : n / slice;
        return answer;
    }
}

class Solution1 {
    public int solution(int slice, int n) {
        int count = 1;
        int temp = slice;
        while (true) {
            if (temp >= n) {
                return count;
            }
            temp += slice;
            ++count;
        }
    }
}

class Solution2 {
    public int solution(int slice, int n) {
        return n / slice + (n % slice > 0 ? 1 : 0);
    }
}