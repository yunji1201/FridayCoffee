class Solution { 
    public String solution(String s, int n) {
        String answer = "";
        char[] charArr = s.toCharArray();

        for (char c : charArr) {
            int code = c + n;
            if (Character.isUpperCase(c)) {
                answer += code > 90 ? Character.toString(code - 26) : Character.toString(code);
            } else if (Character.isLowerCase(c)) {
                answer += code > 122 ? Character.toString(code - 26) : Character.toString(code);
            } else {
                answer += c;
            }
        }
        return answer;
    }
}