package com.fridayCoffee._29_deleteBundle;

public class DeleteVowels {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {0, 0, 1, 5, 6, 321, 123, 31, 12};
        System.out.println(solution.solution("nice to meet you"));
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int check = 0;
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] newStr = my_string.replace(" ", "").split("");

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

class Solution1 {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}

class Solution2 {
    public String solution(String my_string) {
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        for (String vowel : vowels) {
            if (my_string.contains(vowel)) {
                my_string = my_string.replace(vowel, "");
            }
        }
        return my_string;
    }
}

class Solution3 {
    public String solution(String myString) {
        return myString.replaceAll("a|e|i|o|u", "");
    }
}

class Solution4 {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}