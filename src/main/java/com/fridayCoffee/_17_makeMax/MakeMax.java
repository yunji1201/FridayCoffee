package com.fridayCoffee._17_makeMax;

import java.util.Arrays;
import java.util.Comparator;

public class MakeMax {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 5};
        System.out.println(solution.solution(numbers));
    }

}

class Solution {

    public int solution(int[] numbers) {
        int k = 0;
        int count = 0;

        int max1 = Arrays.stream(numbers).max().getAsInt();

        for (int i : numbers) {
            if (i == max1) {
                count++;
            }
            if (count > 1) {
                return max1 * max1;
            }
        }

        int[] numbers2 = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != max1) {
                numbers2[k] = numbers[i];
                k++;
            }
        }

        int max2 = Arrays.stream(numbers2).max().getAsInt();

        return max1 * max2;
    }
}

class Solution2 {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}

class Solution3 {
    public int solution(int[] numbers) {

        // reverse sort
        numbers = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int answer = numbers[0] * numbers[1];
        return answer;
    }
}

class Solution4 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int firstMaxValue = numbers[numbers.length - 1];
        int secondMaxValue = numbers[numbers.length - 2];

        return firstMaxValue * secondMaxValue;
    }
}

class Solution5 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
