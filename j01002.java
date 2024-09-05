import java.util.Scanner;
public class j01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        // sc.close();
        while (t-- > 0) {
            long n = sc.nextInt();
            long sum = 0;
            sum = n * (n + 1) / 2;
            System.out.println(sum);
        }
        sc.close();
    }
}
