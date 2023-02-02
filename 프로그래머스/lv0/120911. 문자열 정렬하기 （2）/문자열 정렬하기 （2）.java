import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charList = my_string.toLowerCase().toCharArray();
        Arrays.sort(charList);
        return new StringBuffer(new String(charList)).toString();
    }
}