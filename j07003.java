import java.io.File;
import java.util.Scanner;
import java.math.BigInteger;
import java.io.IOException;
public class j07003 {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();

        while(s.length() > 1) {
            BigInteger bigA = new BigInteger(s.substring(0, s.length() / 2));
            BigInteger bigB = new BigInteger(s.substring(s.length() / 2));
            s = bigA.add(bigB).toString();

            System.out.println(s);
        }

        sc.close();
    }
    
}
