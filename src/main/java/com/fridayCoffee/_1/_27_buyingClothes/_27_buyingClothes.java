package com.fridayCoffee._1._27_buyingClothes;

public class _27_buyingClothes {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {0, 0, 1, 5, 6, 321, 123, 31, 12};
        System.out.println(solution.solution(580000));
    }
}

class Solution {
    public int solution(int price) {
        return (price >= 100000) ? (price >= 300000) ? (price >= 500000) ? (int) (price - price * 0.2) : (int) (price - price * 0.1) : (int) (price - (price * 0.05)) : price;
    }
}

class Solution1 {
    public int solution(int price) {
        int answer = 0;

        if (price >= 500000) return (int) (price * 0.8);
        if (price >= 300000) return (int) (price * 0.9);
        if (price >= 100000) return (int) (price * 0.95);

        return price;
    }
}

class Solution2 {
    public int solution(int price) {
        int answer = 0;
        double ratio = ((price >= 500000) ? (0.8) : ((price >= 300000) ? (0.9) : ((price >= 100000) ? (0.95) : (1.0))));
        answer = (int) (price * ratio);
        return answer;
    }
}