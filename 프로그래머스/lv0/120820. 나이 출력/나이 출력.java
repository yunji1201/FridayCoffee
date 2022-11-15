class Solution {
    private static final int THIS_YEAR = 2022; 
    
    public int solution(int age) {
        int answer = 0;
        
        if(age > 0 && age <= 120){
            answer = THIS_YEAR - age + 1;
        }
        return answer;
    }
}