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

// 다른 사람 풀이 # 1
class Solution1 {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }
        return answer;
    }
}
// 가장 많은 사람들의 풀이. 이중 for문 사용하는게 제일 일반적인 것으로 보임.


// 다른 사람 풀이 # 2
class Solution2 {
    public int[] solution(int[] prices) {

        Stack<Integer> beginIdxs = new Stack<>();
        int i=0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }

        return terms;
    }
}
// stack 클래스 사용법을 알아야겠다고 생각.

// GPT 풀이
class Solution3 {

    public static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n]; // 결과를 저장할 배열 초기화
        Stack<Integer> stack = new Stack<>(); // 주식 가격이 떨어지지 않은 기간을 저장할 스택

        for (int i = 0; i < n; i++) {
            // 스택이 비어있지 않고 현재 주식 가격이 스택의 마지막 요소보다 작다면
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int j = stack.pop(); // 주식 가격이 떨어졌을 때, 해당 위치를 스택에서 꺼내옴
                answer[j] = i - j; // 현재 시점에서 떨어지기까지의 기간을 계산하여 저장
            }

            stack.push(i); // 현재 시점을 스택에 추가
        }

        // 주식 가격이 떨어지지 않은 경우, 끝까지 가격이 떨어지지 않았으므로 기간은 끝까지 남아있는 기간
        while (!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = n - 1 - j;
        }

        return answer;
    }
}