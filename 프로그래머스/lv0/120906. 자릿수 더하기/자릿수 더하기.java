class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] stringNumList = Integer.toString(n).split("");
        for (String i : stringNumList) {
            answer += Integer.parseInt(i);
        }
        return answer;
    }
}