
import java.util.Arrays;
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