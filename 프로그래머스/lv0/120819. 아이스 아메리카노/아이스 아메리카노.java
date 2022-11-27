class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int amerikano = 5500;
        int cup = 0;
        int remind = 0;

        for (int i = 0; i < 1000000; i++) {
            if (amerikano * cup <= money) {
                cup++;
            }
        }

        remind = money - (amerikano * (cup - 1));
        answer[0] = cup - 1;
        answer[1] = remind;

        return answer;
    }
}