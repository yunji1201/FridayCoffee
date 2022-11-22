class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int length = numbers.length;
        int sum = 0;
        for (int i =0; i<length; i++){
            sum += numbers[i];
        }
        answer = (double)sum / length;
        return answer;
    }
}