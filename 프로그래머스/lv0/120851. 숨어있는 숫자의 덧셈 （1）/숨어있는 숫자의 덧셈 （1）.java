class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] onlyNum = my_string.replaceAll("[^0-9]", "").split("");
        for (String s : onlyNum) answer += Integer.parseInt(s);
        return answer;
    }
}