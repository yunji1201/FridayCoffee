class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
    boolean isFirstChar = true;
    for (char c : s.toCharArray()) {
        if (isFirstChar) {
            sb.append(Character.toUpperCase(c));
            isFirstChar = false;
        } else {
            sb.append(Character.toLowerCase(c));
        }
        if (c == ' ') {
            isFirstChar = true;
        }
    }
    return sb.toString();
    }
}