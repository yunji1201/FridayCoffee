package com.fridayCoffee._84_dfsTest;

import java.util.HashSet;
import java.util.Set;

// 230330 목요일 - 책임님께 간단하게 DFS 예제에 대해 설명을 들었다. 비록 자바스크립트로 들었지만은,,
public class DFS {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        Set<String> set = new HashSet<>();
        boolean[] visited = new boolean[list.length];
        dfs("", list, set, visited);

        System.out.println(set);
    }

    public static void dfs(String str, int[] list, Set<String> set, boolean[] visited) {
        if (str.length() == 3) {
            set.add(str);
            return;
        }

        for (int i = 0; i < list.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(str + Integer.toString(list[i]), list, set, visited);
                visited[i] = false;
            }
        }
    }
}

/*
<자바스크립트 dfs 간단한 예제 배운거>
* function solution(list) {
    const set = new Set();
    const visited = [];

    function dfs(str) { // 1, 11
        if (str.length === 3) {
            set.add(str);
            return;
        }

        for (let i = 0; i < list.length; i += 1) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(str + String(list[i])); // 11, 12, 13, 14, 15, 111, 121, 131
                visited[i] = false;
            }
        }
    }

    dfs('');

    return set;
}

console.log(solution([1,2,3,4,5]));
* */