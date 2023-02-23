package com.fridayCoffee._35_secret;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecretCode {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(solution.solution("dfjardstddetckdaccccdegk", 4));
    }
}

class Solution { // 내가 짠 코드
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0) answer += cipher.split("")[i];
        }
        return answer;
    }
}

class Solution1 {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code; i <= cipher.length(); i = i + code) { // i = i + code
            answer += cipher.substring(i - 1, i); // 문자열 자르기 (start, end)
        }
        return answer;
    }
}

class Solution2 {
    public String solution(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(value -> value % code == code - 1) // 4번째 자릿수니까 3번 인덱스.. 이런식으로
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
    }
}

class Solution3 {
    public String solution(String cipher, int code) {
        String[] arr = cipher.split("");
        StringBuilder sb = new StringBuilder(); // stringBuilder 사용
        int x = code - 1; // 인덱스니까
        while (x < arr.length) { // while 반복
            sb.append(arr[x]);
            x += code;
        }
        return sb.toString();
    }
}

class Solution4 {
    public String solution(String cipher, int code) {
        int p = code;
        StringBuilder sb = new StringBuilder();

        while (p <= cipher.length()) {
            sb.append(cipher.charAt(p - 1));
            p += code;
        }

        return sb.toString();
    }
}

class Solution5 {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code - 1; i < cipher.length(); i += code) answer += cipher.charAt(i); // split 안쓰고 CharAt() 사용가능
        return answer;
    }
}