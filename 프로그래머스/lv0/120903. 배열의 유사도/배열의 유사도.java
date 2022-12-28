class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String str : s1) {
            for (String str2 : s2) {
                if (str2.equals(str)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}