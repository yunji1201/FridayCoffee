package com.fridayCoffee._1._98_GetMiddleWord;

public class GetMiddleWord {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution("abcd")); // bc
        System.out.println("======================================");
    }
}

class Solution {
    public String solution(String s) {
        int halfIdx = s.length() / 2;
        return s.length() % 2 != 0 ? String.valueOf(s.charAt(halfIdx)) : String.valueOf(s.charAt(halfIdx - 1)) + String.valueOf(s.charAt(halfIdx));
    }
}

class Solution1 {
    public String solution(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}

class Solution2 {
    public String solution(String s) {
        return s != null ? s.substring((s.length() - 1) / 2, (s.length() + 2) / 2) : "";
    }
}

class Solution3 {
    public String solution(String s) {
        int a = s.length();
        String word1;
        if (a % 2 == 0)
            word1 = s.substring(a / 2 - 1, (a / 2) + 1);
        else
            word1 = s.substring((a / 2), (a / 2) + 1);
        return word1;
    }
}

class Solution4 {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        int len = ch.length;
        StringBuffer str = new StringBuffer();
        if (len % 2 == 0) {
            str.append(ch[(len / 2) - 1]);
            str.append(ch[len / 2]);
        } else
            str.append(ch[(len - 1) / 2]);
        return String.valueOf(str);
    }
}