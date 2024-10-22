import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;

public class j07058 {
    class monthi {
        private String mamn, tenmon, hinhthucthi;

        public monthi() {}
        public monthi(String mamn, String tenmon, String hinhthucthi) {
            this.mamn = mamn;
            this.tenmon = tenmon;
            this.hinhthucthi = hinhthucthi;
        }

        public String getMamn() {
            return mamn;
        }

        public boolean bigger(monthi m) {
            return this.hinhthucthi.compareTo(m.mamn) > 0;
        }
        @Override
        public String toString() {
            return String.format("%s %s %s", mamn, tenmon, hinhthucthi);
        }
    }
    public static void main(String [] args) {
        try {
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int t = sc.nextInt();
            monthi [] m = new monthi[t];
            sc.nextLine();
            while(t --> 0) {
                m[t] = new j07058().new monthi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            Collections.sort(Arrays.asList(m), (a, b) -> a.bigger(b) ? 1 : -1);
            for(monthi i : m) {
                System.out.println(i.toString());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
