package com.fridayCoffee._3_namerge;

public class test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(65,10);
    }
}

class Solution {
    public int solution(int num1, int num2) {
        int answer = (int) ((Double.valueOf(num1) / Double.valueOf(num2)) * 1000);
        return answer;

    }
}


