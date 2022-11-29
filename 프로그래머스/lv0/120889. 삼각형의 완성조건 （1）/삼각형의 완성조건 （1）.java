class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int sum = 0;
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] > max) {
                max = sides[i];
            }
            sum += sides[i];
        }
        answer = (max < sum - max) ? 1 : 2;
        return answer;
    }
}