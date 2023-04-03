class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            sb = i % 2 != 0 ? sb.append("수") : sb.append("박");
        }
        return sb.toString();
    }
}