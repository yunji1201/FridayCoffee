package com.fridayCoffee._2._24_Fibonacci;

public class Fibonacci {

    public void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(3)); // 3
    }

    // 내 풀이
    class Solution {
        public int solution(int n) {
            int answer = 0;

            if (n <= 1) return n;

            int prevOne = 0;
            int prevTwo = 1;

            for (int i = 2; i <= n; i++) {
                answer = (prevOne + prevTwo) % 1234567;
                prevOne = prevTwo;
                prevTwo = answer;
            }

            return answer;
        }
    }

    // 다른 사람 풀이
    class Fibonacci {
        public long fibonacci(int num) {
            long answer = 0;
            long[] array = new long[num + 1]; //인덱스는 0부터 시작하니까 크기를 지정할때 num+1로
            array[0] = 0;
            array[1] = 1;

            for (int i = 2; i <= num; i++) {
                array[i] = array[i - 1] + array[i - 2];

            }

            return array[num];
        }

        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        public static void main(String[] args) {
            Fibonacci c = new Fibonacci();
            int testCase = 3;
            System.out.println(c.fibonacci(testCase));
        }
    }

    // 다른 사람 풀이 #2
    class Solution {

        public int solution(int n) {
            int answer = 0;
            long[] pib = new long[n + 1];
            pib[0] = 0L;
            pib[1] = 1L;
            int times = 1;
            for (int i = 2; i <= n; i++) {
                pib[i] = (pib[i - 1] + pib[i - 2]) % 1234567L;
            }
            //answer=(int)(pib[n]%1234567L);
            answer = (int) (pib[n]);
            return answer;
        }
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12945