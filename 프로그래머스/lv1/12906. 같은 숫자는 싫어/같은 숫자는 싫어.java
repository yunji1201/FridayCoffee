import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList answer = new ArrayList();

        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                answer.add(arr[i]);
            }
        }
      return answer.stream().mapToInt(i -> (int) i).toArray();
    }
}