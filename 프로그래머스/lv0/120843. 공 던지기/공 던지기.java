class Solution {
    public int solution(int[] numbers, int k) {

        int count = 1;
        int answer = 1;
        int lastNum = numbers[numbers.length - 1];

        while (count < k) {
            count++;
            answer += 2;
            
            if (answer > lastNum) {
                answer -= lastNum;
            }
        }
        return answer;
    }
}