package com.fridayCoffee._2._34_mountain;

public class Mountain {
    public static int solution(int mapCount, int[][] map) {
        int count = 0; // 산봉우리 개수

        // 완전탐색
        //  지도의 각 위치를 순회하면서 해당 위치가 산봉우리인지를 판단하기 위해 상하좌우를 확인
        //  현재 위치의 높이와 주변 위치의 높이를 비교하여 산봉우리인지를 판단
        //  이러한 방식으로 모든 위치를 탐색하여 산봉우리의 개수를 세는 것 => 완전탐색의 전형적인 풀이라고 함
        for (int i = 0; i < mapCount; i++) {
            for (int j = 0; j < mapCount; j++) {
                int currentValue = map[i][j]; // 현재 위치값
                boolean isPeak = true;

                // 상하좌우 방향 벡터
                int[] dRow = {-1, 1, 0, 0}; // 행이동
                int[] dCol = {0, 0, -1, 1}; // 열이동

                for (int dir = 0; dir < 4; dir++) { // 상하좌우 탐색 루프
                    int ni = i + dRow[dir];
                    int nj = j + dCol[dir];

                    if (ni >= 0 && ni < mapCount && nj >= 0 && nj < mapCount) {
                        if (currentValue <= map[ni][nj]) {
                            isPeak = false;
                            break;
                        }
                    }
                }

                if (isPeak) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] map = {
                {5, 3, 7, 2, 3},
                {3, 7, 1, 6, 1},
                {7, 2, 5, 3, 4},
                {4, 3, 6, 4, 1},
                {8, 7, 3, 5, 2}
        };
        System.out.println(solution(5, map));
    }
}

// 어려워서 내일 다시 공부 필요