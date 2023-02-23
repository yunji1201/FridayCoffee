package com.fridayCoffee._60_closerNum;

import java.util.Arrays;

public class CloserNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numbers = {3, 10, 28};
        System.out.println(solution.solution(numbers, 20));
    }
}

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = n;
        Arrays.sort(newArray);
        int index = Arrays.binarySearch(newArray, n);
//        int index = Arrays.asList(newArray).indexOf(n);
        int front = newArray[index - 1];
        int back = newArray[index + 1];
        int absFront = Math.abs(front);
        int absBack = Math.abs(back);
        if(absBack == absFront){
            return answer = front;
        } else {
            if(absFront < absBack){
                return answer = front;
            } else {
                return  answer = back;
            }
        }
//        return absBack == absFront ? answer = front : absFront < absBack ? answer = front : answer = back ;
    }
}

class Solution1 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int count = 0;
        int[] numGap = new int[array.length];
        for (int i = 0; i < numGap.length; i++) {
            numGap[i] = Math.abs(array[i] - n);
        }
        Arrays.stream(numGap).sorted();
        int gap = numGap[numGap.length - 1];
        for (int i : array) {
            if (i == n + gap) {
                answer = n + gap;
                count++;
            }
            if (count >= 1) return n - gap;
        }
        return answer = n - gap;

    }
}

