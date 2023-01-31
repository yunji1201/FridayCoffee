class Solution {
    public int solution(int n) {
        int answer = 1;
        while (true) {
            if (answer * n % 6 == 0) break;
            answer++;
        }
        return answer * n / 6;
    }
}