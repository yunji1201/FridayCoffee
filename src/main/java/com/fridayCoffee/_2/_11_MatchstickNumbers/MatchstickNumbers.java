package com.fridayCoffee._2._11_MatchstickNumbers;

public class MatchstickNumbers {
    static int[] matchsticks = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

    public static void main(String[] args) {
        int k = 11;
        int count = findNumbersWithMatchsticks(k);
        System.out.println("성냥개비 " + k + "개로 만들 수 있는 숫자 개수: " + count);
    }

    static int findNumbersWithMatchsticks(int k) {
        int count = 0;
        int num = 0;

        while (num <= 999999) {
            if (getTotalMatchsticks(num) == k) {
                count++;
            }
            num++;
        }

        return count;
    }

    static int getTotalMatchsticks(int number) {
        if (number == 0) {
            return matchsticks[0];
        }

        int total = 0;
        while (number > 0) {
            int digit = number % 10;
            total += matchsticks[digit];
            number /= 10;
        }
        return total;
    }
}
