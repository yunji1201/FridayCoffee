package com.fridayCoffee._28_arraySimillar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _27_buyingClothes {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = {0, 0, 1, 5, 6, 321, 123, 31, 12};
        String[] strings = {"a", "b", "c"};
        String[] strings2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution.solution(strings, strings2));
    }
}

class Solution1 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String str : s1) {
            for (String str2 : s2) {
                if (str2.equals(str)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        List<String> list1 = Arrays.asList(s1);
        List<String> list2 = Arrays.asList(s2);

        list1 = list1.stream().filter(one -> list2.stream().filter(
                two -> two.contentEquals(one)
        ).findAny().isPresent()).collect(Collectors.toList());

        return list1.size();
    }
}

class Solution2 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> stringList = Arrays.stream(s1).collect(Collectors.toList());

        for (String string : s2) {
            if (stringList.contains(string)) answer++;
        }
        return answer;
    }
}

class Solution3 {

    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> set = new HashSet<>(List.of(s1));
        for (String s : s2) {
            if (set.contains(s)) {
                answer++;
            }
        }
        return answer;
    }
}

class Solution4 {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        return (int) Arrays.stream(s2).filter(set::contains).count();
    }
}

class Solution5 {
    public int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s)).filter(b -> b).count();
    }
}