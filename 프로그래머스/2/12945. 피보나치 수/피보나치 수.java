class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n <= 1) return n;
        
        int prev = 1;
        int prePrev = 0;
        
        for (int i = 2; i <= n; i++) {
            answer = (prev + prePrev) % 1234567;
            prePrev = prev;
            prev = answer;
        }
    
        return answer;
    }
}