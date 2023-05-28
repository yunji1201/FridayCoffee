package com.fridayCoffee._2._4_removeSmallestNum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveSmallestNum {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numbers = {4, 3, 2, 1};
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(numbers)); // 4,3,2
    }
}

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        return Arrays.stream(arr).filter(i -> i != Arrays.stream(arr).min().getAsInt()).toArray();
    }
}


// ------------------------------< 같은 풀이 더 효율적으로 >----------------------
class Solution0 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = Arrays.stream(arr).min().getAsInt();
        int count = (int) Arrays.stream(arr).filter(i -> i != min).count();

        int[] result = new int[count];
        int index = 0;

        for (int i : arr) {
            if (i != min) {
                result[index++] = i;
            }
        }

        return result;
    }
}


// ------------------------------< 다른사람 풀이 >----------------------
class Solution1 {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}

class Solution2 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        for (int i = minIndex + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}

class Solution3 {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Arrays.sort(arr);
        list.remove(list.indexOf(arr[0]));
        if (list.size() <= 0) return new int[]{-1};
        return list.stream().mapToInt(i -> i).toArray();
    }
}
