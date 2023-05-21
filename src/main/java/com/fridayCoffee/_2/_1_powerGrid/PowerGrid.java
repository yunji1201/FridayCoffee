package com.fridayCoffee._2._1_powerGrid;

import java.util.ArrayList;
import java.util.List;

// 전력망 네트워크가 하나의 트리 형태
public class PowerGrid {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(9, wires)); // 3
    }
}

/*
1. 인접 행렬을 구한다 (코드에서는 graph)
2. 전선을 하나씩 끊어서 전력망 두개로 만들기
3. 두 전력망의 송전탑 개수의 차이 구하기 (DFS를 사용해서 끊어진 전력망 중 하나를 선택해서 연결된 노드 수 구하기)
4. 최솟값을 갱신해주기
*/

class Solution {
    public int solution(int n, int[][] wires) {

        List<List<Integer>> adjList = new ArrayList<>(); // 인접리스트 

        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>()); // 송전탑 개수만큼 인접리스트에 빈 리스트 추가
        }

        // 인접 리스트 생성
        // 각 송전탑과 그와 연결된 송전탑 보여주는 리스트
        for (int[] wire : wires) { // wires에서 각각의 전선 정보를 가져와서 인접 리스트에 추가하기
            int v1 = wire[0]; // 전선으로 연결된 송전탑 번호
            int v2 = wire[1]; // 전선으로 연결된 송전탑 번호
            adjList.get(v1).add(v2); // 양방향 연결이니까 서로의 인접리스트에 추가해야함 // 디버깅돌리면서 확인함
            adjList.get(v2).add(v1); // 양방향 연결이니까 서로의 인접리스트에 추가해야함
        }

        int minDiff = Integer.MAX_VALUE; // 두 전력망의 송전탑 개수 차이 중 최소값 저장하는 변수

        for (int[] wire : wires) {

            int v1 = wire[0];
            int v2 = wire[1];

            // 전선 끊기
            // 임의로 선택해서 끊기
            // 두 전력망의 송전탑 개수 차이의 최솟값을 찾아야하니까 모든 경우의 차이를 계산해야ㅐ함
            adjList.get(v1).remove(Integer.valueOf(v2));
            adjList.get(v2).remove(Integer.valueOf(v1));
            // 위에서 이렇게 전선을 제거하고
            // 아래에서 countNodes 메서드 호출해서 두 전력망의 송전탑 개수를 계산한다

            int count1 = countNodes(v1, adjList, new boolean[n + 1]);
            int count2 = countNodes(v2, adjList, new boolean[n + 1]);

            int diff = Math.abs(count1 - count2); // 절대값(차이) 구하기
            minDiff = Math.min(minDiff, diff); // 현재까지의 최소 차이보다 작다면 업뎃하기

            // 끊었던거 다시 재연결
            adjList.get(v1).add(v2);
            adjList.get(v2).add(v1);
        }

        return minDiff;
    }

    // 송전탑 개수를 세기
    private int countNodes(int node, List<List<Integer>> adjList, boolean[] visited) { // dfs로 송전탑 개수세기
        visited[node] = true; // 방문여부 체크하기

        int count = 1; // 현재 송전탑을 포함하여 개수를 세야하니까 count를 1로 초기화한다

        for (int neighbor : adjList.get(node)) { // 현재 송전탑과 연결된 인접한 송전탑에 대해 반복돌기
            if (!visited[neighbor]) { // 인접한 송전탑이 방문되지 않았으면 -> 아직 개수 안 세었다면?

                // dfs 재귀호출해서 해당 송전탑(neighbor)을 출발해서 송전탑개수 세고, 그 개수를 현재의 개수에 더함
                count += countNodes(neighbor, adjList, visited);
            }
        }
        return count;
    }
}
