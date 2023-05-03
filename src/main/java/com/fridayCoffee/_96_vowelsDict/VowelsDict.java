package com.fridayCoffee._96_vowelsDict;

import java.util.*;

public class VowelsDict {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution("I")); // 1563
        System.out.println("======================================");
    }
}

class Solution {
    static ArrayList wordList = new ArrayList();
    static String[] vowels = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        int count = 0;

        dfs("", 0);

        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(word)) {
                return i;
            }
        }

        return count;
    }

    public void dfs(String word, int depth) {
        wordList.add(word);

        if (depth == 5) {
            return;
        }

        for (int i = 0; i < vowels.length; i++) {
            dfs(word + vowels[i], depth + 1);
        }
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/84512