package com.fridayCoffee._1._32_ant;

public class Ant {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(solution.solution(24));
    }
}

enum AntLevel {
    KING(5), QUEEN(3), JACK(1);
    final int hp;

    AntLevel(int hp) {
        this.hp = hp;
    }
}

class Solution {
    public int solution(int hp) {
        int k = hp / AntLevel.KING.hp;
        int q = (hp % AntLevel.KING.hp) / AntLevel.QUEEN.hp;
        int j = q == 1 ? (hp - k * AntLevel.KING.hp - q * AntLevel.QUEEN.hp) / AntLevel.JACK.hp : ((hp % AntLevel.KING.hp) % AntLevel.QUEEN.hp) / AntLevel.JACK.hp;
        return k + q + j;
    }
}

class Solution1 {
    public int solution(int hp) {
        return hp / 5 + (hp % 5) / 3 + (hp % 5) % 3;
    }
}

class Solution2 {
    public int solution(int hp) {
        int answer = hp / 5;
        hp %= 5;
        answer += hp / 3;
        hp %= 3;
        answer += hp / 1;
        return answer;
    }
}

class Solution3 {
    public int solution(int hp) {
        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }
}

class Solution4 {
    public int solution(int hp) {
        int answer = 0;
        answer = (hp / 5) + ((hp % 5) / 3) + ((hp % 5) % 3);
        return answer;
    }
}