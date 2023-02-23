package com.fridayCoffee._30_upperLower;

import java.util.Locale;
import java.util.stream.Collectors;

public class UpperLowerCase {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {0, 0, 1, 5, 6, 321, 123, 31, 12};
        System.out.println(solution.solution("abCdEfghIJ"));
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (String s : my_string.split("")) {
            answer += (s.equals(s.toLowerCase(Locale.ROOT))) ? s.toUpperCase(Locale.ROOT) : s.toLowerCase(Locale.ROOT);
        }
        return answer;
    }
}

class Solution1 {
    public String solution(String myString) {
        return myString.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
    }
    // String.chars()를 이용하면 IntStream을 생성
    // 기본형 스트림을 Stream<T>로 변환할때에는 mapToObj()를, Stream<Integer>로 변환 할 때에는 boxed()를 사용하면 된다
    // Stream.collect(). collect()는 Stream의 데이터를 변형 등의 처리를 하고 원하는 자료형으로 변환
    // Collectors.joining() : Collector 입력 요소를 단일 문자열로 연결
}

class Solution2 {
    public String solution(String s) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                answer += (char) (s.charAt(i) - 32);
            } else if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                answer += (char) (s.charAt(i) + 32);
            } else {
                answer += s.charAt(i);
            }
        }

        return answer;
    }
}

class Solution3 {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'a' && c <= 'z') c -= 32;
            else if (c >= 'A' && c <= 'Z') c += 32;
            answer += c;

        }

        return answer;
    }
}

class Solution4 {
    final int A_CHAR_NUMBER = (int) 'A';
    final int Z_CHAR_NUMBER = (int) 'Z';
    final int a_CHAR_NUMBER = (int) 'a';
    final int z_CHAR_NUMBER = (int) 'z';
    final int CHAR_NUMBER_GAP = (int) 'a' - (int) 'A';

    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            int charNum = (int) my_string.charAt(i);

            if (charNum >= a_CHAR_NUMBER && charNum <= z_CHAR_NUMBER) {
                sb.append((char) (charNum - CHAR_NUMBER_GAP));
            } else {
                sb.append((char) (charNum + CHAR_NUMBER_GAP));
            }
        }

        return sb.toString();
    }
}