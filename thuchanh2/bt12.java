import java.util.Scanner;

public class bt12 {
    class theloai {
        private String ten, matl;
        private static int count = 1;
        theloai() {
        }
        public theloai(String ten) {
            this.ten = ten;
            this.matl = "TL%03d".formatted(count);
            count ++;
        }

    }
    class phim extends theloai{
        private String tenphim, ngay, maph;
        private int thoiluong;
        private static int count = 1;
        phim() {
        }
        public phim(String ten, String matl, String tenphim, String ngay, int thoiluong) {
            super(ten);
            this.maph = "P%02d".formatted(count);
            this.tenphim = tenphim;
            this.ngay = ngay;
            this.thoiluong = thoiluong;
        }
        public String getTL() {
            return super(ten);
        }

        public void display() {
            System.out.printf("%s %s %s %s %d\n", maph, getTL(), tenphim, ngay, thoiluong);
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        phim [] arr = new phim[m];
        theloai[] arr1 = new theloai[n];
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
        }
    }
}
