class Solution {
    int answer = 0;
    int student = 0;
    int start = 0;
    int[] selected = new int[3];

    public int solution(int[] number) {

        dfs(number, student, selected, start);
        return answer;
    }

    private void dfs(int[] number, int student, int[] selected, int start) {
        if (student == 3) {
            if (selected[0] + selected[1] + selected[2] == 0) {
                answer++;
            }
            return;
        }

        for (int i = start; i < number.length; i++) {
            selected[student] = number[i];
            dfs(number, student + 1, selected, i + 1);
            selected[student] = 0;
        }
    }
}
