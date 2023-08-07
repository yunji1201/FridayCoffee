package com.fridayCoffee._2._10_languageScores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LanguageScores {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        String[] language = {"swift", "java", "java", "r"};
        int[][] scores = {{65, 80, 90}, {40, 60, 20}, {49, 59, 14}, {43, 60, 78}};
        System.out.println("my answer : " + solution.solution(language, scores));
    }
}

class Solution {
    public String[] solution(String[] language, int[][] scores) {
        String[] answer = new String[0];

        ArrayList onlylanguage = new ArrayList();
        String[] scoresSum = new String[scores.length];

        for (int i = 0; i < language.length - 1; i++) {
            if (onlylanguage.contains(language[i])) {

            } else {

            }
            onlylanguage.add(language[i]);
        }

        return answer;
    }
}