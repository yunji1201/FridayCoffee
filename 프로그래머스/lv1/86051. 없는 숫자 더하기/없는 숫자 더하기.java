import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int solution(int[] numbers) {
        boolean[] found = new boolean[10];
        Arrays.stream(numbers).forEach(n -> found[n] = true);
        return (int) IntStream.range(0, found.length).filter(i -> !found[i]).sum();
    }
}
