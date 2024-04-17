import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {

        char[] charArr = s.toCharArray();
        String[] checkedCharArr = new String[charArr.length];
        Map<Character, Integer> lastPositionMap = new HashMap<>();
        int[] answer = new int[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            char currentChar = s.charAt(i);
            if (lastPositionMap.containsKey(currentChar)) {
                answer[i] = i - lastPositionMap.get(currentChar);
            } else {
                answer[i] = -1;
            }
            lastPositionMap.put(currentChar, i);
        }
        return answer;
    }
}