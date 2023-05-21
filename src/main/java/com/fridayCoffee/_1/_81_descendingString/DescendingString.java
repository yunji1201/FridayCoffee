package com.fridayCoffee._1._81_descendingString;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DescendingString {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution("Zbcdefg")); // gfedcbZ
        System.out.println("======================================");
    }
}

class Solution {
    public String solution(String s) {
        String[] strList = s.split("");
        Arrays.sort(strList, Collections.reverseOrder());
        return Arrays.stream(strList).collect(Collectors.joining());
    }
}

class Solution1 {
    public String reverseStr(String str) {
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Solution1 rs = new Solution1();
        System.out.println(rs.reverseStr("Zbcdefg"));
    }
}

class Solution2 {
    public String reverseStr(String str) {
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
}

class Solution3 {
    public String reverseStr(String str) {
        char[] ch = str.toCharArray();
        String lower = "";
        String upper = "";

        for (int i = 0; i < ch.length; i++) {
            int chnum = ch[i];

            if (chnum >= 65 && chnum <= 90)
                upper += ch[i];
            else
                lower += ch[i];
        }

        char[] chUpper = upper.toCharArray();
        char[] chLower = lower.toCharArray();
        upper = "";
        lower = "";

        Arrays.sort(chUpper);
        Arrays.sort(chLower);

        for (int i = chUpper.length - 1; i >= 0; i--)
            upper += chUpper[i];
        for (int i = chLower.length - 1; i >= 0; i--)
            lower += chLower[i];

        return lower + upper;
    }
}

class Solution4 {
    public String reverseStr(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        StringBuffer st = new StringBuffer(String.valueOf(ch));
        st.reverse();
        return st.toString();
    }
}

class Solution5 {
    public String reverseStr(String str) {
        String[] arry = str.split("");
        Arrays.sort(arry, Collections.reverseOrder());
        StringBuffer sb = new StringBuffer();
        for (String s : arry) {
            sb.append(s);
        }
        return sb.toString();
    }
}