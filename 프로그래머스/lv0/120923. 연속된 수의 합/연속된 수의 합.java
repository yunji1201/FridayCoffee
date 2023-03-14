
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int firstNum = total % num != 0 ? total / num - num / 2 + 1 : total / num - num / 2;
        return IntStream.range(firstNum, firstNum + num).toArray();
    }
}