package com.fridayCoffee._26_StringinString;

public class StringinString {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {0, 0, 1, 5, 6, 321, 123, 31, 12};
        System.out.println(solution.solution("ab6CDE443fgh22iJKlmn1o", ""));
    }
}

class Solution {
    public int solution(String str1, String str2) {
        if (str1.contains(str2)) {
            return 1;
        } else {
            return 2;
        }
    }
}

class Solution1 {
    public int solution(String str1, String str2) {
        return (str1.contains(str2) ? 1 : 2);
    }
}

class Solution2 {
    public int solution(String str1, String str2) {
        return str1.indexOf(str2) > -1 ? 1 : 2;
    }
}

class Solution3 {
    public int solution(String str1, String str2) {
        int answer = 0;

        boolean result = false;
        for (int i = 0; i < str1.length(); i++) {
            char chr = str1.charAt(i);

            if (chr == str2.charAt(0)) {
                int len = i + str2.length();
                String str = (len < str1.length() ? str1.substring(i, len) : str1.substring(i));

                if (str.equals(str2)) {
                    result = true;
                    break;
                }
            }
        }

        if (result) answer = 1;
        else answer = 2;

        return answer;
    }
}