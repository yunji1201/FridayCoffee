class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int countP = 0, countY = 0; 

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') countP++;
            else if (s.charAt(i) == 'y') countY++;
        }
        
        if(countP == 0 && countY == 0) return true;
        return countP == countY;
    }
}