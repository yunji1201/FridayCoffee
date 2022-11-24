class Solution {
    public int solution(int n) {
        int pizza = 7;
        return (n <= pizza) ? 1 : ((n % 7 < 1) ? n / 7 : n / 7 + 1);
    }
}