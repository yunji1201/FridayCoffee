import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        ArrayList newArr = new ArrayList<>();
        List arr = IntStream.range(1, n + 1).mapToObj(k -> (n % k == 0) ? newArr.add(k) : false).collect(Collectors.toList());
        return newArr.stream().mapToInt(s -> (int) s).sum();
    }
}