import java.util.Scanner;

public class j01022 {
    
    static long[] lengths = new long[93];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lengths[1] = 1;
        lengths[2] = 1;
        for (int i = 3; i < 93; i++) {
            lengths[i] = lengths[i - 2] + lengths[i - 1];
        }

        int t = sc.nextInt(); 

        while (t --> 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();

            System.out.println(findCharacter(N, K));
        }

        sc.close();
    }

    static char findCharacter(int n, long k) {
        if (n == 1) return '0';
        if (n == 2) return '1';

        if (k <= lengths[n - 2]) {
            return findCharacter(n - 2, k);
        } else {
            return findCharacter(n - 1, k - lengths[n - 2]);
        }
    }
}
