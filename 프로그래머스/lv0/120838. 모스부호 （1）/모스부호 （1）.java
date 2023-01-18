import java.util.ArrayList;
class Solution {
    public String solution(String letter) {
        String answer = "";
        ArrayList strAnswer = new ArrayList<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String s : letter.split(" ")) {
            for (int i = 0; i < morse.length; i++) {
                if (s.equals(morse[i])) {
                    strAnswer.add(i);
                }
            }
        }
        for (Object str : strAnswer) {
            answer += (char) (((Integer) str).intValue() + 97);
        }
        return answer;
    }
}