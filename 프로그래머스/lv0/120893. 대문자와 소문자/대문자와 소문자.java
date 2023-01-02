import java.util.Locale;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (String s : my_string.split("")) {
            answer += (s.equals(s.toLowerCase(Locale.ROOT))) ? s.toUpperCase(Locale.ROOT) : s.toLowerCase(Locale.ROOT);
        }
        return answer;
    }
}