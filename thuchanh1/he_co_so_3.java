package thuchanh1;

import java.util.Scanner;

public class he_co_so_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            boolean check = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') {
                    check = false;
                    break;
                }
            }
            System.out.println(check ? "YES" : "NO");
            
        }
    }
}
