import java.util.Arrays;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babyStr = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < babyStr.length; j++) {
                if (babbling[i].contains(babyStr[j])) {
                    babbling[i] = babbling[i].replaceAll(babyStr[j], "-");
                }
            }
        }
        return (int) Arrays.stream(babbling).filter(s -> s.replaceAll("-", "").trim().length() == 0).count();
    }
}