import java.util.Scanner;

public class j08026 {
    static int mincount = Integer.MAX_VALUE;
    public static void solve(int s, int t, int count) {
        if(s == t) {
            mincount = Math.min(mincount, count);
            return;
        }
        if(s > t) {
            solve(s - 1, t, count);
        }
        solve(s * 2, t, count + 1);
        solve(s - 1, t, count + 1);
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            mincount = Integer.MAX_VALUE;
            solve(m, n, 0);
            System.out.println(mincount);
        }
        sc.close();
    }
}
