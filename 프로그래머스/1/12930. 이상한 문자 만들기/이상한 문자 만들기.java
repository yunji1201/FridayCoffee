class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isEven = true;

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                isEven = true;
                sb.append(ch);
            } else {
                if (isEven) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
                isEven = !isEven;
            }
        }

        return sb.toString();
    }
}
