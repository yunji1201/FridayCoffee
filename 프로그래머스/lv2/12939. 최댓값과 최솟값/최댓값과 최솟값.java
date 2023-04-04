import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] list = Arrays.stream(s.split(" ")).mapToInt(i -> Integer.parseInt(i)).sorted().toArray();
        return String.valueOf(list[0]) + " " + String.valueOf(list[list.length - 1]);
    }
}