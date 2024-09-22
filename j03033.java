import java.util.Scanner;
import java.math.BigInteger;

public class j03033 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            BigInteger n = sc.nextBigInteger();
            BigInteger m = sc.nextBigInteger();
            System.out.println(n.multiply(m).divide(n.gcd(m)));
        }
        sc.close();
    }
}
