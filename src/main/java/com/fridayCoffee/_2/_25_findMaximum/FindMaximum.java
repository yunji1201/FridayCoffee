package com.fridayCoffee._2._25_findMaximum;

import java.util.*;
import java.io.*;

public class FindMaximum {
// 주어진 배열의 모든 가능한 순서(순열)를 시도해보고, 각 경우에 대해 주어진 식의 값을 계산하여 그 중 최댓값을 찾아야 한다
// 이 과정을 통해 배열의 원소를 어떻게 배치하면 주어진 식의 값이 최대가 되는지 알아낼 수 있다

    public static int n; // 배열의 크기
    public static int[] arr; // 배열
    public static int[] ans; // 현재 순서가 정해진 숫자들 저장
    public static boolean[] visit; // 각 숫자가 순서가 이미 정해졌는지 여부 체크
    public static int result;

    // 깊이 우선 탐색
    // 배열의 연속된 원소들 사이의 차이의 절대값 모두 더하기
    // 배열에서 연속된 원소들 사이의 "거리"를 측정하고, 그 "거리"들의 합이 최대가 되도록 배열을 재배치하는 문제
    public static void dfs(int cnt) { // 현재의 깊이 - 몇 개의 원소가 순서가 정해졌는지
        // dfs 함수는 모든 가능한 순열을 생성한다. 이 떄 visit 배열 사용하여 각 숫자가 이미 순서가 정해졌는지 확인.

        // #1.
        // 모든 원소가 ans 배열에 배치되었다. 즉, 하나의 순열이 완성
        if (cnt == n) {
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += Math.abs(ans[i] - ans[i + 1]); // 배열 ans에서 연속된 원소 사이의 차이의 절댓값을 모두 더하여 sum에 저장
            }
            result = Math.max(result, sum);
            // 현재 순열에 대해 계산된 sum과 이전까지의 최대값 result를 비교하여, 더 큰 값을 result에 저장
            return;
        }

        // #2. 모든 순열 생성하기
        for (int i = 0; i < n; i++) {
            // 배열 arr의 모든 원소에 대해 순회하면서 아직 순열에 포함되지 않은(즉, visit[i]가 false인) 원소를 찾기
            if (!visit[i]) {
                ans[cnt] = arr[i];
                visit[i] = true;
                // 찾은 원소를 현재 순열(ans)에 추가하고, 해당 원소가 순열에 포함되었다는 것을 표시하기 위해 visit[i]를 true로 설정
                dfs(cnt + 1);
                // dfs(cnt + 1);: 다음 원소를 순열에 추가하기 위해 dfs 함수를 재귀적으로 호출
                visit[i] = false;
                // 재귀 호출이 끝나고 돌아오면, visit[i]를 다시 false로 설정하여 다른 순열을 생성할 수 있도록
                // 이 과정을 '백트래킹'이라고 함
            }
        }
    }

    public static void main(String[] args) {
        // 입력받기
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt(); // 배열의 크기

        arr = new int[n]; // 입력받을 원본 배열의 원소를 저장
        ans = new int[n]; // dfs 함수에서 생성될 순열을 저장하는 데 사용
        visit = new boolean[n]; // 해당 원소가 이미 순열에 사용되었는지 여부를 체크하는 데 사용

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        dfs(0);
        // 모든 순열을 생성하고, 각 순열에 대해 주어진 식의 값을 계산한 후 최댓값을 찾기 시작하는 함수 dfs를 처음으로 호출
        // 여기서 0은 dfs 함수가 처음 호출될 때 순열에 아무 원소도 포함되지 않았음을 의미

        System.out.println(result);
    }

}