class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        int num = 1;
        while (num <= count) {
            total += price * num;
            num++;
        }
        answer = money - total;
        return answer > 0 ? 0 : Math.abs(answer);
    }
}