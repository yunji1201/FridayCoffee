package com.fridayCoffee._40_findNum;

public class FindNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {9, 10, 11, 8};
        System.out.println(solution.solution(232443, 4));
    }
}

class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] strArr = String.valueOf(num).split("");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(String.valueOf(k))) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}

class Solution1 {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
        // '-' 을 넣은 이유는 1부터 카운트하게 하려고.
        // 문자열 + 숫자 = 문자열변환!
    }
}

class Solution2 {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        int answer = numStr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1;
    }
}

class Solution3 {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        answer = str.indexOf(String.valueOf(k));
        if (answer < 0) {
            return answer;
        } else {
            return answer + 1;

        }

    }
}