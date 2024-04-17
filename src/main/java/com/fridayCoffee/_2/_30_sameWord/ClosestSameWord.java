package com.fridayCoffee._2._30_sameWord;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClosestSameWord {

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution("banana")); // {-1, -1, -1, 2, 2, 2}
    }
}

// 내 풀이
class Solution {
    public int[] solution(String s) {

        char[] charArr = s.toCharArray();
        String[] checkedCharArr = new String[charArr.length];
        Map<Character, Integer> lastPositionMap = new HashMap<>();
        int[] answer = new int[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            char currentChar = s.charAt(i);
            if (lastPositionMap.containsKey(currentChar)) {
                answer[i] = i - lastPositionMap.get(currentChar);
            } else {
                answer[i] = -1;
            }
            lastPositionMap.put(currentChar, i);
        }
        return answer;
    }
}


// 다른 사람들 풀이
class Solution1 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            answer[i] = i - map.getOrDefault(ch, i + 1);
            /*
             * map.getOrDefault(ch, i + 1)
             * => h라는 키에 대한 값이 맵에 있으면 그 값을, 없으면 i + 1을 반환
             * i + 1을 기본값으로 사용하는 이유는, 맵에 값이 없을 경우 i - (i + 1) 즉, -1을 결과로 얻기 위함
             * 이는 해당 문자가 처음 나타났음을 의미합니다.
             *
             * answer[i]에는 현재 인덱스 i에서 맵에 저장된 ch의 마지막 위치를 빼준 값을 저장
             * 이 값은 ch 문자가 마지막으로 나타난 위치와 현재 위치의 차이를 나타내며, 처음 나타나면 -1이 됩니다.
             * */
            map.put(ch, i);
        }
        return answer;
    }
}


class Solution2 {
    public int[] solution(String str) {
        int[] result = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {

            String subStr = str.substring(0, i);
            if (subStr.indexOf(str.charAt(i)) == -1) {
                result[i] = -1;
            } else {
                result[i] = i - subStr.lastIndexOf(str.charAt(i));
            }
        }
        return result;
    }
}


/*
* 종합 평가
첫 번째 풀이와 Solution1은 둘 다 매우 효율적이며, 시간 복잡도 O(n)을 가집니다. Solution1은 코드가 더 간결하므로 이해하기 쉽습니다.
Solution2는 매우 비효율적이며, 실제 사용 환경에서는 성능 문제가 발생할 수 있습니다.
따라서, Solution1이 코드의 간결성과 효율성을 동시에 갖추고 있어 가장 우수한 방법으로 평가됩니다.
첫 번째 풀이는 구현이 정확하며, 문제 요구사항을 잘 충족시킵니다. 그러나 코드의 간결성을 높이는 Solution1의 접근 방식을 적극적으로 고려해 볼 가치가 있습니다.
* */

