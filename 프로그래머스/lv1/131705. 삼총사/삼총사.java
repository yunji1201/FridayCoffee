class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int first = 0;
        
        while (first <= number.length-2) {
            for (int i = first + 1; i < number.length; i++) {
                for (int j = i + 1; j < number.length; j++) {
                    if (number[first] + number[i] + number[j] == 0) {
                        answer++;
                    }
                }
            }
            first++;
        }
        return answer;
    }
}