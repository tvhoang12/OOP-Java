import java.util.*;;
public class j01004 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0) {
            long a = sc.nextLong();
            if (a < 2) {
                System.out.println("NO");
                continue;
            }
            boolean check = true;
            for (long i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
