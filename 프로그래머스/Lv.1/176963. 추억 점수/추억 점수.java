import java.util.HashMap;

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
}