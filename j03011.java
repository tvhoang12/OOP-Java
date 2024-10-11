import java.math.BigInteger;
import java.util.Scanner;

public class j03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0) {
            String a = sc.next();
            String b = sc.next();

            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);
            
            bigA = bigA.gcd(bigB);

            System.out.println(bigA);
        }
        
        sc.close();
    }
}