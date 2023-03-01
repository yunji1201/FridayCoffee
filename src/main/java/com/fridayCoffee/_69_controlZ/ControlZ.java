package com.fridayCoffee._69_controlZ;

import java.util.LinkedList;
import java.util.Stack;

public class ControlZ {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        String[] numbers = {"10 Z 20 Z 1"};
        System.out.println(solution.solution("10 Z 20 Z 1"));
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            answer = !arr[i].equals("Z") ? (answer += Integer.parseInt(arr[i])) : (answer -= Integer.parseInt(arr[i - 1]));
        }
        return answer;
    }
}

class Solution1 {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}

class Solution2 {
    public int solution(String s) {
        String[] sArr = s.split(" ");
        int clipBoard = 0;
        int answer = 0;

        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].equals("Z")) {
                stack.pop();
            } else {
                stack.push(sArr[i]);
            }
        }

        while (!stack.empty()) {
            answer += Integer.parseInt(stack.pop());
        }
       /* for(int i=0; i<sArr.length; i++) {
            if(sArr[i].equals("Z") ){
                answer -= clipBoard;
            } else {
                int data = Integer.parseInt(sArr[i]);
                answer += data;
                clipBoard = data;
            }
        }*/
        return answer;
    }
}

class Solution3 {
    public int solution(String s) {
        int answer = 0;

        LinkedList<Integer> numbers = new LinkedList<>();

        if (!s.isEmpty()) {
            String[] split_s = s.split(" ");

            for (int i = 0; i < split_s.length; i++) {
                if (split_s[i].equals("Z")) {
                    if (i - 1 >= 0 && numbers.size() > 0)
                        numbers.removeLast();
                } else
                    numbers.add(Integer.valueOf(split_s[i]));
            }
        }

        for (Integer number : numbers) {
            answer += number;
        }

        return answer;
    }
}

class Solution4 {
    public int solution(String s) {
        int answer = 0;
        Stack stack = new Stack();
        String[] arr = s.split(" ");

        for (String item : arr) {
            if (!item.equals("Z")) {
                stack.push(item);
            } else {
                stack.pop();
            }
        }
        int num = stack.size();
        for (int i = 0; i < num; i++) {
            answer += Integer.parseInt((String) stack.pop());
        }

        return answer;
    }
}