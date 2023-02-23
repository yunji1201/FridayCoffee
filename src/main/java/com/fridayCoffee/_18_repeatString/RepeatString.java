package com.fridayCoffee._18_repeatString;

public class RepeatString {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {0, 31, 24, 10, 1, 9};
        System.out.println(solution.solution("hello", 3));
    }
}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] splitString = my_string.split("");
        for (String s : splitString) {
            for (int i = 0; i < n; i++) {
                answer += s;
            }
        }
        return answer;
    }
}

class Solution1 {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}

class Solution2 {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for (int i = 0; i < my_string.length(); i++) {
            answer += str[i].repeat(n);
        }
        return answer;
    }
}

class Solution3 {
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}

class Solution4 {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < n; j++)
                answer += my_string.substring(i, i + 1);
        }

        System.out.println(answer);

        return answer;
    }
}

class Solution5 {
    public String solution(String my_string, int n) {
        String answer = "";

        for (char ch : my_string.toCharArray()) {
            String str = "";
            answer += (str + ch).repeat(n);
        }
        return answer;
    }
}