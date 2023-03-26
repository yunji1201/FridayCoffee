package com.fridayCoffee._80_greedyBiggestNum;

import java.util.Stack;

public class GreedyBiggestNum {
    public static void main(String[] args) throws Exception {
        Solution2 solution = new Solution2();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution("654321", 3)); // 775841
        System.out.println("======================================");
    }
}

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder(number);
        int idx = 0;

        while (k > 0 && idx < answer.length() - 1) {
            if (answer.charAt(idx) < answer.charAt(idx + 1)) {
                answer.deleteCharAt(idx);
                k--;
                if (idx != 0) idx--;
            } else {
                idx++;
            }
        }
        if (k > 0) answer.delete(answer.length() - k, answer.length()); // 가장 큰 순서로 되어있을때 (예:654321) 그럴땐 그냥 잘라버리기
        return answer.toString();
    }
}

/* 위에 식이 아래 식보다 빠른 이유는
위에 식은 문자열의 길이가 길어져도 매번 최대값을 찾는 과정이 없기 때문에 시간복잡도가 적으며 입력값의 길이에 비례하는 O(n)의 시간복잡도를 가지기 때문에, 대규모 입력값에도 빠르다!
반면에
아래 방법은 선택한 숫자들을 담을 수 있는 배열이나 리스트를 사용하지 않고, 매번 문자열에서 최대값을 찾아서 answer 문자열에 추가하는 방법.
따라서 매번 최대값을 찾기 위해 반복문을 실행해야 하고, 문자열의 길이가 길어질수록 시간복잡도가 증가하며 입력값이 매우 큰 경우 메모리를 많이 사용하게 되어 성능 저하의 원인이 될 수 있음.
*/

class Solution1 {
    public String solution(String number, int k) {

        StringBuilder answer = new StringBuilder();
        int start = 0;
        int selectNum = number.length() - k;

        while (selectNum > 0) {
            int idx = start;
            char charMax = number.charAt(start);
            for (int i = start + 1; i <= number.length() - selectNum; i++) {
                if (charMax < number.charAt(i)) {
                    charMax = number.charAt(i);
                    idx = i;
                }
            }
            answer.append(charMax);
            selectNum--;
            start = idx + 1;
        }
        return answer.toString();
    }
}

// 스택 사용하는 문제 && 가장 많은 좋아요 수
class Solution2 {
    public String solution(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }
}

class Solution4 {
    public String solution(String number, int k) {
        StringBuilder builder = new StringBuilder(number);
        int length = builder.length() - k;

        for (int i = 1; i < builder.length() && builder.length() > length; i++) {
            if (builder.charAt(i) > builder.charAt(i - 1)) {
                builder.deleteCharAt(i - 1);
                i = Math.max(0, i - 2);
            }
        }
        return builder.substring(0, length);
    }
}
