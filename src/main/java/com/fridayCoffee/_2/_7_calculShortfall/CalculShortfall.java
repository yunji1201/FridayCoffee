package com.fridayCoffee._2._7_calculShortfall;

public class CalculShortfall {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(3, 20, 4)); // 10
    }
}

class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        int num = 1;
        while (num <= count) {
            total += price * num;
            num++;
        }
        return money - total > 0 ? 0 : Math.abs(money - total);
    }
}


class Solution1 {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}

/**
 * (1) count * (count + 1) / 2 : 1~count까지의 합 : 등차수열의 합 의미
 * count가 3이라면 1 + 2 + 3 = 6
 * (2) price * (count * (count + 1) / 2) : 총 필요한 금액
 * (3) Math.max(price * (count * (count + 1) / 2) - money, 0) : 계산한 총 금액에서 money 뺀 값
 * 만약 계산된 값이 0 이하라면 충분한 금액이 있는 것이므로, 0을 반환
 */

class Solution2 {
    public long solution(int price, int money, int count) {
        long answer = money;
        for (int cnt = 0; cnt < count; ++cnt) {
            answer -= (price * (cnt + 1));
        }
        return (answer > 0 ? 0 : -answer);
    }
}

class Solution3 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        answer = (long) price * count * (count + 1) / 2 - money;
        return answer <= 0 ? 0 : answer;
    }
}