import java.math.BigInteger;
import java.util.Scanner;

public class j03039 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            String a = sc.next();
            String b = sc.next();
            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);
            boolean check = false;

            if("0" == bigA.mod(bigB).toString()) {
                check = true;
            }
            else if ("0" == bigB.mod(bigA).toString()) {
                check = true;
            }

            System.out.println(check ? "YES" : "NO");
        }
    }
    
}
