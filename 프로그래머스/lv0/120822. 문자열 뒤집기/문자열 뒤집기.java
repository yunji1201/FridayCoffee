class Solution {
    public String solution(String my_string) {
        String answer = "";
        int l = 0;
        String[] str = my_string.split("");
        String[] str2 = new String[my_string.length()];
        for (int i = str.length - 1; i >= 0; i--) {
            for (int k = l; k < str.length; k++) {
                str2[k] = str[i];
                l++;
                break;
            }
        }
        for(String s : str2){
            answer+= s;
        }
        return answer;
    }
}