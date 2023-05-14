class Solution {
    public String solution(String s) {
        int halfIdx = s.length() / 2;
        return s.length() % 2 != 0 ? String.valueOf(s.charAt(halfIdx)) : String.valueOf(s.charAt(halfIdx - 1)) + String.valueOf(s.charAt(halfIdx));
    }
}