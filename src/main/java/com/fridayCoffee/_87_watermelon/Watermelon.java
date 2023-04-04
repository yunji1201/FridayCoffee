package com.fridayCoffee._87_watermelon;

public class Watermelon {
    public static void main(String[] args) throws Exception {
        Solution1 solution = new Solution1();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(4)); // "수박수박"
        System.out.println("======================================");
    }
}

class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            sb = i % 2 != 0 ? sb.append("수") : sb.append("박");
        }
        return sb.toString();
    }
}

class Solution1 {
    public String solution(int n) {
        return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n); // "\0" : null
    }
}

class Solution3 {
    public String solution(int n) {
        boolean flag = true;
        String result = "";
        while (n-- > 0) {

            result += flag ? "수" : "박";
            flag = !flag;
        }
        return result;
    }
}