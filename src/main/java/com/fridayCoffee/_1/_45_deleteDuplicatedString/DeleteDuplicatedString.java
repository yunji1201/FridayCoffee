package com.fridayCoffee._1._45_deleteDuplicatedString;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DeleteDuplicatedString {
    public static void main(String[] args) throws Exception {
        Solution2 solution = new Solution2();
//        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution.solution("people"));
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (String s : my_string.split("")) {
            if (!answer.contains(s)) answer += s;
        }
        return answer;
    }
}

class Solution1 {
    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());
    }
}

class Solution2 {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
        return String.join("", set);
    }
}

class Solution3 {
    public String solution(String myString) {
        return Arrays.stream(myString.split("")).distinct().collect(Collectors.joining());
    }
}

class Solution4 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        while (my_string.length() > 0) {
            sb.append(my_string.charAt(0));
            my_string = my_string.replaceAll(my_string.substring(0, 1), "");
        }
        return sb.toString();
    }
}