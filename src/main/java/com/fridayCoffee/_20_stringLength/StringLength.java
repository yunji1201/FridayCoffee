package com.fridayCoffee._20_stringLength;

import java.util.ArrayList;
import java.util.Arrays;

public class StringLength {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strings = {"We", "are", "the", "world!"};
        System.out.println(solution.solution(strings));
    }
}

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}

class Solution1 {
    public int[] solution(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }
}

class Solution2 {
    public ArrayList solution(String[] strlist) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (String str : strlist) {
            answer.add(str.length());
        }
        return answer;
    }
}

class Solution3 {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).map(element -> element.length()).mapToInt(Integer::valueOf).toArray();
    }
}