package com.fridayCoffee._70_lengthSlice;

import java.util.ArrayList;

public class LengthSlice {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        String[] numbers = {"10 Z 20 Z 1"};
        System.out.println(solution.solution("abc1Addfggg4556b", 6));
    }
}

class Solution {
    public ArrayList solution(String my_str, int n) {
        ArrayList answer = new ArrayList();
        String[] strArr = my_str.split("");
        int count = 0;
        String str = "";

        for (int i = 0; i < strArr.length; i++) {
           str += String.valueOf(my_str.indexOf(n));
           answer.add(str);
           str = "";

        }

        return answer;
    }
}