class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            for (String sp : spell) {
                word = word.replaceFirst(sp, "-");
                if (word.replaceAll("-", "").length() == 0 && spell.length == word.length()) {
                    return 1;
                }
            }
        }
        return 2;
    }
}