import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList divisorNum = new ArrayList();

        for (int i : arr) {
            if (i % divisor == 0) {
                divisorNum.add(i);
            }
        }

        if (divisorNum.size() == 0) divisorNum.add(-1);
        int[] answer = divisorNum.stream().mapToInt(i -> (int) i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}