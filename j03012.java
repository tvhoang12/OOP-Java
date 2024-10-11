import java.math.BigInteger;
import java.util.Scanner;

public class j03012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            String a = sc.next();
            // String b = sc.next();

            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger("11");

            if(bigA.mod(bigB).toString().equals("0")) {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }

        sc.close();
    }
}
