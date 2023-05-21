package com.fridayCoffee._1._49_SortedNumberInString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedNumberInString {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution.solution("p2o4i8gj2"));
    }
}

class Solution {
    public int[] solution(String my_string) {
        String[] numList = my_string.replaceAll("[^0-9]", "").split("");
        return Arrays.stream(numList).sorted().mapToInt(e -> Integer.parseInt(e)).toArray();
    }
}

// ** Stream에서 String을 int로 바꾸는 방법 : mapToInt(Integer::parseInt)
class Solution1 {
    public int[] solution(String myString) {
        return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}

// isDigit() 함수는 명시된 char 값이 숫자 인지 여부를 판단하여 true 또는 false 값으로 리턴
class Solution2 {
    public int[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char characterData = my_string.charAt(i);

            if (Character.isDigit(characterData)) {
                String stringData = String.valueOf(characterData);
                list.add(stringData);
            }
        }
        return list.stream().sorted().mapToInt(Integer::parseInt).toArray();
    }
}

class Solution3 {
    public ArrayList solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < my_string.length(); i++) {
            try {
                String num = my_string.substring(i, i + 1);
                Double.parseDouble(num);
                answer.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
            }
        }

        Collections.sort(answer);

        return answer;
    }
}