import java.util.Scanner;

public class j04013 {
    static class tuyensinh {
        private String sid, name;
        private float diem1, diem2, diem3, tongdiem;

        tuyensinh() {
        }
        tuyensinh (String sid, String name, float diem1, float diem2, float diem3) {
            this.sid = sid;
            this.name = name;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
            this.tongdiem = diem1 * 2 + diem2 + diem3;
        }
        public String getUuTien() {
            if(sid.substring(0, 3).equals("KV1")) {
                return "0.5";
            } else if(sid.substring(0, 3).equals( "KV2")) {
                return "1";
            } else {
                return "2.5";
            }
        }
        
        public boolean check() {
            return tongdiem + Float.parseFloat(getUuTien()) >= 24;
        }
        public String gettongdiem() {
            if(tongdiem % 1 == 0) {
                return String.valueOf((int) tongdiem);
            } else {
                return String.valueOf(tongdiem);
            }
        }
        @Override
        public String toString() {
            return String.format("%s %s %s %s %s", sid, name, getUuTien(), gettongdiem(), check() ? "TRUNG TUYEN" : "TRUOT");
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        tuyensinh ts = new tuyensinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(ts);
        sc.close();
    }
}
