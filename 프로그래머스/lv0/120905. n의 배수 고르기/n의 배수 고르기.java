import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Solution {
    public List solution(int n, int[] numlist) {
        List answer = Arrays.stream(numlist).filter(i -> i%n==0).mapToObj(i -> i).collect(Collectors.toList());
        return answer;
    }
}