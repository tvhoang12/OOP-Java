package code_on_class;
import java.util.*;

public class nhap_tu_ban_phim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a + b) + " " +  (a - b) + " " + (a * b)+ " "+ (a % b));
        int t = sc.nextInt();
        sc.nextLine();
        String c = sc.nextLine();
        System.out.println(c);
        System.out.println(t);
        sc.close();
    }
}
