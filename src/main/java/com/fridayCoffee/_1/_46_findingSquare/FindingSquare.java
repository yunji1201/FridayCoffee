package com.fridayCoffee._1._46_findingSquare;

public class FindingSquare {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution.solution(144));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        while (i < n) {
            answer = (i * i == n) ? 1 : 2;
            if (answer == 1) break;
            i++;
        }
        return answer;
    }
}

class Solution1 {
    public int solution(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}

class Solution2 {
    public int solution(int n) {
        int answer = 0;
        Double a = Math.sqrt(n);
        if (a == a.intValue())
            return 1;
        else
            return 2;
    }
}

class Solution3 {
    public int solution(int n) {
        int answer = 0;
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}

class Solution4 {
    public int solution(int n) {
        int m = (int) Math.sqrt(n);
        return n == m * m ? 1 : 2;
    }
}