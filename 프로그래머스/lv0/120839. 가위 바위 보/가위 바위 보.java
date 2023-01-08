class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (String s : rsp.split("")) {
            switch (s) {
                case "2":
                    answer += "0";
                    break;
                case "5":
                    answer += "2";
                    break;
                case "0":
                    answer += "5";
                    break;
            }
        }
        return answer;
    }
}