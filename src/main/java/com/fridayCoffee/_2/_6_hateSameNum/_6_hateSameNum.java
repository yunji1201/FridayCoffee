package com.fridayCoffee._2._6_hateSameNum;


import java.util.ArrayList;
import java.util.stream.Collectors;

public class _6_hateSameNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(arr)); // {1,3,0,1}
    }
}

class Solution {
    public int[] solution(int[] arr) {
        ArrayList answer = new ArrayList();

        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                answer.add(arr[i]);
            }
        }
        return answer.stream().mapToInt(i -> (int) i).toArray();
    }
}

class Solution1 {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}