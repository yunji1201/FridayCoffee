class Solution {
    public int solution(int n, int t) {
        int answer = n;
        int count = 0;
        while (count < t) {
            answer = answer * 2;
            count++;
        }
        return answer;
    }
}