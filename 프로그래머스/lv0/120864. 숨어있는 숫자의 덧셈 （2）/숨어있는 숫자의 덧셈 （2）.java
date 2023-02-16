class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split("");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].matches("[^\\d]")) {
                my_string = my_string.replace(strArr[i], ",");
            }
        }
        for (String s : my_string.split(",")) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}