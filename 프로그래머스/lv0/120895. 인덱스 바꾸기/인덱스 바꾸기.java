import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] strList = my_string.split("");
        String firstStr = strList[num1];
        strList[num1] = strList[num2];
        strList[num2] = firstStr;
        return Arrays.stream(strList).collect(Collectors.joining());
    }
}