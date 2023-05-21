package com.fridayCoffee._1._38_planet;

import java.util.stream.Collectors;

public class Planet {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {9, 10, 11, 8};
        System.out.println(solution.solution(23)); // "cd"
    }
}

class Solution {
    public String solution(int age) {
//        String answer2 = String.valueOf(age).chars().mapToObj(c -> String.valueOf((char) (49 + c))).collect(Collectors.joining());
        String answer = "";
        String[] strNum = String.valueOf(age).split("");
        for (String s : strNum) {
            answer += (char) (Integer.parseInt(s) + 97);
        }
        return answer;
    }
}

class Solution1 {
    public String solution(int age) {
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
}

class Solution2 {
    public String solution(int age) {
        String answer = "";
        String[] alpha = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        while (age > 0) {
            answer = alpha[age % 10] + answer;
            age /= 10;
        }
        return answer;
    }
}

class Solution3 {
    public String solution(int age) {
        String ageToOutsideAge = Integer.toString(age);
        String result = "";
        for (int i = 0; i < ageToOutsideAge.length(); i++) {
            result += (char) (ageToOutsideAge.charAt(i) + 49);
        }
        return result;
    }
}

class Solution4 {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        while (age > 0) {
            sb.insert(0, (char) ((age % 10) + (int) 'a'));
            age /= 10;
        }
        return sb.toString();
    }
}

class Solution5 {
    public String solution(int age) {
        String ta = String.valueOf(age);
        int diff = (int) Math.abs('a' - '0');
        String answer = "";
        for (int i = 0; i < ta.length(); i++) {
            answer += (char) (ta.charAt(i) + diff);
        }
        return answer;
    }
}