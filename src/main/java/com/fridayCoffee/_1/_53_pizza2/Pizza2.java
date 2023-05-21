package com.fridayCoffee._1._53_pizza2;

public class Pizza2 {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution.solution(10));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 1;
        while (true) {
            if (answer * n % 6 == 0) break;
            answer++;
        }
        return answer * n / 6;
    }
}

class Solution1 {
    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return GCD(num2, num1 % num2);
    }

    public int LCM(int num1, int num2) {
        return num1 * num2 / GCD(num1, num2);
    }

    public int solution(int n) {
        return LCM(n, 6) / 6;
    }
}

class Solution2 {
    public int solution(int n) {
        return n / gcd(n, 6);
    }

    public int gcd(int x, int y) {
        return x % y == 0 ? y : gcd(y, x % y);
    }
}

