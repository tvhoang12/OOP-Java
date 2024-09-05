import java.util.Scanner;

public class j01005 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            int height = sc.nextInt();
            for (int i = 1; i < n; i++) {
                System.out.printf("%.6f ", Math.sqrt((double) i / n) * height);
            }
            System.out.println();
        }
        sc.close();
    }
}