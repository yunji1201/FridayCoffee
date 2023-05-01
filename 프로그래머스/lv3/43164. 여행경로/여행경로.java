import java.util.ArrayList;
import java.util.Collections;

class Solution {
    boolean[] used;
    // 사용한 티켓 체크하기 - 일반 dfs 문제에서 visited 하는거
    ArrayList<String> answers; // 모든 루트를 저장하기 (루트가 여러개일 수 있으니까)

    public String[] solution(String[][] tickets) {
        used = new boolean[tickets.length];
        answers = new ArrayList<String>();

        int count = 0;
        // 공항 돈 수만큼 카운팅하기

        dfs(count, "ICN", "ICN", tickets);
        // 맨 처음은 ICN에서 출발하기

        Collections.sort(answers);
        // 알파벳 순서가 앞서는 경로로 정렬해야하니까

        String[] answer = answers.get(0).split(" ");
        // 가장 빠른 배열

        return answer;
    }

    public void dfs(int count, String start, String answer, String[][] ticktes) {
        if (count == ticktes.length) {
            // 모든 공항 갔는지 확인하기
            answers.add(answer);
            // 모든 곳에 갔으면 끝이니까 answers에 추가
            return;
        }

        for (int i = 0; i < ticktes.length; i++) {
            if (!used[i] && ticktes[i][0].equals(start)) {
                // 이미 used 하지 않고, start(내가 출발하려는 공항)과 같다면?

                used[i] = true;
                // 사용하기

                dfs(count + 1, ticktes[i][1], answer + " " + ticktes[i][1], ticktes);
                // 재귀호출
                // (1) 카운트를 하나 더하고
                // (2) 도착지를 출발지로 설정하고
                // (3) answer에 도착지 더해주고

                used[i] = false;
            }
        }
        return;
    }
}