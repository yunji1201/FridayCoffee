package com.fridayCoffee._88_maxAndMin;

import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution("-1 -2 -3 4")); // "1 4"
        System.out.println("======================================");
    }
}

class Solution {
    public String solution(String s) {
        int[] list = Arrays.stream(s.split(" ")).mapToInt(i -> Integer.parseInt(i)).sorted().toArray();
        return String.valueOf(list[0]) + " " + String.valueOf(list[list.length - 1]);
    }
}

class Solution1 {
    public String solution(String s) {
        String answer = "";
        String[] strList = s.split(" ");
        int[] list = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            list[i] = Integer.parseInt(strList[i]);
        }
        Arrays.sort(list);
        answer = String.valueOf(list[0]) + " " + String.valueOf(list[list.length - 1]);
        return answer;
    }
}

class Solution2 {
    public String solution(String str) {
        String[] tmp = str.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
            n = Integer.parseInt(tmp[i]);
            if (min > n) min = n;
            if (max < n) max = n;
        }

        return min + " " + max;

    }
}

class Solution5 {
    public String solution(String str) {
        String[] arrStr = str.split(" ");
        int[] arrInt = new int[arrStr.length];
        int i = 0;
        for (String part : arrStr) {
            arrInt[i] = Integer.parseInt(part);
            i++;
        }

        StringBuffer sb = new StringBuffer();
        sb.append(Arrays.stream(arrInt).min().getAsInt());
        sb.append(" ");
        sb.append(Arrays.stream(arrInt).max().getAsInt());

        return sb.toString();
    }
}