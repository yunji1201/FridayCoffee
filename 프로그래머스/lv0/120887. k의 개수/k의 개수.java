import java.util.Arrays;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String numStr = "";
        for (int n = i; n < j + 1; n++) {
            numStr += String.valueOf(n);
        }
        return (int) Arrays.stream(numStr.split("")).filter(e -> Integer.parseInt(e) == k).count();
    }
}