import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 카드의 수
        int M = sc.nextInt();  // 목표 수치
        int[] cards = new int[N];
        
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }
        
        int result = searchBestSum(cards, N, M);
        System.out.println(result);
    }

    private static int searchBestSum(int[] cards, int N, int M) {
        int bestSum = 0;
        
        // 모든 3장의 카드 조합을 찾아보기
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    // 합이 M을 넘지 않으면서, 현재까지의 최적값보다 더 크다면 업데이트
                    if (sum <= M && sum > bestSum) {
                        bestSum = sum;
                    }
                }
            }
        }
        
        return bestSum;
    }
}
