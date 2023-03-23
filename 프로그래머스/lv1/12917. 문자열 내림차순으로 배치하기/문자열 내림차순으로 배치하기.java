import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
         String[] strList = s.split("");
        Arrays.sort(strList, Collections.reverseOrder());
        return Arrays.stream(strList).collect(Collectors.joining());
    }
}