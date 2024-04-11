class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        
        for (int W = 3; W <= total/W; W++) {
            if (total % W == 0) {
                int H = total / W;
                // yellow 사각형을 감싸는 조건 확인
                if ((W - 2) * (H - 2) == yellow) {
                    // 카펫의 가로 길이가 세로 길이와 같거나 더 길도록 배열 반환
                    return W >= H ? new int[]{W, H} : new int[]{H, W};
                }
            }
        }
        return new int[]{0, 0}; // 조건을 만족하지 않는 경우
    }
}
