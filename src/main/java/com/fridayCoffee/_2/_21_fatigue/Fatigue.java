package com.fridayCoffee._2._21_fatigue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Fatigue {

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        System.out.println("my answer : " + solution.solution(80, dungeons)); // 3
    }
}

class Solution {

    // greedy로 풀기
    // 현재 상황에서 최적의 선택 방식 -> 각 단계에서 유리한 선택을 계속 해서 전체적인 최적해를 찾기
    // 간단, 직관, 계산비용 적지만 / 항상 최적해를 보장하지 않음
    public int solution2(int k, int[][] dungeons) {
        // 최대한 많이 탐험하려면 피로도 소모가 적은 순서대로 던전 선택하는게 좋으니까 -> 오름차순
        Arrays.sort(dungeons, Comparator.comparingInt(dengeons -> dengeons[0]));

        int count = 0;
        for (int[] dungeon : dungeons) {
            int minRequiredFatigue = dungeon[0];
            int fatiguePrice = dungeon[1];

            // 현재 피로도로 던전을 탐험할 수 있는 경우
            if (k >= minRequiredFatigue) {
                k -= fatiguePrice;
                count++;
            } else {
                // 내 피로도로 갈 수 있는 곳이 없으면 그만-
                break;
            }
        }
        return count;
    }

    // 완전 탐색
    // 모든 가능한 경우의 수를 확인해서 해결
    // 정확한 최적해 찾기 가능 / 계산 비용 높고 수행시간 증가
    public int solution(int k, int[][] dungeons) {
        int n = dungeons.length;
        ArrayList<Integer> indices = new ArrayList<>();
        // 던전 인덱스를 담은 ArrayList인 indices를 생성
        // indices는 던전 탐험 순서를 나타내는 역할
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }

        int maxExploredDungeons = 0; // 최대 탐험 가능한 던전 수

        do {
            int currentFatigue = k; // 현재 피로도
            int exploredDungeons = 0; // 탐험한 던전수

            for (int index : indices) { // indicies에 있는 던전들 순회하기
                int minRequiredFatigue = dungeons[index][0];
                int fatigueConsumed = dungeons[index][1];

                if (currentFatigue >= minRequiredFatigue) { // 탐험 가능한지 보고, 가능하면 피로도 갱신
                    currentFatigue -= fatigueConsumed;
                    exploredDungeons++; // 탐험한 던전 수도 증가시키기
                } else {
                    break;
                }
            }

            maxExploredDungeons = Math.max(maxExploredDungeons, exploredDungeons); // 현재까지 최대 탐험 가능한 던전 수 업데이트
        } while (nextPermutation(indices)); // 모든 순열을 확인할 떄까지 루프 반복하기

        return maxExploredDungeons;
    }

    private static boolean nextPermutation(ArrayList<Integer> indices) { // 다음 순열을 생성하는 역할을 하는 메서드
        int i = indices.size() - 1; // 현재 인덱스 i 찾기
        // i는 현재 순열에서 바꿔야할 부분의 인덱스임
        while (i > 0 && indices.get(i - 1) >= indices.get(i)) {
            i--;
        }

        // 만약 i가 - 이하면 더 이상 순열이 없으니까 false 반환
        if (i <= 0) {
            return false;
        }

        // i보다 가장 큰 가장 작은 인덱스 j 찾기
        // i-1 번째 원소와 바꿀 원소의 인덱스를 뜻함
        int j = indices.size() - 1;
        while (indices.get(j) <= indices.get(i - 1)) {
            j--;
        }

        // i-1원소랑 j원소랑 교환하기
        int temp = indices.get(i - 1);
        indices.set(i - 1, indices.get(j));
        indices.set(j, temp);

        // i부터 끝까지의 원소들을 뒤집는다
        j = indices.size() - 1;
        while (i < j) {
            temp = indices.get(i);
            indices.set(i, indices.get(j));
            indices.set(j, temp);
            i++;
            j--;
        }

        return true;
    }
}

// 다른 사람 풀이 1
class Solution1 {
    public static boolean check[];
    public static int ans = 0;

    public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];

        dfs(k, dungeons, 0);

        return ans;
    }

    public static void dfs(int tired, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!check[i] && dungeons[i][0] <= tired) {
                check[i] = true;
                dfs(tired - dungeons[i][1], dungeons, cnt + 1);
                check[i] = false;
            }
        }
        ans = Math.max(ans, cnt);
    }
}

class Solution2 {
    int dfs(int k, int[][] dungeons) {
        int cnt = 0;
        for (int[] d : dungeons) {
            int a = d[0], b = d[1];
            if (a <= k) {
                d[0] = 9999;
                cnt = Math.max(1 + dfs(k - b, dungeons), cnt);
                d[0] = a;
            }
        }
        return cnt;
    }

    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        return dfs(k, dungeons);
    }
}

class Solution3 {
    public int ans = 0;

    public int solution(int k, int[][] dungeons) {
        dfs(k, dungeons, 0);
        return ans;
    }

    public void dfs(int k, int[][] d, int a) {
        ans = Math.max(a, ans);
        for (int i = 0; i < d.length; i++)
            if (k >= d[i][0])
                dfs(k - d[i][1], Stream.concat(Arrays.stream(Arrays.copyOfRange(d, 0, i)), Arrays.stream(Arrays.copyOfRange(d, i + 1, d.length))).toArray(int[][]::new), a + 1);
    }
}