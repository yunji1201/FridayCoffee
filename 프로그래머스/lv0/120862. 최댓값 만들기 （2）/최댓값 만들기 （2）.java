import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int max1 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int max2 = numbers[0] * numbers[1];
        return max1 > max2 ? max1 : max2;
    }
}