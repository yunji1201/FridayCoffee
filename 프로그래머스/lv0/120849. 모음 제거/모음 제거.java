class Solution {
    public String solution(String my_string) {
        String answer = "";
        int check = 0;
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] newStr = my_string.split("");

        for (int i = 0; i < newStr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (newStr[i].equals(vowels[j]) == true) {
                    check++;
                }
            }
            if (check <= 0) {
                    answer += String.valueOf(newStr[i]);
            }
            check = 0;
        }
        return answer;
    }
}
