import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class j07002 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            try {
                System.out.println(s);
            }
            catch (Exception e) {}
        }
        sc.close();
    }
}
