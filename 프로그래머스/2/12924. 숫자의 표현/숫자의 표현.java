class Solution {
    public int solution(int n) {
        int count = 0;
        int sum = 0;

        for (int num = 1; num <= n; num++) {
            sum = 0;
            for (int currentNum = num; currentNum <= n; currentNum++) {
                sum += currentNum;
                if (sum == n) {
                    count++;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        return count;
    }
}
