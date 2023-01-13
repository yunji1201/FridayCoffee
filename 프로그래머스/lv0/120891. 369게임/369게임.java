class Solution {
    public int solution(int order) {
        int answer = 0;
        for (String s : String.valueOf(order).split("")) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) {
                answer++;
            }

        }
        return answer;
    }
}