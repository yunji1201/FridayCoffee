package com.fridayCoffee._1._34_rockscissorspaper;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RockScissors {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(solution.solution("205"));
    }
}

class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (String s : rsp.split("")) {
            switch (s) {
                case "2":
                    answer += "0";
                    break;
                case "5":
                    answer += "2";
                    break;
                case "0":
                    answer += "5";
                    break;
            }
        }
        return answer;
    }
}

class Solution1 {
    public String solution(String rsp) {
        return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
    }
}

class Solutio2n {
    public String solution(String rsp) {
        char[] cRsp = rsp.toCharArray();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < cRsp.length; i++) {
            switch (cRsp[i]) {
                case '0':
                    answer.append("5");
                    break;
                case '2':
                    answer.append("0");
                    break;
                case '5':
                    answer.append("2");
                    break;
            }
        }
        return answer.toString();
    }
}