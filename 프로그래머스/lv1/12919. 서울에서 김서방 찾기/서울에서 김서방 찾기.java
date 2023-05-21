import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String[] seoul) {
        int num = Arrays.stream(seoul).collect(Collectors.toList()).indexOf("Kim");
        String answer = "김서방은 " + num + "에 있다";
        return answer;
    }
}