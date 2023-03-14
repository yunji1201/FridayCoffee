package com.fridayCoffee._75_CaesarCode;

public class CaesarCode {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.solution("z", 1)); // "e F d"
    }
}

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] charArr = s.toCharArray();

        // 대문자일때 A는 65 Z 90
        // 소문자일때 a 97 z 122
        for (char c : charArr) {
            if (Character.isUpperCase(c)) { //대문자
                answer += c + n > 'Z' ? Character.toString(c + n - 'Z' + 'A' - 1) : Character.toString(c + n);

            } else if (Character.isLowerCase(c)) { //소문자
                answer += c + n > 'z' ? Character.toString(c + n - 'z' + 'a' - 1) : Character.toString(c + n);

            } else { //공백
                answer += c;
            }
        }
        return answer;
    }
}

class Solution1 { // 코드 간추리기
    public String solution(String s, int n) {
        String answer = "";
        char[] charArr = s.toCharArray();

        for (char c : charArr) {
            int code = c + n;
            if (Character.isUpperCase(c)) {
                answer += code > 'Z' ? Character.toString(code - 26) : Character.toString(code); // 알파벳 26개
            } else if (Character.isLowerCase(c)) {
                answer += code > 'z' ? Character.toString(code - 26) : Character.toString(code);
            } else {
                answer += c;
            }
        }
        return answer;
    }
}

class Solution2 {
    public String solution(String s, int n) {
        String result = "";
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }
}

class Solution3 {
    public String solution(String s, int _n) {
        return s.chars().map(c -> {
                    int n = _n % 26;
                    if (c >= 'a' && c <= 'z') {
                        return 'a' + (c - 'a' + n) % 26;
                    } else if (c >= 'A' && c <= 'Z') {
                        return 'A' + (c - 'A' + n) % 26;
                    } else {
                        return c;
                    }
                }).mapToObj(c -> String.valueOf((char) c))
                .reduce((a, b) -> a + b).orElse("");
    }
}

