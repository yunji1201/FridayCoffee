import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
public int solution(int k, int[][] dungeons) {
        int n = dungeons.length;
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }

        int maxExploredDungeons = 0;

        do {
            int currentFatigue = k;
            int exploredDungeons = 0;

            for (int index : indices) {
                int minRequiredFatigue = dungeons[index][0];
                int fatigueConsumed = dungeons[index][1];

                if (currentFatigue >= minRequiredFatigue) {
                    currentFatigue -= fatigueConsumed;
                    exploredDungeons++;
                } else {
                    break;
                }
            }

            maxExploredDungeons = Math.max(maxExploredDungeons, exploredDungeons);
        } while (nextPermutation(indices));

        return maxExploredDungeons;
    }

    private static boolean nextPermutation(ArrayList<Integer> indices) {
        int i = indices.size() - 1;
        while (i > 0 && indices.get(i - 1) >= indices.get(i)) {
            i--;
        }

        if (i <= 0) {
            return false;
        }

        int j = indices.size() - 1;
        while (indices.get(j) <= indices.get(i - 1)) {
            j--;
        }

        int temp = indices.get(i - 1);
        indices.set(i - 1, indices.get(j));
        indices.set(j, temp);

        j = indices.size() - 1;
        while (i < j) {
            temp = indices.get(i);
            indices.set(i, indices.get(j));
            indices.set(j, temp);
            i++;
            j--;
        }

        return true;
    }
}