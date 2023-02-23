package com.fridayCoffee._62_onceNum;

import java.util.*;
import java.util.stream.Collectors;

public class OnceNum {
    public static void main(String[] args) throws Exception {

        int n = 10;
        Solution solution = new Solution();
        System.out.println(solution.solution("hello"));
    }
}

class Solution {
    public String solution(String s) {
        String[] sList = s.split("");
        Arrays.sort(sList);
        String answer = Arrays.stream(sList).collect(Collectors.joining());

        for (int i = 1; i < sList.length; i++) {
            if (sList[i].equals(sList[i - 1])) {
                answer = answer.replace(sList[i], "");
            }
        }
        return answer;
    }
}

class Solution1 {
    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }
}

class Solution2 {
    public String solution(String s) {
        int[] alpha = new int[26];
        for (char c : s.toCharArray()) {
            alpha[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (alpha[i] == 1) {
                answer.append((char) (i + 'a'));
            }
        }
        return answer.toString();
    }
}

class Solution3 {
    public String solution(String s) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            String replace = s.replace(s.charAt(i) + "", "");
            if (s.length() - replace.length() == 1) {
                set.add(s.charAt(i) + "");
            }
        }
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list);
        return String.join("", list);
    }
}

