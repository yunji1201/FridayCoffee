package com.fridayCoffee._2._15_stockPrice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StockPrice {
    /*  초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
        제한사항
        prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
        prices의 길이는 2 이상 100,000 이하입니다.
      */

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println("my answer : " + solution.solution(prices)); // [4, 3, 1, 1, 0]
    }
}

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; // 결과를 저장할 배열

        for (int i = 0; i < prices.length; i++) { // 돌기 시작
            for (int j = i + 1; j < prices.length; j++) {

                // 현재 시점에서 가격이 안 떨어졌으니 해당 시점 기간을 1초 증가
                answer[i]++;

                // 만약 현재 시점의 가격이 이후 시점의 가격보다 크다면 가격이 떨어졌으니까 반복문 종료
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }
        return answer;
    }
}