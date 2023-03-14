class Solution {
    public int solution(int[] common) {
        int d = common[1] - common[0];
        int last = common[common.length - 1];
        return d == common[2] - common[1] ? last + d : last *  common[1] / common[0];
    }
}