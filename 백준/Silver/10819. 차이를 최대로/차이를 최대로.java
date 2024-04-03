import java.util.*;
import java.io.*;

public class Main{
    public static int n;
    public static int[] arr;
    public static int[] ans;
    public static boolean[] visit;
    public static int result;
    public static void dfs(int cnt){
        
        if(cnt == n) {
            int sum = 0;
            for(int i = 0; i < n-1; i++) {
                sum += Math.abs(ans[i] - ans[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }
        
        for(int i = 0; i < n; i++) {
            if(!visit[i]){
                ans[cnt] = arr[i];
                visit[i] = true;
                dfs(cnt + 1);
                visit[i] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];
        ans = new int[n];
        visit = new boolean[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        dfs(0);
        System.out.println(result);
    }
    
}