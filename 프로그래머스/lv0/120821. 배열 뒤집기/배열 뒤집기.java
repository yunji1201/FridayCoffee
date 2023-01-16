import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = 0;
        for (int i = num_list.length - 1; i >= 0; i--, j++) {
            for (j = j; j < num_list.length; j++) {
                answer[j] = num_list[i];
                break;
            }
        }
        return answer;
    }
}