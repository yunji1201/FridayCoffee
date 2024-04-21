package com.fridayCoffee._2._32_startNlink;

import java.util.Arrays;
import java.util.Scanner;

public class StartNlink {
    static int N; // 사람 수
    static int[][] map; // 각 사람들이 얼마나 잘 맞는지 점수 넣기
    static boolean[] visit; // 누가 어느 팀에 있는지 체크

    static int Min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        map = new int[N][N];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = in.nextInt();
            }
        }

        combi(0, 0); // 팀 나누기
        System.out.println(Min);

    }

    // idx는 인덱스, count는 조합 개수(=재귀 깊이), 이미 팀에 넣은 사람 수
    static void combi(int idx, int count) {
        // 팀 조합이 완성될 경우
        if (count == N / 2) {
			/*
			 방문한 팀과 방문하지 않은 팀을 각각 나누어
			 각 팀의 점수를 구한 뒤 최솟값을 찾는다.
			*/
            diff(); // 점수 차이 계산
            return;
        }

        for (int i = idx; i < N; i++) { // 아직 팀에 넣지 않은 사람들 확인
            // 방문하지 않았다면? = 그 사람이 아직 팀에 없다면
            if (!visit[i]) {
                visit[i] = true;    // 방문으로 변경 - 그 사람을 팀에 넣기
                combi(i + 1, count + 1);    // 재귀 호출 (다음 사람도 팀에 넣기)
                visit[i] = false;    // 재귀가 끝나면 비방문으로 변경
            }
        }
    }

    // 두 팀의 능력치 차이를 계산하는 함수
    static void diff() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                // i 번째 사람과 j 번째 사람이 true라면 스타트팀으로 점수 플러스
                if (visit[i] == true && visit[j] == true) {
                    team_start += map[i][j];
                    team_start += map[j][i];
                }
                // i 번째 사람과 j 번째 사람이 false라면 링크팀으로 점수 플러스
                else if (visit[i] == false && visit[j] == false) {
                    team_link += map[i][j];
                    team_link += map[j][i];
                }
            }
        }
        // 두 팀의 점수 차이 (절댓값)
        int val = Math.abs(team_start - team_link);

        /*
         * 두 팀의 점수차가 0이라면 가장 낮은 최솟값이기 때문에
         * 더이상의 탐색 필요없이 0을 출력하고 종료하면 된다.
         */
        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        Min = Math.min(val, Min);

    }
}
// 백트래킹 : 여러 가능성을 하나씩 다 해보면서, 가장 좋은 해답 찾는 방식
// 1. 가능한 모든 팀 조합 만들기
// 2. 그다음 각 조합에 대한 팀 능력치 계산
// 3. 두 팀의 능력치 차이를 구하기
// 4. 이 차이가 가장 작은 경우 찾기

/*
* 백트래킹(Backtracking)과 그리디(Greedy) 알고리즘의 차이

1. 백트래킹(Backtracking)
백트래킹은 문제의 해결을 위해 모든 가능한 경우의 수를 시도해보는 방법이야. 하지만 가능한 모든 경우를 무작정 해보는 것이 아니라, 현재의 선택이 문제의 해결에 도움이 되지 않을 것 같으면, 그 지점에서 더 이상 진행하지 않고(즉, "백트랙"하여), 다른 가능성을 시도해보는 방식이지.
예를 들어, 퍼즐을 맞추다가 막다른 길에 도달했다면, 조금 전의 선택으로 돌아가서 다른 선택을 해보는 것과 같아.
백트래킹은 주로 순열, 조합, 파티셔닝 문제 등에서 사용되며, 가능한 모든 해를 탐색하는 브루트 포스(Brute Force) 방법보다는 효율적이기는 하지만, 여전히 시간이 많이 걸릴 수 있는 방법이야.

2. 그리디(Greedy) 알고리즘
그리디 알고리즘은 매 선택 시점에서 가장 최선이라고 생각되는 선택을 하는 방식이야. 이렇게 하면 각 단계에서 가장 좋은 것만 선택하기 때문에 전체적으로도 최선의 결과를 얻을 수 있기를 기대하는 거지.
그리디 알고리즘은 매우 빠르고, 구현도 간단하지만, 모든 문제에 적용할 수 있는 건 아니야. 문제에 따라서는 그리디 알고리즘으로는 최적의 해를 찾지 못할 수도 있어.
예를 들어, 거스름돈 문제나 최소 스패닝 트리를 구하는 크루스칼 알고리즘 등이 그리디 방식으로 접근할 수 있는 문제들이야.
결론적으로, 백트래킹은 가능한 모든 경우를 탐색하며 문제의 정확한 해를 찾아내려고 하고, 그리디는 매 선택에서 가장 좋아 보이는 옵션을 고르며 빠르고 간단하게 문제를 해결하려고 해. 때문에 각각의 방법은 문제의 유형과 요구하는 해결책의 정확성에 따라 선택되어야 해.
*/