package com.fridayCoffee._14_hateEven;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class HateEven {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(15));
    }
}

class Solution { // 내가 푼 것
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int j = 0; j < n + 1; j++) {
            if (j % 2 != 0) {
                    answer.add(j);
                }
            }
        return answer;
    }
}

class Solution2 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}

class Solution3 {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}