package com.fridayCoffee._2._33_strangeText;

import java.util.Scanner;

public class strangeText {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution("try hello world")); // "TrY HeLlO WoRlD"
    }
}

// 풀이 1 (정답률 68%)
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();

            for (int j = 0; j < chars.length; j++) {
                if (j % 2 == 0) {
                    chars[j] = Character.toUpperCase(chars[j]);
                } else {
                    chars[j] = Character.toLowerCase(chars[j]);
                }
            }
            sb.append(chars).append(" ");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}

// 풀이 2 (정답률 100%)
class Solution2 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isEven = true;

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                isEven = true;
                sb.append(ch);
            } else {
                if (isEven) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
                isEven = !isEven;
            }
        }

        return sb.toString();
    }
}

// 다른 사람 풀이
class Solution3 {
    public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for (String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}

