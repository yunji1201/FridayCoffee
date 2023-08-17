package com.fridayCoffee._2._13_numberOfGoodPairs;

public class GoodPairs {
// https://leetcode.com/problems/number-of-good-pairs/
//A pair (i, j) is called good if nums[i] == nums[j] and i < j
//There are 4 good pairs (0,3), (0,4), (3,4), (2,5)

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println("my answer : " + solution.numIdenticalPairs(nums));
    }
}

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] numList = new int[101];
        for (int num : nums) {
            if (numList[num] > 1) {
                count += numList[num];
            }
            numList[num]++;
        }
        return count;
    }
}
