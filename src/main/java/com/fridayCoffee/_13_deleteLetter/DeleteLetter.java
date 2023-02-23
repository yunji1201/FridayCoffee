package com.fridayCoffee._13_deleteLetter;

public class DeleteLetter {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String my_string = "abcdef";
        String letter = "f";
        System.out.println(solution.solution(my_string, letter));
    }

}

//class Solution {
//    public String solution(String my_string, String letter) {
//        return my_string.replaceAll(letter, "");
//    }
//}

class Solution {
    public String solution(String s, String letter) {
        StringBuilder sb = new StringBuilder();

        char[] arr = s.toCharArray();

        for (char ch : arr) {
            if (ch != letter.charAt(0)) { // ( )안에 숫자: 바로 문자열에서 문자의 순서
                sb.append(ch);
            }
        }


        return sb.toString();
    }
}