package com.fridayCoffee._1._99_mr_kim;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MrKim {
    public void main(String[] args) throws Exception {
        Solution solution = new Solution();
        String[] seoul = {"Jane", "Kim"};
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(seoul)); // "김서방은 1에 있다"
    }
}

class Solution {
    public String solution(String[] seoul) {
        int num = Arrays.stream(seoul).collect(Collectors.toList()).indexOf("Kim");
        String answer = "김서방은 " + num + "에 있다";
        return answer;
    }
}


class FindKim {
    public String findKim(String[] seoul) {
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
    }
}

class FindKim2 {
    public String findKim(String[] seoul) {
        //x에 김서방의 위치를 저장하세요.
        int x = 0;
        while (x < seoul.length) {
            if (seoul[x] == "Kim")
                break;
            else x++;
        }
        return "김서방은 " + x + "에 있다";
    }
}