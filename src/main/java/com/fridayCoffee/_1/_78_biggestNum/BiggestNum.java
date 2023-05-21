package com.fridayCoffee._1._78_biggestNum;

import java.util.*;
import java.util.stream.Collectors;

public class BiggestNum {
    public static void main(String[] args) throws Exception {
        Solution6 solution = new Solution6();
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println("======================================");
        System.out.println("my answer : " + solution.solution(numbers)); // 9534330
        System.out.println("======================================");
    }
}

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNumArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumArr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(strNumArr, ((o1, o2) -> Integer.parseInt(o2 + o1) - Integer.parseInt(o1 + o2)));

        return strNumArr[0].equals("0") ? "0" : Arrays.stream(strNumArr).collect(Collectors.joining());
    }
}

class Solution1 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNumArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumArr[i] = Integer.toString(numbers[i]);
        }

        quickSort(strNumArr);

        if (strNumArr[0].equals("0")) return "0";

        for (int i = 0; i < strNumArr.length; i++) {
            answer += strNumArr[i];
        }

        return answer;
    }

    public void quickSort(String[] arr) {
        int start = 0;
        int end = arr.length;
        quickSort(arr, start, end);
    }

    private void quickSort(String[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if (start < part2 - 1) {
            quickSort(arr, start, end);
        }
        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    public int partition(String[] arr, int start, int end) {
        String pivot = arr[(start + end) / 2];

        while (start <= end) {
            while (Integer.parseInt(arr[start] + pivot) > Integer.parseInt(pivot + arr[start])) end--;
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public void swap(String[] arr, int start, int end) {
        String temp = arr[start];
        arr[start] = arr[end - 1];
        arr[end - 1] = temp;
    }
}

class Solution2 {
    public String solution(int[] numbers) {
        String answer = "";

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, (a, b) -> {
            String as = String.valueOf(a), bs = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i);
        }
        answer = sb.toString();
        if (answer.charAt(0) == '0') {
            return "0";
        } else {
            return answer;
        }
    }
}

class Solution3 {
    public String solution(int[] numbers) {
        String[] nums = new String[numbers.length];

        for (int i = 0; i < nums.length; i++)
            nums[i] = numbers[i] + "";

        Arrays.sort(nums, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        String ans = "";
        for (int i = 0; i < numbers.length; i++)
            ans += nums[i];

        return ans.charAt(0) == '0' ? "0" : ans;
    }
}

class Solution4 {
    public String solution(int[] numbers) {
        String answer = "";
        answer = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> -s1.concat(s2).compareTo(s2.concat(s1)))
                .reduce("", (s1, s2) -> s1.equals("0") && s2.equals("0") ? "0" : s1.concat(s2));
        return answer;
    }
}

class Solution5 {
    public String solution(int[] numbers) {
        List<String> result = Arrays.stream(numbers).mapToObj(n -> String.valueOf(n)).collect(Collectors.toList());
        Collections.sort(result, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if (result.get(0).equals("0")) {
            return "0";
        }

        return result.stream().collect(Collectors.joining());
    }
}

class Solution6 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];

        /* to string */
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                int len1 = str1.length();
                int len2 = str2.length();

                /* 다를 경우 */
                for (int i = 0; i < (len1 * len2); i++) {
                    if (str1.charAt(i % len1) > str2.charAt(i % len2)) {
                        return -1;
                    } else if (str1.charAt(i % len1) < str2.charAt(i % len2)) {
                        return 1;
                    }
                }
                return 1;
            }
        });

        /* String Build */
        StringBuilder str = new StringBuilder();

        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (flag && arr[i].equals("0")) {

            } else {
                str.append(arr[i]);
                flag = false;
            }
        }

        if (str.toString().equals("")) {
            return "0";
        }

        answer = str.toString();

        return answer;
    }
}