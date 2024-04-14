import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 카드의 개수
        int M = sc.nextInt();  // 목표 수치
        int[] cards = new int[N];
        
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();  // 카드 입력 받기
        }
        
        System.out.println(findClosestSum(cards, N, M));
    }

    public static int findClosestSum(int[] cards, int N, int M) {
        Arrays.sort(cards);  // 카드를 먼저 정렬
        int bestSum = 0;
        
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum > M) break;  // 합이 M을 초과하면 더 이상 확인할 필요 없음
                    if (sum > bestSum) {
                        bestSum = sum;
                        if (bestSum == M) return M;  // 최적의 합(M)을 찾았다면 바로 반환
                    }
                }
            }
        }
        return bestSum;
    }
}