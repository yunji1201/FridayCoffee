package com.fridayCoffee._66_hateEnglish;

import java.util.Map;

public class HateEnglish {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {};
        System.out.println(solution.solution("onetwothreefourfivesixseveneightnine"));
    }
}

class Solution {
    public long solution(String numbers) {
        numbers = numbers.replaceAll("zero", "0");
        numbers = numbers.replaceAll("one", "1");
        numbers = numbers.replaceAll("two", "2");
        numbers = numbers.replaceAll("three", "3");
        numbers = numbers.replaceAll("four", "4");
        numbers = numbers.replaceAll("five", "5");
        numbers = numbers.replaceAll("six", "6");
        numbers = numbers.replaceAll("seven", "7");
        numbers = numbers.replaceAll("eight", "8");
        numbers = numbers.replaceAll("nine", "9");
        return Long.parseLong(numbers);
    }
}

class Solution1 {
    public long solution(String numbers) {

        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);
        return answer;
    }
}

class Solution2 {
    private static final Map<String, Integer> CONTAINS = Map.of("zero", 0, "one", 1, "two", 2, "three", 3, "four", 4, "five", 5, "six", 6, "seven", 7, "eight", 8, "nine", 9);

    public long solution(String numbers) {
        StringBuilder answer = new StringBuilder();
        StringBuilder builder = new StringBuilder();
        for (String s : numbers.split("")) {
            builder.append(s);
            if (CONTAINS.containsKey(builder.toString())) {
                answer.append(CONTAINS.get(builder.toString()));
                builder = new StringBuilder();
            }
        }
        return Long.parseLong(answer.toString());
    }
}

class Solution3 {
    public long solution(String numbers) {
        long answer = 0;

        String number = "", temp = "";
        for (int i = 0; i < numbers.length(); i++) {
            number += numbers.charAt(i) + "";

            switch (number) {
                case "one":
                    temp += "1";
                    number = "";
                    break;
                case "two":
                    temp += "2";
                    number = "";
                    break;
                case "three":
                    temp += "3";
                    number = "";
                    break;
                case "four":
                    temp += "4";
                    number = "";
                    break;
                case "five":
                    temp += "5";
                    number = "";
                    break;
                case "six":
                    temp += "6";
                    number = "";
                    break;
                case "seven":
                    temp += "7";
                    number = "";
                    break;
                case "eight":
                    temp += "8";
                    number = "";
                    break;
                case "nine":
                    temp += "9";
                    number = "";
                    break;
                case "zero":
                    temp += "0";
                    number = "";
                    break;
            }
        }

        answer = Long.parseLong(temp);

        return answer;
    }
}