import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        return (int) Arrays.stream(Arrays.toString(array).replaceAll("[^0-9]", "").split("")).filter(n -> n.equals("7") == true).count();
    }
}