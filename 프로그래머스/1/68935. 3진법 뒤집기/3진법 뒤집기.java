class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 10 -> 3
        String ternaryNum = Integer.toString(n, 3);
        
        String reverseNum = new StringBuilder(ternaryNum).reverse().toString();
        
        // 3 -> 10
        answer = Integer.parseInt(reverseNum, 3);
        
        return answer;
    }
}