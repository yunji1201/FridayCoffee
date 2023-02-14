import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        ArrayList arrEmergency = (ArrayList) Arrays.stream(emergency).boxed().collect(Collectors.toList());
        for (int i = 1; i < emergency.length + 1; i++) {
            Integer max = (Integer) Collections.max(arrEmergency);
            int maxIndex = arrEmergency.indexOf(max);
            answer[maxIndex] = i;
            arrEmergency.set(maxIndex, 0);
        }
        return answer;
    }
}