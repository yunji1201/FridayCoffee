
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {

        String[] strNumArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumArr[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(strNumArr, ((o1, o2) -> Integer.parseInt(o2 + o1) - Integer.parseInt(o1 + o2)));

        return strNumArr[0].equals("0") ? "0" : Arrays.stream(strNumArr).collect(Collectors.joining());

    }
}