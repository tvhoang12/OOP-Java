import java.math.BigInteger;
import java.util.Scanner;

public class j03013 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t --> 0) {
            String big = sc.nextLine();
            String small = sc.nextLine();

            int tmp = Math.max(big.length(), small.length());

            BigInteger a = new BigInteger(big);
            BigInteger b = new BigInteger(small);

            System.out.println(a.subtract(b));
        // }
    }
    
}
