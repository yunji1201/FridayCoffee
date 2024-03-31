package com.fridayCoffee._2._22_scoville;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Scoville {

    public void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        int[] scoville = {1, 2, 3, 9, 10, 12};
        System.out.println("my answer : " + solution.solution(scoville, 7)); // 2
    }
}

class Solution {
    public int solution(int[] scoville, int K) {
        int mixCount = 0;
        int heapSize = scoville.length;

        // 힙을 구성
        for (int i = heapSize / 2 - 1; i >= 0; i--) {
            heapify(scoville, heapSize, i);
        }

        // 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복
        while (scoville[0] < K) {
            if (heapSize == 1) { // 모든 음식을 K 이상으로 만들 수 없는 경우
                return -1;
            }

            // 가장 작은 두 개의 음식을 섞어 새로운 음식 생성
            int mixedScoville = scoville[0] + 2 * scoville[1];
            // 섞은 음식으로 대체
            scoville[0] = mixedScoville;
            // 힙 성질을 유지하면서 힙 재구성
            heapify(scoville, heapSize, 0);
            // 힙 크기 감소
            heapSize--;
            // 섞은 횟수 증가
            mixCount++;
        }
        return mixCount;
    }

    // 특정 인덱스의 노드를 힙으로 만드는 메서드
    private void heapify(int[] array, int heapSize, int index) {
        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        // 왼쪽 자식과 비교
        if (left < heapSize && array[left] < array[smallest]) {
            smallest = left;
        }

        // 오른쪽 자식과 비교
        if (right < heapSize && array[right] < array[smallest]) {
            smallest = right;
        }

        // 최소값이 자신이 아니라면 교환
        if (smallest != index) {
            swap(array, index, smallest);
            // 변경된 자식노드로 재귀 호출
            heapify(array, heapSize, smallest);
        }
    }

    // 두 값을 교환하는 메서드
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}