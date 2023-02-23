package com.fridayCoffee._22_flipString;

public class FlipString {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {1, 7, 2, 11, 10};
        System.out.println(solution.solution("jaron"));
    }

}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int l = 0;
        String[] str = my_string.split("");
        String[] str2 = new String[my_string.length()];
        for (int i = str.length - 1; i >= 0; i--) {
            for (int k = l; k < str.length; k++) {
                str2[k] = str[i];
                l++;
                break;
            }
        }
        for (String s : str2) {
            answer += s;
        }
        return answer;
    }
}

class Solution1 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        return sb.toString();
    }
}

class Solution2 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}

class Solution8 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) answer += my_string.charAt(my_string.length() - i - 1);
        return answer;
    }
}