class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        while (i < n) {
            answer = (i * i == n) ? 1 : 2;
            if (answer == 1) {
                break;
            }
            i++;
        }
        return answer;
    }
}