package com.fridayCoffee._2._26_math_score;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MathScore {

    public void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] answers = {1, 2, 3, 4, 5};
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(answers));
    }

    // 내 풀이
    public class Solution {
        public int[] solution(int[] answers) {

            // 1단계: 패턴 정의하기
            int[][] patterns = {
                    {1, 2, 3, 4, 5},
                    {2, 1, 2, 3, 2, 4, 2, 5},
                    {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
            };

            // 2단계: 점수판 만들기
            int[] scores = new int[3];

            // 3단계: 세 친구가 찍은 답과 실제 답을 비교
            // for문을 사용해서 각 문제(즉, answers 배열의 각 요소)를 확인
            // 그 다음엔, 다시 for문으로 세명의 찍기 패턴을 살펴보며, 각 문제에 대한 각각의 답이 실제 답과 같은지 확인
            // 만약 답이 정답과 같다면, 그 사람의 점수를 1점 올리기
            for (int i = 0; i < answers.length; i++) { // 1번 for문은 모든 문제 돌기
                for (int j = 0; j < patterns.length; j++) { // 2번 for문은 세명의 찍기 패턴 돌기
                    if (answers[i] == patterns[j][i % patterns[j].length]) {
                        scores[j]++;
                    }
                }
            }

            // 4단계: 최고 점수 찾기
            // 모든 문제를 확인한 후, 가장 높은 점수를 가진 사람 찾기
            // Math.max 함수를 사용해서 가장 많은 문제를 맞힌 점수가 무엇인지 찾기
            int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

            List<Integer> list = new ArrayList<>();

            // 5단계: 우승자 찾기
            // 최고 점수와 같은 점수인 사람 다 찾기
            // 그리고 그사람 번호를 리스트에 추가하기
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] == maxScore) {
                    list.add(i + 1);
                }
            }

            // 6단계 :결과 반환
            // 우승자의 번호를 배열로 바꿔서 반환
            // stream과 mapToInt를 사용해 리스트를 배열로 변환
            return list.stream().mapToInt(i -> i).toArray();
        }
    }
}