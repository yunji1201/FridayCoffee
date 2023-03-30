import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int boat = 0;
        int light = 0;
        int heavy = people.length - 1;

        Arrays.sort(people);
        while (light <= heavy) {
            if (people[light] + people[heavy] <= limit) {
                light++;
            }
            heavy--;
            boat++;
        }
        return boat;
    }
}