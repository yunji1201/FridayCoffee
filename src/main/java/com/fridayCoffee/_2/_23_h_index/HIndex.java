package com.fridayCoffee._2._23_h_index;

import java.util.Arrays;

public class HIndex {

    public void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println("my answer : " + solution.solution(citations)); // 3
    }


    class Solution {
        public int solution(int[] citations) {
            Arrays.sort(citations);
            int hindex = 0;

            for (int i = citations.length - 1; i >= 0; i--) { // 위부터 돌면서 확인
                int h = citations.length - i; // 몇 번 이상 인용되었나

                if (citations[i] >= h) { // 그 수 이상이어야 하니까
                    hindex = h;
                }
            }
            return hindex;
        }
    }

    // 다른 사람 풀이
    class Solution1 {

        public int solution(int[] citations) {
            Arrays.sort(citations);

            int max = 0;
            for (int i = citations.length - 1; i > -1; i--) {
                int min = (int) Math.min(citations[i], citations.length - i);
                if (max < min) max = min;
            }

            return max;
        }
    }
}
