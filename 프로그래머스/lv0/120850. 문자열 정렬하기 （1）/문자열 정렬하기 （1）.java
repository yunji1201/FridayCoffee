import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String my_string) {
        String[] numList = my_string.replaceAll("[^0-9]", "").split("");
        return Arrays.stream(numList).sorted().mapToInt(e -> Integer.parseInt(e)).toArray();
    }
}