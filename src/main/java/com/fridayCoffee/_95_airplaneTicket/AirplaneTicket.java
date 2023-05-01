package com.fridayCoffee._95_airplaneTicket;

import java.util.*;

public class AirplaneTicket {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println("======================================");
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        System.out.println("my answer : " + solution.solution(tickets)); // ["ICN", "JFK", "HND", "IAD"]
        System.out.println("======================================");
    }
}

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

class Solution1 {
    List<Stack<String>> result;
    String[][] tickets;

    public String[] solution(String[][] tickets) {
        result = new ArrayList<>();
        this.tickets = tickets;

        boolean[] visited = new boolean[tickets.length];
        Stack<String> st = new Stack<>();
        st.push("ICN");

        dfs(visited, st, 0);

        if (result.size() > 1) {
            Collections.sort(result, new Comparator<Stack<String>>() {
                @Override
                public int compare(Stack<String> o1, Stack<String> o2) {
                    for (int i = 0; i < o1.size(); i++) {
                        String s1 = o1.get(i);
                        String s2 = o2.get(i);

                        if (!s1.equals(s2)) {
                            return s1.compareTo(s2);
                        }
                    }

                    return 0;
                }
            });
        }

        Stack<String> res = result.remove(0);
        String[] answer = new String[res.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = res.get(i);
        }

        return answer;
    }

    public void dfs(boolean[] visited, Stack<String> st, int len) {
        if (len == tickets.length) {
            Stack<String> res = new Stack<>();
            for (String s : st) {
                res.push(s);
            }

            result.add(res);
            return;
        }

        String arrive = st.peek();

        for (int i = 0; i < tickets.length; i++) {
            String[] tic = tickets[i];

            if (!visited[i] && arrive.equals(tic[0])) {
                st.push(tic[1]);
                visited[i] = true;

                dfs(visited, st, len + 1);

                visited[i] = false;
                st.pop();
            }
        }
    }
}

class Solution2 {
    List<Stack<String>> result;
    String[][] tickets;

    public String[] solution(String[][] tickets) {
        result = new ArrayList<>();
        this.tickets = tickets;

        boolean[] visited = new boolean[tickets.length];
        Stack<String> st = new Stack<>();
        st.push("ICN");

        dfs(visited, st, 0);

        if (result.size() > 1) {
            Collections.sort(result, (Stack<String> o1, Stack<String> o2) -> {
                for (int i = 0; i < o1.size(); i++) {
                    String s1 = o1.get(i);
                    String s2 = o2.get(i);

                    if (!s1.equals(s2)) {
                        return s1.compareTo(s2);
                    }
                }

                return 0;
            });
        }

        String[] answer = result.get(0).stream().toArray(String[]::new);
        return answer;
    }

    public void dfs(boolean[] visited, Stack<String> st, int len) {
        if (len == tickets.length) {
            Stack<String> res = new Stack<>();
            for (String s : st) {
                res.push(s);
            }

            result.add(res);
            return;
        }

        String arrive = st.peek();

        for (int i = 0; i < tickets.length; i++) {
            String[] tic = tickets[i];

            if (!visited[i] && arrive.equals(tic[0])) {
                st.push(tic[1]);
                visited[i] = true;

                dfs(visited, st, len + 1);

                visited[i] = false;
                st.pop();
            }
        }
    }
}

class Solution3 {
    public String[] solution(String[][] tickets) {
        List<String[]> list = new ArrayList<>(Arrays.asList(tickets));

        Stack<String> st = new Stack<>();
        st.push("ICN");

        Stack<String> result = dfs(list, st);

        String[] answer = result.stream().toArray(String[]::new);
        return answer;
    }

    public Stack<String> dfs(List<String[]> list, Stack<String> st) {
        if (list.isEmpty()) {
            Stack<String> result = new Stack<>();
            for (String s : st) {
                result.push(s);
            }

            return result;
        }

        List<Stack<String>> resultList = new ArrayList<>();
        String arrive = st.peek();

        for (int i = 0; i < list.size(); i++) {
            String[] tic = list.get(i);
            if (!arrive.equals(tic[0])) {
                continue;
            }

            st.push(tic[1]);
            list.remove(tic);

            Stack<String> next = dfs(list, st);

            st.pop();
            list.add(i, tic);

            if (!next.isEmpty()) {
                resultList.add(next);
            }
        }

        Stack<String> max = new Stack<>();

        for (Stack<String> res : resultList) {
            if (max.isEmpty()) {
                max = res;
                continue;
            }

            for (int i = 0; i < res.size(); i++) {
                String s1 = res.get(i);
                String s2 = max.get(i);
                int compare = s1.compareTo(s2);

                if (compare == 0) {
                    continue;
                }

                if (compare < 0) {
                    max = res;
                }

                break;
            }
        }

        return max;
    }
}