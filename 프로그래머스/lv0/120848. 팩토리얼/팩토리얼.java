class Solution {
    public int solution(int n) {
        int answer = 10;
        int sum = 1;
        for (int i = 1; i < 11; i++) {
            if (sum * i > n) {
                return i - 1;
            }
                sum = sum * i;
        }
        return answer;
    }
}