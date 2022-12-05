import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int j = 0; j < n + 1; j++) {
            if (j % 2 != 0) {
                    answer.add(j);
                }
            }
        return answer;
    }
}