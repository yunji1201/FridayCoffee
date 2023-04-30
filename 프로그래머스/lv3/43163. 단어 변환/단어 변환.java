class Solution {
    static boolean[] visited;
    static int answer = 0;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length]; // 체크했는지 확인
        dfs(begin, target, words, 0);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) { // 원하는 단어랑 동일해졌을 때
            answer = cnt; // 횟수를 answer에 담고 리턴한다
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) { // 체크된 단어 즉, 이미 쓴 단어는 돌아간다.
                continue;
            }

            int k = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) { // 단어끼리 비교해서
                    k++; // 다른 알파벳이 몇개인지 확인하기
                }
            }

            if (k == begin.length() - 1) {  // 위에서 확인했을 시, 다른 단어 개수가 1이면 변환가능한 단어
                visited[i] = true; // 탐색한걸로 표시하고
                dfs(words[i], target, words, cnt + 1); // dfs 탐색 돌리기
                visited[i] = false;
            }
        }
    }
}