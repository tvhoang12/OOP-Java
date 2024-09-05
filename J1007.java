import java.util.Scanner;

public class J1007 {
    static boolean fibo(long n) {
        if(n < 3) {
            return true;
        }
        else {
            long a = 1, b = 1, c = 0;
            while(c < n) {
                c = a + b;
                a = b;
                b = c;
            }
            return c == n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte t = sc.nextByte();
        while (t -- > 0) {
            long n = sc.nextLong();

            System.out.println(fibo(n) ? "YES" : "NO");
        }
        sc.close();
    }
}