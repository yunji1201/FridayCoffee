package com.fridayCoffee._2._28_carpet;

public class Carpet {

    public void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(10, 2)); // [4,3]
    }

    // 내 풀이
    class Solution {
        public int[] solution(int brown, int yellow) {
            int total = brown + yellow;

            for (int width = 3; width <= total / width; width++) {
                if (total % width == 0) { // 전체 격자 수가 현재 가로 길이로 나누어 떨어지는 경우 - width가 유효한 카펫의 가로 길이일 가능성이 있음을 의미
                    int height = total / width; // 세로 길이 height를 계산, 전체 격자 수를 현재 가로 길이로 나눈 결과가 세로 길이

                    // yellow 사각형을 감싸는 조건 확인
                    // 노란색 격자 수 확인하기: 가로 길이에서 2를 빼고, 세로 길이에서 2를 빼서 노란색 격자 수가 맞는지 확인
                    if ((width - 2) * (height - 2) == yellow) {
                        // 카펫의 가로 길이가 세로 길이와 같거나 더 길도록 배열 반환
                        return width >= height ? new int[]{width, height} : new int[]{height, width}; // 길이에 따라서 순서 바꿔서 배열 만들기
                    }
                }
            }
            return new int[]{0, 0};
        }
    }
/*
전체 격자 수 계산하기: 갈색 격자 수와 노란색 격자 수를 합쳐서 카펫의 전체 격자 수를 계산해요.
가로 길이와 세로 길이 찾기: 카펫의 가로 길이를 3부터 시작해서, 카펫의 전체 격자 수를 가로 길이로 나눠보며, 올바른 가로 길이와 세로 길이를 찾아요.
노란색 격자 수 확인하기: 가로 길이에서 2를 빼고, 세로 길이에서 2를 빼서 노란색 격자 수가 맞는지 확인해요.
결과 반환하기: 찾은 가로 길이가 세로 길이보다 크거나 같은 경우, 그 크기를 [가로, 세로] 형태로 반환해요. 만약 가로가 세로보다 작다면, 순서를 바꿔서 [세로, 가로]로 만들어 반환해요.
만약 안 맞는 경우: 올바른 크기를 찾지 못하면 [0, 0]을 반환해요.
*/
}