import java.util.Scanner;

public class j08026 {
    public static int solve(int s, int t) {
        if(s >= t) return s - t;
        if(t % 2 == 1) return 1 + solve(s, t + 1);
        return 1 + solve(s, t >> 1);
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(solve(m, n));
        }
        sc.close();
    }
}
