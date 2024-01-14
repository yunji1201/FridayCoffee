package com.fridayCoffee._2._19_memory;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.*;

public class Memory {

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain"}};
        System.out.println("my answer : " + solution.solution(name, yearning, photo)); // [19, 15, 6]
    }
}

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        HashMap<String, Integer> yearningMap = new HashMap<>();
        // 각각의 획득점수와 이름을 매핑할 Map 생성

        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }
        // 각각 매핑

        int[] answer = new int[photo.length];
        // 답을 채울 배열 만들기

        for (int i = 0; i < photo.length; i++) {
            int totalYearning = 0;

            for (String person : photo[i]) { // 이중 for문 돌면서 각각의 배열-사람 들어가기
                if (yearningMap.containsKey(person)) { // 포함되어있다면
                    totalYearning += yearningMap.get(person); // 더하기
                }
            }
            answer[i] = totalYearning;
        }
        return answer;
    }

    class Solution1 {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            Map<String, Integer> map = IntStream.range(0, name.length).mapToObj(operand -> Map.entry(name[operand], yearning[operand])).collect(Collectors.toSet()).stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            return Arrays.stream(photo).mapToInt(strings -> Arrays.stream(strings).mapToInt(value -> map.getOrDefault(value, 0)).sum()).toArray();
        }
    }

    class Solution2 {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            for (int i = 0; i < photo.length; i++) {
                for (int j = 0; j < photo[i].length; j++) {
                    for (int k = 0; k < name.length; k++) {
                        if (photo[i][j].equals(name[k])) answer[i] += yearning[k];
                    }
                }
            }
            return answer;
        }
    }


}
