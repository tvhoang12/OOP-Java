import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class DangNhap {
    private String username, password;
    public DangNhap() {}
    public DangNhap(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean check(DangNhap dn) {
        return this.username.equals(dn.username) && this.password.equals(dn.password);
    }

}
public class ktradangnhap {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DangNhap> dsdn = new ArrayList<>();
        int n = sc.nextInt();
        while (n --> 0) {
            DangNhap dn = new DangNhap(sc.next(), sc.next());
            dsdn.add(dn);
        }
        int [] count = new int[dsdn.size()];
        n = sc.nextInt();
        while (n --> 0) {
            DangNhap dn = new DangNhap(sc.next(), sc.next());
            for(int i = 0; i < dsdn.size(); i++) {
                if(dsdn.get(i).check(dn)) {
                    count[i]++;
                    break;
                }
            }
        }

        for (int i: count) {
            System.out.print(i + " ");
        }

    }
}
