import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> users = new HashMap<>();

        for (String[] info : db) {
            users.put(info[0], info[1]);
        }
        
        return users.containsKey(id_pw[0]) ? (users.get(id_pw[0]).equals(id_pw[1]) ? "login" : "wrong pw") : "fail";
        
    }
}