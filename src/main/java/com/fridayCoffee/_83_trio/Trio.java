package com.fridayCoffee._83_trio;

public class Trio {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        int[] numbers = {-2, 3, 0, 2, -5};
        System.out.println("my answer : " + solution.solution(numbers)); // 2
        System.out.println("======================================");
    }
}

// 3중 for문으로 풀기 (누가 이렇게 푸냐고요..)
class Solution0 {
    public int solution(int[] number) {
        int answer = 0;
        int first = 0;

        while (first <= number.length - 2) {
            for (int i = first + 1; i < number.length; i++) {
                for (int j = i + 1; j < number.length; j++) {
                    if (number[first] + number[i] + number[j] == 0) {
                        answer++;
                    }
                }
            }
            first++;
        }
        return answer;
    }
}

// dfs 사용하기
class Solution {
    int answer = 0;
    int student = 0;
    int start = 0;
    int[] selected = new int[3];

    public int solution(int[] number) {

        dfs(number, student, selected, start);
        return answer;
    }

    private void dfs(int[] number, int student, int[] selected, int start) {
        if (student == 3) {
            if (selected[0] + selected[1] + selected[2] == 0) {
                answer++;
            }
            return;
        }

        for (int i = start; i < number.length; i++) {
            selected[student] = number[i];
            dfs(number, student + 1, selected, i + 1); // 중복없애야하니까 i+1 하기!
            selected[student] = 0;
        }
    }
}


class Solution1 {
    static int[] triple;
    static int result = 0;

    // 조합 함수에 가지고 들어갈 input 복사
    static int[] input;
    static int inputLen;

    public int solution(int[] number) {
        // 삼총사 저장 배열
        triple = new int[3];
        result = 0;

        input = number;
        inputLen = number.length;

        // 조합 구하기
        combination(0, 0);
        return result;
    }

    private static void combination(int cnt, int start) {
        // 기저조건
        if (cnt == 3) {
            int sum = 0;
            for (int val : triple) {
                sum += val;
            }
            if (sum == 0) result++;
            return;
        }

        // 유도파트
        for (int i = start; i < inputLen; i++) {
            triple[cnt] = input[i];
            combination(cnt + 1, i + 1);
        }
    }
}

class Solution2 {
    static int answer, N;
    static int[] selected;

    public int solution(int[] number) {
        N = 3;
        comb(0, 0, 0, number);
        return answer;
    }

    public static void comb(int cur, int cnt, int sum, int[] number) {
        if (cnt == N) {
            if (sum == 0)
                answer++;
            return;
        }

        for (int i = cur; i < number.length; i++) {
            comb(i + 1, cnt + 1, sum + number[i], number);
        }
    }
}

class Solution3 {

    static int count;
    static boolean[] visited;

    public int solution(int[] number) {
        int answer = 0;
        visited = new boolean[number.length];

        dfs(number, number.length, 0, 3); // nCr 3개 고르기
        answer = count;
        return answer;
    }

    public static void dfs(int[] numbers, int n, int start, int r) {
        if (r == 0) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    sum += numbers[i];
                }
            }
            if (sum == 0) {
                count++;
            }
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, n, i, r - 1);
                visited[i] = false;
            }
        }
    }
}

