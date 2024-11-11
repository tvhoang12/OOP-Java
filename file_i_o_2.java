import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class file_i_o_2 {
    public static void main(String[] args) throws IOException {
        long sum = 0;
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()) {
            String str = sc.next();
            try {
                sum += Integer.parseInt(str);
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(sum);
    }
}