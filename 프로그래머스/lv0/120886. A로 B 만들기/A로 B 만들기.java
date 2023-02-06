import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        String sortedBefore = new String(beforeChar);
        String sortedAfter = new String(afterChar);
        return sortedAfter.equals(sortedBefore) ? 1 : 0;
    }
}