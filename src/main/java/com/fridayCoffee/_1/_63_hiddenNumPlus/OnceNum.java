package com.fridayCoffee._1._63_hiddenNumPlus;

import java.util.Arrays;
import java.util.StringTokenizer;

public class OnceNum {
    public static void main(String[] args) throws Exception {
        Solution2 solution = new Solution2();
        System.out.println(solution.solution("aAb1B2cC34oOp"));
    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split("");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].matches("[^\\d]")) {
                my_string = my_string.replace(strArr[i], ",");
            }
        }
        for (String s : my_string.split(",")) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}


class Solution1 {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for (String s : str) {
            if (!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
}

class Solution2 {
    public int solution(String my_string) {
        int answer = 0;
        String s = my_string.replaceAll("[^0-9]", " ");
        StringTokenizer st = new StringTokenizer(s, " ");
        // StringTokenizer : 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스, split이랑 비슷한 듯
        while (st.hasMoreTokens()) { // 남아있는 토큰이 있는가
            answer += Integer.parseInt(st.nextToken());
        }

        return answer;
    }
}

class Solution3 {
    public int solution(String myString) {
        return Arrays.stream(myString.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
    }
}
