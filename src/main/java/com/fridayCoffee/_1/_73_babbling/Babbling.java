package com.fridayCoffee._1._73_babbling;

import java.util.Arrays;

public class Babbling {
    public static void main(String[] args) throws Exception {
        Solution4 solution = new Solution4();
        String[] numbers = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution.solution(numbers));
    }
}

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babyStr = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < babyStr.length; j++) {
                if (babbling[i].contains(babyStr[j])) {
                    babbling[i] = babbling[i].replaceAll(babyStr[j], "-");
                }
            }
        }
        return (int) Arrays.stream(babbling).filter(s -> s.replaceAll("-", "").trim().length() == 0).count();
    }
}

// 정규식
class Solution1 {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
//                "^" : 문자열 시작
//                "(?!...)" : 전방 탐색 - 이어지는 문자열이 (...)과 일치하지 않는 경우에만 매칭
//                "aya(?!aya)" : "aya"로 시작하지만, "aya" 뒤에 또 다시 "aya"가 나오지 않는 경우를 매칭 ("ayaya" 안되도록)
//                "+" : 앞의 표현식이 하나 이상 연속으로 나오는 경우 매칭
//                "$" : 문자열 끝
                answer++;
            }
        }
        return answer;
    }
}

// for문 돌면서 한번씩 모두 replace 하기
class Solution2 {
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            if (babbling[i].isEmpty()) {
                answer = answer + 1;
            }
        }

        return answer;
    }
}

// for문 돌면서 한번씩 모두 replace 하기
class Solution3 {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            if (s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
                continue;
            }
            String result = s.replaceAll("aya", "").replaceAll("ye", "").replaceAll("woo", "").replaceAll("ma", "");

            if (result.length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}

class Solution4 {

    final String[] WORD = {"aya", "ye", "woo", "ma"};

    public int solution(String[] param) {
        return (int) Arrays.stream(param).filter(i -> checkWord(replaceWord(i))).count();
    }

    // 발화 가능한 단어를 연산에 용이하도록 수정
    String replaceWord(String param) {
        for (int i = 0; i < 4; i++) {
            param = param.replace(WORD[i], Integer.toString(i));
        }

        return param;
    }

    // 연속된 단어, 발화 가능한 단어인지 확인
    boolean checkWord(String param) {
        if (param.replaceAll("[0-3]", "").length() == 0) {
            char target = param.charAt(0);

            for (int i = 1; i < param.length(); i++) {
                if (target == param.charAt(i)) {
                    return false;
                } else {
                    target = param.charAt(i);
                }
            }
            return true;
        }
        return false;
    }

}