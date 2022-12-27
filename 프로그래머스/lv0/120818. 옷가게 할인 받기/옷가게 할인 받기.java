class Solution {
    public int solution(int price) {
                return (price >= 100000) ? (price >= 300000) ? (price >= 500000) ? (int) (price - price * 0.2) : (int) (price - price * 0.1) : (int) (price - (price * 0.05)) : price;

    }
}