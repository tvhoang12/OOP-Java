import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class j02104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] adj = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                adj[i][j] = sc.nextInt();
            }
        }
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(adj[i][j] == 1) {
                    res.add("(" + (i+1) + "," + (j+1) + ")");
                }
            }
        }
        for(String s : res) {
            System.out.println(s);
        }
        sc.close();
    }
}