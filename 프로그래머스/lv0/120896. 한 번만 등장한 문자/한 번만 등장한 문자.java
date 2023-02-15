
import java.util.*;
import java.util.stream.Collectors;
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