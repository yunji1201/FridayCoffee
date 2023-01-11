import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = Arrays.stream(array).max().getAsInt();
        int index = IntStream.range(0, array.length).filter(i -> max == array[i]).findFirst().getAsInt();
        answer[0] = max;
        answer[1] = index;
        return answer;
    }
}