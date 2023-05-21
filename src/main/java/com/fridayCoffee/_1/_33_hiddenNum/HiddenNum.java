package com.fridayCoffee._1._33_hiddenNum;

import java.util.regex.Pattern;

public class HiddenNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(solution.solution("aAb1B2cC34oOp"));
    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] onlyNum = my_string.replaceAll("[^0-9]", "").split("");
        for (String s : onlyNum) answer += Integer.parseInt(s);
        return answer;
    }
}

class Solution1 {
    public int solution(String myString) {
        return myString
                .chars()// String.chars()`는 String의 문자들을 stream을 만들어 줌
                .mapToObj(i -> (char) i) //  mapToObj : IntStream을 Stream<String>으로 변환
                .filter(Character::isDigit)// isDigit() 함수는 명시된 char 값이 숫자 인지 여부를 판단하여 true 또는 false 값으로 리턴
                .map(String::valueOf)// Integer 인 요소들을 문자열로 바꾸기
                .mapToInt(Integer::valueOf) // String을 int로 바꾸기
                .sum(); // 모든 값 더하기
    }
}

class Solution2 {
    public int solution(String my_string) {
        int answer = 0;
        String pattern = "^[0-9]*$";
        String[] list = my_string.split("");

        for (int i = 0; i < list.length; i++) {
            if (Pattern.matches(pattern, list[i])) {
                answer += Integer.parseInt(list[i]);
            }
        }
        return answer;
    }
}

class Solution3 {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.digit(my_string.charAt(i), 10) > 0) {
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }
        return answer;
    }
}

class Solution4 {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 48 && s.charAt(i) < 58) {
                answer += Integer.parseInt("" + s.charAt(i));
            }
        }
        return answer;
    }
}