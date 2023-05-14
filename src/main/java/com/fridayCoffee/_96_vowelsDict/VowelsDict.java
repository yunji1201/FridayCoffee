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

class Solution1 {
    public int solution(String word) {
        int answer = 0, per = 3905;
        for (String s : word.split("")) answer += "AEIOU".indexOf(s) * (per /= 5) + 1;
        return answer;
    }
}

class Solution2 {
    List<String> list = new ArrayList<>();

    void dfs(String str, int len) {
        if (len > 5) return;
        list.add(str);
        for (int i = 0; i < 5; i++) dfs(str + "AEIOU".charAt(i), len + 1);
    }

    public int solution(String word) {
        dfs("", 0);
        return list.indexOf(word);
    }
}

class Solution3 {
    public int solution(String word) {
        int answer = word.length();
        int pos;
        for (pos = 0; pos < word.length(); pos++) {
            char c = word.charAt(pos);
            if (c == 'A') continue;
            int temp = 0;
            for (int i = 0; i <= 4 - pos; i++) {
                temp += Math.pow(5, i);
            }
            answer += temp * val(c);
        }
        return answer;
    }

    public int val(char c) {
        if (c == 'E') return 1;
        else if (c == 'I') return 2;
        else if (c == 'O') return 3;
        else return 4;
    }
}

class Solution4 {

    static String alpabet = "AEIOU";
    static String[] dict = alpabet.split("");
    static int result = 0;
    static int count = 0;

    public int solution(String word) {
        StringBuilder sb = new StringBuilder();
        dfs(5, 0, sb, word);
        return result;

    }

    void dfs(int target, int cnt, StringBuilder sb, String word) {
        if (sb.toString().equals(word)) {
            result = count;
            return;
        }

        if (target == cnt) {
            return;
        }

        for (int i = 0; i < dict.length; i++) {
            sb.append(dict[i]);
            count++;
            dfs(target, cnt + 1, sb, word);
            sb.deleteCharAt(sb.length() - 1);

        }

    }

}

class Solution5 {
    public int solution(String word) {
        int answer = 0;
        int mul = 781;

        char chr[] = {'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (chr[j] == word.charAt(i)) {
                    answer += 1 + j * mul;
                }
            }
            mul = (mul - 1) / 5;
        }

        return answer;
    }
}