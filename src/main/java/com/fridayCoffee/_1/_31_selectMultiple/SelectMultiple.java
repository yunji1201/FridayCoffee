package com.fridayCoffee._1._31_selectMultiple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SelectMultiple {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(solution.solution(3, numbers));
    }
}

class Solution {
    public List solution(int n, int[] numlist) {
        List answer = Arrays.stream(numlist).filter(i -> i % n == 0).mapToObj(i -> i).collect(Collectors.toList());
        return answer;
    }
}

class Solution1 {
    public int[] solution(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
}

class Solution2 {
    public int[] solution(int n, int[] numlist) {

        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                List.add(numlist[i]);
            }
        }
        int[] answer = new int[List.size()];
        for (int i = 0; i < List.size(); i++) {
            answer[i] = List.get(i);
        }
        return answer;
    }
}

class Solution3 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                answer.add(num);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}

class Solution4 {

    public int[] solution(int n, int[] numlist) {
        List<Integer> answerList = new ArrayList<Integer>();
        for (Integer i : numlist) {
            if (i % n == 0) {
                answerList.add(i);
            }
        }
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }

}