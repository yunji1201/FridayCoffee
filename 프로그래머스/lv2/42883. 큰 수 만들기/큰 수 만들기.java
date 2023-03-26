class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder(number);
        int idx = 0;

        while (k > 0 && idx < answer.length() - 1) {
            if (answer.charAt(idx) < answer.charAt(idx + 1)) {
                answer.deleteCharAt(idx);
                k--;
                if (idx != 0) idx--;
            } else {
                idx++;
            }
        }
        if (k > 0) answer.delete(answer.length() - k, answer.length());
        return answer.toString();
    }
}
