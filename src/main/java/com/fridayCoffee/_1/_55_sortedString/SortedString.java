package com.fridayCoffee._1._55_sortedString;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class SortedString {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {1, 2, -3, 4, -5};
        System.out.println(solution.solution("heLLo"));
    }
}

class Solution {
    public String solution(String my_string) {
        char[] charList = my_string.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(charList);
        return new StringBuffer(new String(charList)).toString();
    }
}

class Solution1 {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}

class Solution2 {
    public String solution(String my_string) {
        return my_string.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}

class Solution3 {
    public String solution(String myString) {
        return Arrays.stream(myString.toLowerCase(Locale.ROOT).split("")).sorted().collect(Collectors.joining());
    }
}

class Solution4 {
    public String solution(String my_string) {
        String answer = "";
        // char[] toChars = my_string.toLowerCase().toCharArray();
        // java.util.Arrays.sort(toChars);
        // answer = new String(toChars);
        char[] chs = new char[my_string.length()];
        chs[0] = Character.toLowerCase(my_string.charAt(0));
        for (int i = 1; i < my_string.length(); i++) {
            chs[i] = Character.toLowerCase(my_string.charAt(i));
            for (int j = i; j > 0; j--) {
                if (chs[j] < chs[j - 1]) {
                    char tmp = chs[j - 1];
                    chs[j - 1] = chs[j];
                    chs[j] = tmp;
                }
            }
        }
        answer = new String(chs);
        return answer;
    }
}

class Solution5 {
    public String solution(String my_string) {
        String answer = "";
        String[] word = my_string.toLowerCase().split("");

        Arrays.sort(word);
        for (int i = 0; i < word.length; i++) {
            answer += word[i];
        }

        return answer;
    }
}