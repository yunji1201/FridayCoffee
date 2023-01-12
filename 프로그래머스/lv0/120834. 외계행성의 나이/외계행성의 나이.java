class Solution {
    public String solution(int age) {
        String answer = "";
        String[] strNum = String.valueOf(age).split("");
        for (String s : strNum) {
            answer += (char) (Integer.parseInt(s) + 97);
        }
        return answer;
    }
}