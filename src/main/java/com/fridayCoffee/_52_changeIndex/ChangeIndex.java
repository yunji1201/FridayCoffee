package com.fridayCoffee._52_changeIndex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeIndex {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution.solution("I love you", 1, 2));
    }
}

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] strList = my_string.split("");
        String firstStr = strList[num1];
        strList[num1] = strList[num2];
        strList[num2] = firstStr;
        return Arrays.stream(strList).collect(Collectors.joining());
    }
}

class Solution1 { // Coleections.swap을 사용하면 List 안에 있는 데이터 순서를 변경할 수 있다!
    public String solution(String myString, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2); // list의 num1, num2의 데이터 위치 바꾸기
        return String.join("", list); // String.join으로 list를 이어붙이기
    }
}

class Solution3 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        char[] ch = my_string.toCharArray();

        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);

        answer = String.valueOf(ch); // Object의 값을 String으로 변환한다 (toString()과 비슷)
        return answer;
    }
}

class Solution4 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) answer += my_string.charAt(num2) + "";
            else if (i == num2) answer += my_string.charAt(num1) + "";
            else answer += my_string.charAt(i) + "";
        }
        return answer;
    }
}

class Solution5 {
    public String solution(String my_string, int num1, int num2) {
        char temp = my_string.charAt(num1);
        StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num1, my_string.charAt(num2));
        sb.setCharAt(num2, temp);
        return String.valueOf(sb);
    }
}
