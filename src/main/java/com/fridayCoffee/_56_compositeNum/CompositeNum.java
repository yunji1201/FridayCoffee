package com.fridayCoffee._56_compositeNum;

import java.util.stream.IntStream;

public class CompositeNum {
    public static void main(String[] args) throws Exception {
        Solution1 solution = new Solution1();
//        int[] numbers = {1, 2, -3, 4, -5};
        System.out.println(solution.solution(15));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    answer++;
                    j = (int) Math.sqrt(i);
                }
            }
        }
        return answer;
    }
}

class Solution1 {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
    }
}

class Solution2 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 4; i < n + 1; i++) {
            if (i % 2 == 0) {
                answer++; // 4이상 짝수는 전부 합성수
                continue;
            } else {
                for (int k = 3; k < i / 2; k = k + 2) {
                    if (i % k == 0) {
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}

class Solution3 {
    public int solution(int n) {
        int count = 0;

        for (int i = 4; i <= n; i++) {
            if (isComposite(i)) {
                count++;
            }
        }

        return count;
    }

    boolean isComposite(int number) {
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return true;
            }
        }

        return false;
    }
}