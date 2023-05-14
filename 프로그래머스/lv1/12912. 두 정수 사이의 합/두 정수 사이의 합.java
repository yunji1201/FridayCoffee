import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        ArrayList list = new ArrayList();
        list.add(a);
        list.add(b);

        Collections.sort(list);

        for (int i = (int) list.get(0); i < (int) list.get(1) + 1; i++) {
            answer += i;
        }
        return answer;
    }
}