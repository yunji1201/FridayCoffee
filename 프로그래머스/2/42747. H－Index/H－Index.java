import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        int hindex = 0;
        
        Arrays.sort(citations);
        
        for (int i = citations.length - 1; i >= 0; i--) {
            int h = citations.length - i; 
            System.out.println(h);
            
            if (citations[i] >= h) {
              hindex = h;  
            }
            
        }
        
        return hindex;
    }
}