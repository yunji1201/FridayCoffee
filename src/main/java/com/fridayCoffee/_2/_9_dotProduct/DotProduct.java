package com.fridayCoffee._2._9_dotProduct;

import java.util.stream.IntStream;

public class DotProduct {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println("my answer : " + solution.solution(a, b)); // 3
    }
}

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}

class Solution1 {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}

class Solution2 {
    public int solution(int[] a, int[] b) {
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            int multiple = a[i] * b[i];
            total += multiple;
        }
        System.out.println(total);
        return total;
    }
}

class Solution3 {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+= a[i]*b[i];
        }
        return sum;
    }
}

class Solution4 {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i]*b[i];
        }
        answer = sum;
        return answer;
    }
}