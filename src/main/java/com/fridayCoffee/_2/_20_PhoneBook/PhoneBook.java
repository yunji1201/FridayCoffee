package com.fridayCoffee._2._20_PhoneBook;

import java.util.Arrays;
import java.util.HashSet;

public class PhoneBook {

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println("my answer : " + solution.solution(phone_book)); // [19, 15, 6]
    }
}

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> hashSet = new HashSet<>(); // 이미 검사한 전화번호 저장

        for (String number : phone_book) {
            for (int i = 1; i <= number.length(); i++) {
                String prefix = number.substring(0, i); // 123 이라면 1,12,123 이렇게
                if (hashSet.contains(prefix)) {
                    return false;
                }
            }
            hashSet.add(number);
        }

        return true;
    }
}