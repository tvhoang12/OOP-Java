import java.util.ArrayList;
import java.util.Scanner;

public class j02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] adj = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                adj[i][j] = sc.nextInt();
            }
        }
        String[] res = new String[n];
        for(int i = 0; i < n; i++) {
            res[i] = String.format("List(%d) = ", i + 1);

            for(int j = 0; j < n; j++) {
                if(adj[i][j] == 1) {
                    res[i] += (j+1) + " ";
                }
            }
        }
        for(String s : res) {
            System.out.println(s);
        }
        sc.close();
    }
}