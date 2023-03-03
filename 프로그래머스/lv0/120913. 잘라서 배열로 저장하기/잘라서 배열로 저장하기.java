import java.util.ArrayList;
class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> arrayList = new ArrayList();
        int firstStr = 0;
        int lastStr = n;
        String str = "";
        while (firstStr < my_str.length()) {
            if (lastStr > my_str.length()) {
                str = my_str.substring(firstStr);
            } else {
                str = my_str.substring(firstStr, lastStr);
            }
            arrayList.add(str);
            str = "";
            firstStr += n;
            lastStr += n;
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }
}
